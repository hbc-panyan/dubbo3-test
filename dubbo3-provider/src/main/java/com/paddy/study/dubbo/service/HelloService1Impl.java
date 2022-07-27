package com.paddy.study.dubbo.service;

import com.paddy.study.GrpcHelloService1;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author Pan Yan
 * @date 2022/7/11
 */
@DubboService
public class HelloService1Impl implements GrpcHelloService1 {


    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
