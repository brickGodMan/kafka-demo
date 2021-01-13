package com.qiancy.kafka.demo.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * 功能简述：
 *
 * @author qiancy
 * @create 2021/1/13
 * @since 1.0.0
 */
@Component
public class Consumer {

    @KafkaListener(topics = "qiancytest",groupId = "myGroup")
    public void listener(ConsumerRecord<String,String> record) {
        String value = record.value();
        System.out.println(String.format("收到消息：%s",value));
    }
}
