package com.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.HelloService;

/**
 * @program: dubbo-consumer
 * @description:
 * @author: zh
 * @create: 2019-12-04 11:01
 **/
@RestController
public class HelloController {
    //重试机制
    @Reference(timeout = 3000,retries = 1)
    private HelloService helloService;
    //dubbo的负载均衡策略
//    @Reference(check = false)
//    private HelloService2 helloService2;
    @RequestMapping("/hello")
    @HystrixCommand(fallbackMethod = "testError")
    public String hello() {
        String hello = helloService.sayHello("皮皮虾22222");
        System.out.println(helloService.sayHello("皮皮虾"));
//        String s = helloService2.sayHello2("11111");
//        System.out.println(s);
        return hello;
    }

    public String testError(){
        return "系统正忙。。。。请稍后再试";
    }
    
}
