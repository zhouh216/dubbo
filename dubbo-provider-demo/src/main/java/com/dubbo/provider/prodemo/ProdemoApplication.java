package com.dubbo.provider.prodemo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//开启dubbo的自动配置
@EnableDubboConfiguration
public class ProdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProdemoApplication.class, args);
    }

}
