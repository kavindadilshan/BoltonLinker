/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bolton.oom.notifier.dto;

import com.bolton.oom.notifier.enums.SubscriptionStatus;

/**
 *
 * @author Kevin Boy
 */
public class SubscribedUsersDTO extends UserDTO{
    private UserDTO userDTO;
    private SubscriptionStatus subscriptionStatus;

    public SubscribedUsersDTO() {
    }

    public SubscribedUsersDTO(UserDTO userDTO, SubscriptionStatus subscriptionStatus) {
        this.userDTO = userDTO;
        this.subscriptionStatus = subscriptionStatus;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public SubscriptionStatus getSubscriptionStatus() {
        return subscriptionStatus;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public void setSubscriptionStatus(SubscriptionStatus subscriptionStatus) {
        this.subscriptionStatus = subscriptionStatus;
    }

    @Override
    public String toString() {
        return "SubscribedUsersDTO{" + "userDTO=" + userDTO + ", subscriptionStatus=" + subscriptionStatus + '}';
    }
    
    
}
