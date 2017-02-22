package com.lv.controller;


import com.lv.service.ItemService;
import lv.com.domain.Greeting;
import lv.com.domain.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;


/**
 * Created by LVBAOLIN on 2016/10/20.
 */

@RestController
public class HelloController {
    protected static Logger logger= LoggerFactory.getLogger(HelloController.class);


    @Resource
    ItemService itemService;

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


    @RequestMapping("/excep")
    public String excep() throws Exception {

        throw new Exception("发生错误");
    }


    @RequestMapping("/add")
    public String add(String name,Integer age) throws Exception {

        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        logger.info("hello everyone!");
//        userMapper.insert(name, age);
        List<Item> items = itemService.findItems(hashMap);
        for (Item item: items) {
            logger.info(item.getName());
        }

        return "ok";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String ceshi(HttpServletRequest request)
    {
        logger.info("hello ModelAndView!");
        return "ceshi";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView hello() {

        logger.info("hello() is executed - $name {}");

        ModelAndView model = new ModelAndView();
        model.setViewName("ceshi");

        model.addObject("title", "baolin");
        model.addObject("msg", "hahahah");

        return model;

    }


}
