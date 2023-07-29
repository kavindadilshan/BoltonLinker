/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bolton.oom.notifier.store.impl;

import com.bolton.oom.notifier.store.ChannelObserver;
import com.bolton.oom.notifier.store.ChannelSubject;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Kevin Boy
 */
public class ChannelObserverImpl implements ChannelSubject{    

    private final Set<ChannelObserver> listChannelObservers;

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
    
}
