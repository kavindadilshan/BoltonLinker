/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bolton.oom.notifier;

import com.bolton.oom.notifier.controller.ControllerFactory;
import com.bolton.oom.notifier.controller.SubscriptionController;
import com.bolton.oom.notifier.dto.ResponseDTO;
import com.bolton.oom.notifier.dto.SubscriptionDetailsDTO;
import com.bolton.oom.notifier.enums.ControllerStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Kevin Boy
 */
public class SubscribeProcessTest {
    private SubscriptionController subscriptionController;
    
    public final long subscriberUserId = 1;
    public final long subscribedUserId = 4;
    
    @BeforeEach
    public void init(){
        subscriptionController = (SubscriptionController) ControllerFactory.getInstance().getController(ControllerStatus.SUBSCRIBE);
    }
    
    @Test
    @DisplayName("Test user subscribe a user")
    public void testUserSubscribeUser() {
        ResponseDTO response = subscriptionController.subscriptionProcessManagement(new SubscriptionDetailsDTO(subscribedUserId,subscriberUserId));
        Assertions.assertTrue(response.isSuccess());
    }
    
    @Test
    @DisplayName("Test user unsubscribe a user")
    public void testUserUnsubscribeUser() {
        ResponseDTO response = subscriptionController.subscriptionProcessManagement(new SubscriptionDetailsDTO(subscribedUserId,subscriberUserId));
        Assertions.assertTrue(response.isSuccess());
    }
    
}
