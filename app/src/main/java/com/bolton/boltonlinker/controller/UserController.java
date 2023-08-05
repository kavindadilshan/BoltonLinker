/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bolton.boltonlinker.controller;

import com.bolton.boltonlinker.dto.ResponseDTO;
import com.bolton.boltonlinker.dto.UserDTO;
import com.bolton.boltonlinker.store.impl.UserStoreImpl;

/**
 *
 * @author Kevin Boy
 */
public class UserController implements SuperController{
    private final UserStoreImpl userStore;

    public UserController() {
        this.userStore = new UserStoreImpl();
    }
    
    public ResponseDTO signupUserHandler(UserDTO userDTO){
        return userStore.save(userDTO);
    }
    
    public ResponseDTO loginUserHandler (UserDTO userDTO){
        ResponseDTO accessible = userStore.findBy(userDTO);
        if (accessible.isSuccess()) {
            UserDTO objUserDTO = (UserDTO) accessible.getData();
            if (!userDTO.getPassword().equalsIgnoreCase(objUserDTO.getPassword())) {
                accessible.setSuccess(false);
            }
        }
        return accessible;
    }
    
}
