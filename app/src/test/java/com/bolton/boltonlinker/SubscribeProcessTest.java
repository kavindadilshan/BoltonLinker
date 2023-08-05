/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bolton.boltonlinker;

import com.bolton.boltonlinker.controller.ControllerFactory;
import com.bolton.boltonlinker.controller.SubscriptionController;
import com.bolton.boltonlinker.dto.ResponseDTO;
import com.bolton.boltonlinker.dto.SubscriptionDetailsDTO;
import com.bolton.boltonlinker.dto.UserDTO;
import com.bolton.boltonlinker.enums.ControllerStatus;
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
    private LoginTest loginTest;
    
    public final long subscriberUserId = 1;
    public final long publisherUserId = 4;
    
    @BeforeEach
    public void init(){
        subscriptionController = (SubscriptionController) ControllerFactory.getInstance().getController(ControllerStatus.SUBSCRIBE);
        loginTest = new LoginTest();
    }
    
    @Test
    @DisplayName("Test user subscribe a user")
    public void testUserSubscribeUser() {
        ResponseDTO response = subscriptionController.subscriptionProcessManagement(new SubscriptionDetailsDTO(subscriberUserId,publisherUserId));
        Assertions.assertTrue(response.isSuccess());
    }
    
    @Test
    @DisplayName("Test user unsubscribe a user")
    public void testUserUnsubscribeUser() {
        ResponseDTO response = subscriptionController.unsubscriptionManagement(new SubscriptionDetailsDTO(subscriberUserId,publisherUserId));
        Assertions.assertTrue(response.isSuccess());
    }
    
    @Test
    @DisplayName("Subscription details for login user")
    public void getSubscriptionDetailsByTestUserId(){
        ResponseDTO response = subscriptionController.getAllSubscriptionsForUser(new UserDTO(loginTest.TEST_EMAIL,loginTest.TEST_VALID_PASSWORD));
        Assertions.assertEquals("all subscription details for login user" ,response.getData());
    }
    
}
