/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bolton.boltonlinker.controller;

import com.bolton.boltonlinker.dto.ResponseDTO;
import com.bolton.boltonlinker.dto.SubscriptionDetailsDTO;
import com.bolton.boltonlinker.dto.UserDTO;
import com.bolton.boltonlinker.store.impl.SubscriptionStoreImpl;

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
    
    public ResponseDTO getAllSubscriptionsForUser (UserDTO userDTO){
        return subscriptionStoreImpl.findBy(new SubscriptionDetailsDTO(0,userDTO.getId()));
    }
    
    public ResponseDTO getSubscribersIdManager(long userId){
        return subscriptionStoreImpl.getSubscribersIds(userId);
    }
    
    public ResponseDTO unsubscriptionManagement (SubscriptionDetailsDTO subscriptionDetailsDTO){
        return subscriptionStoreImpl.remove(subscriptionDetailsDTO);
    }
}
