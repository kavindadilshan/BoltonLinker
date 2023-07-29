/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bolton.oom.notifier.controller;

import com.bolton.oom.notifier.dto.ResponseDTO;
import com.bolton.oom.notifier.dto.SubscriptionDetailsDTO;
import com.bolton.oom.notifier.store.impl.SubscriptionStoreImpl;

/**
 *
 * @author Kevin Boy
 */
public class SubscriptionController implements SuperController{
    private final SubscriptionStoreImpl subscriptionStoreImpl ;

    public SubscriptionController() {
        subscriptionStoreImpl = new SubscriptionStoreImpl();
    }
    
    public ResponseDTO subscriptionProcessManagement (SubscriptionDetailsDTO subscriptionDetailsDTO){
        return subscriptionStoreImpl.save(subscriptionDetailsDTO);
    }
    
    
}
