package com.paddy.study;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Pan Yan
 * @date 2022/7/11
 */
@EnableDubbo
@SpringBootApplication(scanBasePackages = {"com.paddy.study"})
public class Dubbo3ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Dubbo3ConsumerApplication.class, args);
    }

}
