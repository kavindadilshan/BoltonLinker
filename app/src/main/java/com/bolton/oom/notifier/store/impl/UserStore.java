/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bolton.oom.notifier.store.impl;

import static com.bolton.oom.notifier.constants.Caonstants.SUCCESS_MSG;
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
    public ResponseDTO remove(UserDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ResponseDTO getAllData() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ResponseDTO findBy(UserDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
