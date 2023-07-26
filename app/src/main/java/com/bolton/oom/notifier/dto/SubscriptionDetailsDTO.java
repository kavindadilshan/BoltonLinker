/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bolton.oom.notifier.dto;

/**
 *
 * @author Kevin Boy
 */
public class SubscriptionDetailsDTO extends SuperDTO{
    private long subscribeId;
    private long subscriberId;

    public SubscriptionDetailsDTO() {
    }

    public SubscriptionDetailsDTO(long subscribeId, long subscriberId) {
        this.subscribeId = subscribeId;
        this.subscriberId = subscriberId;
    }

    public long getSubscribeId() {
        return subscribeId;
    }

    public long getSubscriberId() {
        return subscriberId;
    }

    public void setSubscribeId(long subscribeId) {
        this.subscribeId = subscribeId;
    }

    public void setSubscriberId(long subscriberId) {
        this.subscriberId = subscriberId;
    }

    @Override
    public String toString() {
        return "SubscriptionDetailsDTO{" + "subscribeId=" + subscribeId + ", subscriberId=" + subscriberId + '}';
    }
    
    
}
