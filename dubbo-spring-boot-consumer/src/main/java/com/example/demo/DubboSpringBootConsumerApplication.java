package com.example.demo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableDubbo
@EnableHystrix
@SpringBootApplication
public class DubboSpringBootConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboSpringBootConsumerApplication.class, args);
    }

}
