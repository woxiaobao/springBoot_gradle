package com.lv.controller;


import com.lv.domain.Item;
import com.lv.rabbitmq.Sender;
import com.lv.service.ItemService;
import lv.com.domain.Greeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by LVBAOLIN on 2016/10/20.
 */

@RestController
public class HelloController {
    protected static Logger logger= LoggerFactory.getLogger(HelloController.class);


    @Autowired
    ItemService itemService;

    @Autowired
    private Sender sender;


    @RequestMapping("/rabbit")
    public String rabbit() {

        sender.send();
        logger.info("sender.send();");
        return "ok";
    }




    /**
     * spring boot默认使用json的解析框架是jackson
     * @return
     */
    @RequestMapping("/hello")
    public Greeting list() {

        logger.info("hello everyone!  -i am lvbaolin");
        return new Greeting(1, "frist");
    }

    @RequestMapping("/")
    public String index() {
        logger.info("hello everyone!");
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "/test", produces = "application/json;charset=UTF-8")
    public Map<String, Object> test() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("success", true);
        map.put("data", "your data");
        return map;
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
        System.out.println(items.size());
        for (Item item: items) {
            logger.info(item.getName());
        }

        return "ok";
    }

    // @RequestMapping(value = "/list", method = RequestMethod.GET)
    // public String ceshi(HttpServletRequest request)
    // {
    //     logger.info("hello ModelAndView!");
    //     return "this is data list ----";
    // }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public ModelAndView hello() {

        logger.info("hello() is executed - $name {}");

        ModelAndView model = new ModelAndView();
        model.setViewName("ceshi");

        model.addObject("title", "baolin");
        model.addObject("msg", "hahahah");

        return model;

    }


}
