package com.paddy.study.dubbo.service;

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.demo.DemoService;
import org.apache.dubbo.demo.HelloReply;
import org.apache.dubbo.demo.HelloRequest;
import org.springframework.stereotype.Service;

/**
 * @author Pan Yan
 * @date 2022/7/11
 */
@Service
public class GrpcHelloService {

    @DubboReference(version = "*", loadbalance = "random")
    private DemoService demoService;

    public String sayHello(String name) {

        HelloRequest request = HelloRequest.newBuilder().setName(name).build();
        HelloReply reply = demoService.sayHello(request);
        return reply.getMessage();
    }

}
