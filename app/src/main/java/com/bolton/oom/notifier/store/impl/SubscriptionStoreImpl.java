/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bolton.oom.notifier.store.impl;

import com.bolton.oom.notifier.dto.ResponseDTO;
import com.bolton.oom.notifier.dto.SubscribedUsersDTO;
import com.bolton.oom.notifier.dto.SubscriptionDetailsDTO;
import com.bolton.oom.notifier.dto.UserDTO;
import com.bolton.oom.notifier.store.SuperStore;
import java.util.ArrayList;

/**
 *
 * @author Kevin Boy
 */
public class SubscriptionStoreImpl implements SuperStore<SubscriptionDetailsDTO>{
    
    private static final ArrayList<SubscriptionDetailsDTO> subscribedList = new ArrayList<>();

    @Override
    public ResponseDTO save(SubscriptionDetailsDTO subscriptionDetailsDTO){
       subscribedList.add(subscriptionDetailsDTO);
       return new ResponseDTO(true,subscriptionDetailsDTO);
    }

    @Override
    public ResponseDTO remove(SubscriptionDetailsDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ResponseDTO getAllData(){
        return new ResponseDTO(true,subscribedList);
    }

    @Override
    public ResponseDTO findBy(SubscriptionDetailsDTO subscriptionDetailsDTO){
        ArrayList<SubscribedUsersDTO> arrayList = new ArrayList<>();
        ResponseDTO response = new UserStoreImpl().getAllData();
        ArrayList<UserDTO>  userDTOs = (ArrayList<UserDTO>) response.getData();
        userDTOs.forEach(item -> {
            if (item.getId() == subscriptionDetailsDTO.getPublisherId()) {
                return;
            }
            
            SubscribedUsersDTO tempList = new SubscribedUsersDTO();
            boolean isFound = false;
            UserDTO tempObj = null;
            
            for (SubscriptionDetailsDTO obj : subscribedList){
                if ((subscriptionDetailsDTO.getPublisherId() == obj.getPublisherId()) && (obj.getSubscriberId() == item.getId())) {
                    isFound = true;
                    tempObj = item;
                }
            }
            tempList.setUserDTO(!isFound ? item : tempObj);
            tempList.setIsSubscribed(isFound);
            arrayList.add(tempList);
        });
        return new ResponseDTO(true,arrayList);
    }
    
}
