package com.paddy.study.dubbo.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.demo.DemoService;
import org.apache.dubbo.demo.HelloReply;
import org.apache.dubbo.demo.HelloRequest;
import java.util.concurrent.CompletableFuture;

/**
 * @author Pan Yan
 * @date 2022/7/11
 */
@DubboService
public class GrpcHelloServiceImpl implements DemoService {

    @Override
    public HelloReply sayHello(HelloRequest request) {
        System.out.println("provider");
        return HelloReply.newBuilder().setMessage("Hello, " + request.getName()).build();
    }

    @Override
    public CompletableFuture<HelloReply> sayHelloAsync(HelloRequest request) {
        System.out.println("provider");
        return CompletableFuture.completedFuture(sayHello(request));
    }

}
