/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bolton.boltonlinker;

import com.bolton.boltonlinker.dto.PostContentDTO;
import com.bolton.boltonlinker.dto.UserDTO;
import com.bolton.boltonlinker.store.impl.ChannelObserverImpl;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Kevin Boy
 */
public class PostPublishTest {
    private ChannelObserverImpl channelObserverImpl;
    private LoginTest loginTest;
    
    @BeforeEach
    public void init(){
        channelObserverImpl = new ChannelObserverImpl();
        loginTest =  new LoginTest();
    }
    
    @Test
    @DisplayName("Test user post publishing")
    public void testUserPostPublishing(){
        UserDTO userDTO = new UserDTO(loginTest.TEST_ID, loginTest.TEST_USERNAME, loginTest.TEST_EMAIL, loginTest.TEST_VALID_PASSWORD);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy hh:mm a ");
        String formateDString = dateFormat.format(new Date());
        channelObserverImpl.informingPostPublishment(new PostContentDTO(formateDString, "TEST POST PUBLISH", userDTO));
    }
    
}
