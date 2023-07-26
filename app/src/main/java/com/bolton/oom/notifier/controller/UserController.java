/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bolton.oom.notifier.controller;

import com.bolton.oom.notifier.dto.ResponseDTO;
import com.bolton.oom.notifier.dto.UserDTO;
import com.bolton.oom.notifier.store.impl.UserStore;

/**
 *
 * @author Kevin Boy
 */
public class UserController implements SuperController{
    private final UserStore userStore;

    public UserController() {
        this.userStore = new UserStore();
    }
    
    public ResponseDTO signupUserHandler(UserDTO userDTO) throws Exception{
        return userStore.save(userDTO);
    }
    
}
