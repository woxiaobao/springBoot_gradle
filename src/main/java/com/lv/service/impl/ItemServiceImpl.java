package com.lv.service.impl;


import com.lv.mapper.ItemMapper;
import com.lv.service.ItemService;
import lv.com.domain.Item;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by lvbaolin on 2017/1/20.
 */

@Service("itemService")
public class ItemServiceImpl implements ItemService {

//    @Resource
//    ItemMapper itemMapper;


    @Override
    public List<Item> findItems(HashMap<String, Object> hashMap) throws Exception {
//        List<Item> items = itemMapper.selectItem(hashMap);
        List<Item> items = new ArrayList<Item>();
        return items;
    }

//    @Override
//    public int add(Item item) {
//
////        int id = itemMapper.insertSelective(item);
////        return id;
//        int id = 1;
//        return id;
//    }
//
//    @Override
//    public Item findOne(int id) {
//        LemonCustomer customer =  itemMapper.selectByPrimaryKey(id);
//        return customer;
//    }

//    public int update(LemonCustomer record)
//    {
//        int result = lemonCustomerMapper.updateByPrimaryKeySelective(record);
//        return  result;
//    }

    @Override
    public int count(HashMap<String, Object> hashMap) {
//        int c = itemMapper.count(hashMap);
        int c = 10;
        return c;
    }
}
