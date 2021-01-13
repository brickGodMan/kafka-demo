package com.qiancy.kafka.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * 功能简述：
 *
 * @author qiancy
 * @create 2021/1/13
 * @since 1.0.0
 */
@Service
public class TestService {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void test() {
        System.out.println("------start-------");
        kafkaTemplate.send("qiancytest","hello kafka spring");
        System.out.println("------end-------");
    }
}
