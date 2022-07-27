package com.paddy.study.dubbo.service;

import com.paddy.study.GrpcHelloService1;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @author Pan Yan
 * @date 2022/7/11
 */
@Service
public class HelloService1 {

    @DubboReference(version = "*", loadbalance = "random")
    private GrpcHelloService1 grpcHelloService1;

    public String sayHello(String name) {
        return grpcHelloService1.sayHello(name);
    }

}
