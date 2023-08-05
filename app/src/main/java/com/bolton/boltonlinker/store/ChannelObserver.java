/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bolton.boltonlinker.store;

import com.bolton.boltonlinker.dto.PostContentDTO;
import com.bolton.boltonlinker.dto.UserDTO;

/**
 *
 * @author Kevin Boy
 */
public interface ChannelObserver {
    public void notifyPostCreation(PostContentDTO postContentDTO);
    public void notifyAccountCreation(UserDTO userDTO);
}
