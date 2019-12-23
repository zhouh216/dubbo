package com.dubbo.provider.prodemo.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import service.HelloService2;

/**
 * @program: dubbo-provider-demo
 * @description:
 * @author: zh
 * @create: 2019-12-04 14:20
 **/
@Component
@Service
public class HelloServiceImpl2 implements HelloService2 {
    @Value("${server.port}")
    private Integer port;
    @Override
    public String sayHello2(String s) {
        return "hello111111"+s+"端口号为:"+port;
    }
}
