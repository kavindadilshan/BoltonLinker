/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bolton.oom.notifier.store.impl;

import static com.bolton.oom.notifier.constants.Constants.SUCCESS_MSG;
import static com.bolton.oom.notifier.constants.Constants.USER_NOT_FOUND;
import com.bolton.oom.notifier.dto.ResponseDTO;
import com.bolton.oom.notifier.dto.SuperDTO;
import com.bolton.oom.notifier.dto.UserDTO;
import com.bolton.oom.notifier.store.SuperStore;
import java.util.ArrayList;

/**
 *
 * @author Kevin Boy
 */
public class UserStore implements SuperStore<UserDTO>{
    
    private static final ArrayList<UserDTO> signupUserList = new ArrayList<>();

    @Override
    public ResponseDTO save(UserDTO userDTO){
       signupUserList.add(userDTO);
       return new ResponseDTO(true,SUCCESS_MSG,userDTO);
    }

    @Override
    public ResponseDTO remove(UserDTO t){
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ResponseDTO getAllData(){
       return new ResponseDTO(true,signupUserList);
    }

    @Override
    public ResponseDTO findBy(UserDTO userDTO){
        UserDTO objUserDTO = null; 
        for (UserDTO dto : signupUserList){
            if (userDTO.getEmail().equals(dto.getEmail())) {
                objUserDTO = dto;
            }
        }
        if (objUserDTO != null) {
             return new ResponseDTO(true, objUserDTO);
        }else{
            return new ResponseDTO(false, USER_NOT_FOUND, this);
        }
       
    }
    
}
