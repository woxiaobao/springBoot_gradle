package com.lv.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


/**
 * Created by LVBAOLIN on 2016/10/19.
 */
@SpringBootApplication(scanBasePackages= "com")
//@EnableAspectJAutoProxy
//@EnableAutoConfiguration
public class Application {


    public static void main(String[] args) {
         SpringApplication.run(Application.class, args);
    }
}
