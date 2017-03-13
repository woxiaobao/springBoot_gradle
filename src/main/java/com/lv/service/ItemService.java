package com.lv.service;

import com.lv.domain.Item;

import java.util.HashMap;
import java.util.List;

/**
 * Created by lvbaolin on 2017/1/20.
 */

//@Service
public interface ItemService {

    List<Item> findItems(HashMap<String, Object> hashMap) throws Exception;

//    int add(Item item);
//
//    Item findOne(int id);
//
//    int update(Item item);

    int count(HashMap<String, Object> hashMap);
}
