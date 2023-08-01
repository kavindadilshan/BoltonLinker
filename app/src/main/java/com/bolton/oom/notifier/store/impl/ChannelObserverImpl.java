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
        subscriptionController = new SubscriptionController();
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
        System.out.println(":::::::::::::::"+object);
        for(ChannelObserver channelObserver : listChannelObservers){
            channelObserver.notifyAccountCreation((UserDTO) object);
        }
    }

    @Override
    public synchronized void informingPostPublishment(Object object) {
        for(ChannelObserver channelObserver : listChannelObservers){
           
            Home home = (Home) channelObserver;
           
            PostContentDTO postContentDTO = (PostContentDTO) object;
             System.out.println("@@@@@@@@@@@"+home.getLoggedUserDetails().getId()+ "$$$$$$$$$$$$$$$$$$"+postContentDTO.getAuthor().getId());
            if (postContentDTO.getAuthor().getId() == home.getLoggedUserDetails().getId()) {
                System.out.println("home user posting:::::::"+postContentDTO);
                channelObserver.notifyPostCreation(postContentDTO);
            }else{
                System.out.println("----------------------------------------------");
                ResponseDTO subscribers = subscriptionController.getSubscribersIdManager(postContentDTO.getAuthor().getId());
                System.out.println("##########"+subscribers);
                if (subscribers.isSuccess()) {
                    ArrayList<Long>subscribersIdList=(ArrayList<Long>) subscribers.getData();
                    System.out.println("++++++++++++++"+subscribersIdList);
                    subscribersIdList.forEach(item->{
                        if (home.getLoggedUserDetails().getId() == item) {
                            System.out.println("subscribe user posting:::::::"+postContentDTO);
                            channelObserver.notifyPostCreation(postContentDTO);
                        }
                    });
                }
            }
        }
    }
    
    
}
