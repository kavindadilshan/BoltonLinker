/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bolton.boltonlinker.store;

import com.bolton.boltonlinker.dto.ResponseDTO;
import com.bolton.boltonlinker.dto.SuperDTO;

/**
 *
 * @author Kevin Boy
 * @param <T>
 */
public interface SuperStore <T extends SuperDTO>{
    public ResponseDTO save(T t) throws Exception;
    public ResponseDTO remove(T t) throws Exception;
    public ResponseDTO getAllData () throws Exception;
    public ResponseDTO findBy (T t) throws Exception;
}
