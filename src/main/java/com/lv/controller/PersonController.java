package com.lv.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by lvbaolin on 2017/2/21.
 */

@Controller
@RequestMapping(value = {"","/person"})
public class PersonController {


    @RequestMapping(value = "create")
    public String create(HttpServletRequest request){
        request.getSession().setAttribute("name","lvbaolin");
        return "person/create";
    }


}
