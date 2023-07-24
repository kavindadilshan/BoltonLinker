/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bolton.oom.notifier.dto;

/**
 *
 * @author Kevin Boy
 */
public class PostContentDTO {
    private String dateAndTime;
    private String postTitle;
    private UserDTO author;

    public PostContentDTO() {
    }

    public PostContentDTO(String dateAndTime, String postTitle, UserDTO author) {
        this.dateAndTime = dateAndTime;
        this.postTitle = postTitle;
        this.author = author;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public UserDTO getAuthor() {
        return author;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public void setAuthor(UserDTO author) {
        this.author = author;
    }
    
}
