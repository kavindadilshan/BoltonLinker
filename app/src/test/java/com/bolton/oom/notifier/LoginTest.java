/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bolton.oom.notifier;

import com.bolton.oom.notifier.controller.ControllerFactory;
import com.bolton.oom.notifier.controller.UserController;
import com.bolton.oom.notifier.dto.ResponseDTO;
import com.bolton.oom.notifier.dto.UserDTO;
import com.bolton.oom.notifier.enums.ControllerStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


/**
 *
 * @author Kevin Boy
 */
public class LoginTest {
    public final long TEST_ID = 1;
    public final String TEST_EMAIL = "kavindadilshan97@gmail.com";
    public final String TEST_USERNAME = "kavinda";
    public final String TEST_VALID_PASSWORD = "Test@123";
    public final String TEST_INVALID_PASSWORD = "12345678";
    
    private UserController userController;
    
    @BeforeEach
    public void init(){
        userController = (UserController) ControllerFactory.getInstance().getController(ControllerStatus.USER);
    }
    
    @Test
    @DisplayName("Test user login using valid credentials")
    public void testUserLoginUsingValidCredentials(){
        ResponseDTO response = userController.loginUserHandler(new UserDTO(TEST_EMAIL,TEST_VALID_PASSWORD));
        Assertions.assertTrue(response.isSuccess());
    }
    
    @Test
    @DisplayName("Test user login using invalid credentials")
    public void testUserLoginUsingInvalidCredentials(){
        ResponseDTO response = userController.loginUserHandler(new UserDTO(TEST_EMAIL,TEST_INVALID_PASSWORD));
        Assertions.assertFalse(response.isSuccess());
    }
}
