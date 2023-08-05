/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bolton.boltonlinker.dto;

import java.io.Serializable;

/**
 *
 * @author Kevin Boy
 */
public class ResponseDTO implements Serializable{
    private boolean success;
    private String message;
    private Object data;

    public ResponseDTO() {
    }

    public ResponseDTO(boolean success, String message, Object data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public ResponseDTO(boolean success, Object data) {
        this.success = success;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseDTO{" + "success=" + success + ", message=" + message + ", data=" + data + '}';
    }
    
    
    
}
