/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bolton.oom.notifier.store.impl;

import com.bolton.oom.notifier.controller.SubscriptionController;
import com.bolton.oom.notifier.dto.PostContentDTO;
import com.bolton.oom.notifier.dto.ResponseDTO;
import com.bolton.oom.notifier.dto.UserDTO;
import com.bolton.oom.notifier.store.ChannelObserver;
import com.bolton.oom.notifier.store.ChannelSubject;
import com.bolton.oom.notifier.view.Home;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Kevin Boy
 */
public class ChannelObserverImpl implements ChannelSubject{    

    private final Set<ChannelObserver> listChannelObservers;
    private final SubscriptionController subscriptionController;

    public ChannelObserverImpl(){
        listChannelObservers = new HashSet<>();
    }
    
    @Override
    public void addObserver(ChannelObserver channelObserver) {
        listChannelObservers.add(channelObserver);
    }

    @Override
    public void removeObserver(ChannelObserver channelObserver) {
        listChannelObservers.remove(channelObserver);
    }

    @Override
    public void informingAccCreation(Object object) {
        for(ChannelObserver channelObserver : listChannelObservers){
            channelObserver.notifyAccountCreation((UserDTO) object);
        }
    }

    @Override
    public void informingPostPublishment(Object object) {
        for(ChannelObserver channelObserver : listChannelObservers){
            Home home = (Home) channelObserver;
            PostContentDTO postContentDTO = (PostContentDTO) object;
            if (postContentDTO.getAuthor().getId() == home.getLoggedUserDetails().getId()) {
                channelObserver.notifyPostCreation(postContentDTO);
            }else{
                ResponseDTO subscribers = subscriptionController .getSubscribersIdManager(postContentDTO.getAuthor().getId());
                if (subscribers.isSuccess()) {
                    ArrayList<Long>subscribersIdList=(ArrayList<Long>) subscribers.getData();
                    subscribersIdList.forEach(item->{
                        if (home.getLoggedUserDetails().getId() == item) {
                            channelObserver.notifyPostCreation(postContentDTO);
                        }
                    });
                }
            }
        }
    }
    
    
}
