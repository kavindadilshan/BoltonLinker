/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bolton.oom.notifier.controller;

import com.bolton.oom.notifier.enums.ControllerStatus;

/**
 *
 * @author Kevin Boy
 */
public class ControllerFactory {
    private static ControllerFactory controllerFactory;

    public ControllerFactory() {
    }
    
    /**
     *
     * @return
     */
    public static ControllerFactory getInstance(){
        if (controllerFactory == null) {
            controllerFactory = new ControllerFactory();
        }
        return controllerFactory;
    }
    
    public SuperController getController(ControllerStatus controllerStatus){
        switch (controllerStatus) {
            case USER:
                return new UserController();
            default:
                throw new AssertionError();
        }
    }
    
}
