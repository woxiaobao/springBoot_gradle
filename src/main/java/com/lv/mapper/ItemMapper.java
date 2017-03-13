package com.lv.mapper;


import com.lv.domain.Item;
import org.mybatis.spring.annotation.MapperScan;

import java.util.HashMap;
import java.util.List;

/**
 * Created by lvbaolin on 2017/1/20.
 */
@MapperScan
public interface ItemMapper {

    List<Item> selectItem(HashMap<?, ?> hashMap);


    int count(HashMap<?, ?> hashMap);
}
