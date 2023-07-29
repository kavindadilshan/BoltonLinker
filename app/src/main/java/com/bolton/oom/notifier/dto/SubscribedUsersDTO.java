/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bolton.oom.notifier.dto;

/**
 *
 * @author Kevin Boy
 */
public class SubscribedUsersDTO extends UserDTO{
    private UserDTO userDTO;
    private boolean isSubscribed;

    public SubscribedUsersDTO() {
    }

    public SubscribedUsersDTO(UserDTO userDTO, boolean isSubscribed) {
        this.userDTO = userDTO;
        this.isSubscribed = isSubscribed;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public boolean isIsSubscribed() {
        return isSubscribed;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public void setIsSubscribed(boolean isSubscribed) {
        this.isSubscribed = isSubscribed;
    }

    @Override
    public String toString() {
        return "SubscribedUsersDTO{" + "userDTO=" + userDTO + ", isSubscribed=" + isSubscribed + '}';
    }    
}
