package com.qiancy.kafka.demo.controller;

import com.qiancy.kafka.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 功能简述：
 *
 * @author qiancy
 * @create 2021/1/13
 * @since 1.0.0
 */
@Controller
public class TestController {
    @Autowired
    private TestService service;


    @RequestMapping(value = "/test")
    public String test() {

        service.test();
        return "success";
    }
}
