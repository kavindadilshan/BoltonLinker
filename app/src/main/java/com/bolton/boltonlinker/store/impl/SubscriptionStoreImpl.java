/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bolton.boltonlinker.store.impl;

import static com.bolton.boltonlinker.constants.Constants.USER_UNSUBSCRIBED;
import com.bolton.boltonlinker.dto.ResponseDTO;
import com.bolton.boltonlinker.dto.SubscribedUsersDTO;
import com.bolton.boltonlinker.dto.SubscriptionDetailsDTO;
import com.bolton.boltonlinker.dto.UserDTO;
import com.bolton.boltonlinker.store.SuperStore;
import java.util.ArrayList;

/**
 *
 * @author Kevin Boy
 */
public class SubscriptionStoreImpl implements SuperStore<SubscriptionDetailsDTO> {

    private static final ArrayList<SubscriptionDetailsDTO> subscribedList = new ArrayList<>();

    @Override
    public synchronized ResponseDTO save(SubscriptionDetailsDTO subscriptionDetailsDTO) {
        SubscriptionDetailsDTO availableObj = null;
        for (SubscriptionDetailsDTO subcriptionObj : subscribedList) {
            if ((subscriptionDetailsDTO.getPublisherId() == subcriptionObj.getPublisherId()) && (subscriptionDetailsDTO.getSubscriberId()== subcriptionObj.getSubscriberId())) {
                availableObj = subcriptionObj;
            }
        }

        if (availableObj == null) {
            subscribedList.add(subscriptionDetailsDTO);
        }

        return new ResponseDTO(true, subscriptionDetailsDTO);
    }

    @Override
    public synchronized ResponseDTO remove(SubscriptionDetailsDTO subscriptionDetailsDTO) {
        for (int i = 0; i < subscribedList.size(); i++) {
            SubscriptionDetailsDTO obj = subscribedList.get(i);
            if ((subscriptionDetailsDTO.getPublisherId() == obj.getPublisherId())) {
                subscribedList.remove(obj);
            }
        }
        return new ResponseDTO(true, USER_UNSUBSCRIBED, subscriptionDetailsDTO);
    }

    @Override
    public synchronized ResponseDTO getAllData() {
        return new ResponseDTO(true, subscribedList);
    }

    @Override
    public synchronized ResponseDTO findBy(SubscriptionDetailsDTO subscriptionDetailsDTO) {
        try {
            ArrayList<SubscribedUsersDTO> arrayList = new ArrayList<>();
            ResponseDTO response = new UserStoreImpl().getAllData();
            ArrayList<UserDTO> userDTOs = (ArrayList<UserDTO>) response.getData();
            userDTOs.forEach(item -> {
                if (item.getId() == subscriptionDetailsDTO.getPublisherId()) {
                    return;
                }

                SubscribedUsersDTO tempList = new SubscribedUsersDTO();
                boolean isFound = false;
                UserDTO tempObj = null;

                for (SubscriptionDetailsDTO obj : subscribedList) {
                    if ((subscriptionDetailsDTO.getPublisherId() == obj.getPublisherId()) && (obj.getSubscriberId() == item.getId())) {
                        isFound = true;
                        tempObj = item;
                    }
                }
                tempList.setUserDTO(!isFound ? item : tempObj);
                tempList.setIsSubscribed(isFound);
                arrayList.add(tempList);
            });
            return new ResponseDTO(true, arrayList);
        } catch (Exception e) {
            return new ResponseDTO(false, e.getMessage(), null);
        }

    }

    public synchronized ResponseDTO getSubscribersIds(long userId) {
        ArrayList<Long> subscribersIdList = new ArrayList<>();
        for (SubscriptionDetailsDTO obj : subscribedList) {
            if (userId == obj.getSubscriberId()) {
                subscribersIdList.add(obj.getPublisherId());
            }
        }
        return new ResponseDTO(!subscribersIdList.isEmpty(), subscribersIdList);
    }

}
