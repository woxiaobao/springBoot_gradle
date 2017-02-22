package com.lv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lvbaolin on 2017/2/21.
 */

@Controller
@RequestMapping(value = {"","/person"})
public class PersonController {

    @RequestMapping(value = "create")
    public String create(){
        return "person/create";
    }


}
