package com.dubbo.provider.prodemo.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import service.HelloService;
import service.HelloService2;

/**
 * @program: dubbo-provider-demo
 * @description: helloService的实现类
 * @author: zh
 * @create: 2019-12-04 10:57
 **/
@Component
@Service
public class HelloServiceImpl implements HelloService {

    @Value("${server.port}")
    private Integer port;
    @Value("${sleepTime}")
    private Long sleepTime;
    @Override
    public String sayHello(String s) {
        System.out.println("进来"+port+"端口");
        throw new RuntimeException();
//        try {
//            Thread.sleep(sleepTime);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//        return "你是真的皮"+port;
    }
}
