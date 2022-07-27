package com.paddy.study.controller;

import com.paddy.study.dubbo.service.GrpcHelloService;
import com.paddy.study.dubbo.service.HelloService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pan Yan
 * @date 2022/7/12
 */
@RestController
@RequestMapping("/api/dubbo")
public class Dubbo3Controller {

    @Autowired
    private GrpcHelloService grpcHelloService;
    @Autowired
    private HelloService1 helloService1;

    @CrossOrigin
    @GetMapping("/sayHello")
    public String sayHello(String name){

        return grpcHelloService.sayHello(name);
    }

    @CrossOrigin
    @GetMapping("/sayHello1")
    public String sayHello1(String name){

        return helloService1.sayHello(name);
    }

}
