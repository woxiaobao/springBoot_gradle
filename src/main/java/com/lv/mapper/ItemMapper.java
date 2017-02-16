package com.lv.mapper;


import lv.com.domain.Item;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * Created by lvbaolin on 2017/1/20.
 */
//@Repository
public interface ItemMapper {

    List<Item> selectItem(HashMap<?, ?> hashMap);


    int count(HashMap<?, ?> hashMap);
}
