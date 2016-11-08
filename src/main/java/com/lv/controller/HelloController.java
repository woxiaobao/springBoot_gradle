package com.lv.controller;


import com.lv.utils.RedisUtil;
import lv.com.domain.Greeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;


/**
 * Created by LVBAOLIN on 2016/10/20.
 */

@RestController
public class HelloController {
    protected static Logger logger= LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public Greeting list() {


        logger.info("hello everyone!");
        return new Greeting(1, "frist");
    }

    @RequestMapping("/")
    public String index() {
        logger.info("hello everyone!");
        return "Greetings from Spring Boot!";
    }





}
