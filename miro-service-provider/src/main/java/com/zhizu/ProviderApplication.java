package com.zhizu;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * @Author zhuaijun
 * @Description //TODO
 * @Date 2020/5/20
 **/
@EnableDubbo(scanBasePackages = "com.zhizu")
@SpringBootApplication
public class ProviderApplication {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(ProviderApplication.class, args);
        System.out.println("Provider启动完成");
    }
}
