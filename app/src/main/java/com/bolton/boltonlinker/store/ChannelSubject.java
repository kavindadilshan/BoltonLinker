/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bolton.boltonlinker.store;

/**
 *
 * @author Kevin Boy
 */
public interface ChannelSubject<T> {
     public void addObserver(ChannelObserver channelObserver);
     public void removeObserver(ChannelObserver channelObserver);
     public void informingAccCreation(T t);
     public void informingPostPublishment(T t);
}
