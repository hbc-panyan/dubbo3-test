    package com.paddy.study.demo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

@javax.annotation.Generated(
value = "by Dubbo generator",
comments = "Source: HelloService.proto")
public interface DemoService {
static final String JAVA_SERVICE_NAME = "com.paddy.study.demo.DemoService";
static final String SERVICE_NAME = "demoservice.DemoService";

    // FIXME, initialize Dubbo3 stub when interface loaded, thinking of new ways doing this.
    static final boolean inited = DemoServiceDubbo.init();

    com.paddy.study.demo.HelloReply sayHello(com.paddy.study.demo.HelloRequest request);

    CompletableFuture<com.paddy.study.demo.HelloReply> sayHelloAsync(com.paddy.study.demo.HelloRequest request);


}
