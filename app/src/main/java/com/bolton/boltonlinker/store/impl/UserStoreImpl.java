/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bolton.boltonlinker.store.impl;

import static com.bolton.boltonlinker.constants.Constants.SUCCESS_MSG;
import static com.bolton.boltonlinker.constants.Constants.USER_NOT_FOUND;
import com.bolton.boltonlinker.dto.ResponseDTO;
import com.bolton.boltonlinker.dto.SuperDTO;
import com.bolton.boltonlinker.dto.UserDTO;
import com.bolton.boltonlinker.store.SuperStore;
import java.util.ArrayList;

/**
 *
 * @author Kevin Boy
 */
public class UserStoreImpl implements SuperStore<UserDTO> {

    private static final ArrayList<UserDTO> signupUserList = new ArrayList<>();

    @Override
    public synchronized ResponseDTO save(UserDTO userDTO) {
        signupUserList.add(userDTO);
        return new ResponseDTO(true, SUCCESS_MSG, userDTO);
    }

    @Override
    public synchronized ResponseDTO remove(UserDTO t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public synchronized ResponseDTO getAllData() {
        return new ResponseDTO(true, signupUserList);
    }

    @Override
    public synchronized ResponseDTO findBy(UserDTO userDTO) {
        try {
            UserDTO objUserDTO = null;
            for (UserDTO dto : signupUserList) {
                if (userDTO.getEmail().equals(dto.getEmail())) {
                    objUserDTO = dto;
                }
            }
            if (objUserDTO != null) {
                return new ResponseDTO(true, objUserDTO);
            } else {
                return new ResponseDTO(false, USER_NOT_FOUND, this);
            }
        } catch (Exception e) {
            return new ResponseDTO(false, e.getMessage(), null);
        }

    }

}
