package com.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import service.HelloService;

/**
 * @program: dubbo-provider-2
 * @description:
 * @author: zh
 * @create: 2019-12-04 13:35
 **/
@Component
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String s) {
        return "hi"+s;
    }


}
