/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bolton.boltonlinker.dto;

/**
 *
 * @author Kevin Boy
 */
public class SubscriptionDetailsDTO extends SuperDTO{
    private long subscribeId;
    private long subscriberId;
    private long publisherId;

    public SubscriptionDetailsDTO() {
    }

    public SubscriptionDetailsDTO(long subscribeId, long subscriberId, long publisherId) {
        this.subscribeId = subscribeId;
        this.subscriberId = subscriberId;
        this.publisherId = publisherId;
    }

    public SubscriptionDetailsDTO(long subscriberId, long publisherId) {
        this.subscriberId = subscriberId;
        this.publisherId = publisherId;
    }

    public long getSubscribeId() {
        return subscribeId;
    }

    public long getSubscriberId() {
        return subscriberId;
    }

    public long getPublisherId() {
        return publisherId;
    }

    public void setSubscribeId(long subscribeId) {
        this.subscribeId = subscribeId;
    }

    public void setSubscriberId(long subscriberId) {
        this.subscriberId = subscriberId;
    }

    public void setPublisherId(long publisherId) {
        this.publisherId = publisherId;
    }

    @Override
    public String toString() {
        return "SubscriptionDetailsDTO{" + "subscribeId=" + subscribeId + ", subscriberId=" + subscriberId + ", publisherId=" + publisherId + '}';
    }
}
