package com.bolton.oom.notifier;

import com.bolton.oom.notifier.controller.ControllerFactory;
import com.bolton.oom.notifier.controller.UserController;
import com.bolton.oom.notifier.dto.ResponseDTO;
import com.bolton.oom.notifier.dto.UserDTO;
import com.bolton.oom.notifier.enums.ControllerStatus;
import java.util.function.BooleanSupplier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kevin Boy
 */
public class SignUpTest {
    public final long TEST_ID = 1;
    public final String TEST_EMAIL = "kavindadilshan97@gmail.com";
    public final String TEST_PASSWORD = "Test@123";
    public final String TEST_USERNAME = "kavinda";
    private UserController userController;
    
    @BeforeEach
    public void init(){
        userController = (UserController) ControllerFactory.getInstance().getController(ControllerStatus.USER);    
    }
    
    @Test
    @DisplayName("Test Sign up new user using valid credentials")
    public void testSignupNewUserUsingValidCredentials(){
        ResponseDTO response = userController.signupUserHandler(new UserDTO(TEST_ID,TEST_USERNAME,TEST_EMAIL,TEST_PASSWORD));
        Assertions.assertTrue(response.isSuccess());
    }
    
    @Test
    @DisplayName("Test signup new user with already registered email")
    public void testSignupNewUserWithAlreadyExistEmail(){
        ResponseDTO response = userController.signupUserHandler(new UserDTO(TEST_ID,TEST_USERNAME,TEST_EMAIL,TEST_PASSWORD));
        Assertions.assertEquals("email has been already exist", response.getMessage());
    }
    
}
