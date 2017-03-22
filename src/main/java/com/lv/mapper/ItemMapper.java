package com.lv.mapper;


import com.lv.domain.Item;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

/**
 * Created by lvbaolin on 2017/1/20.
 */
@Mapper
public interface ItemMapper {

    List<Item> selectItem(HashMap<?, ?> hashMap);


    int count(HashMap<?, ?> hashMap);
}
