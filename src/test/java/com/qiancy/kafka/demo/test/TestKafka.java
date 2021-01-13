package com.qiancy.kafka.demo.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.kafka.core.KafkaTemplate;

/**
 * 功能简述：
 *
 * @author qiancy
 * @create 2021/1/11
 * @since 1.0.0
 */
public class TestKafka  {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext();
        KafkaTemplate<String, String> kafkaTemplate = (KafkaTemplate<String, String>) context.getBean("kafkaTemplate");

        kafkaTemplate.send("qiancytest","hello spring kafka");

    }

}
