package com.lt.gzj.sp.service.stream8001provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpServiceStream8001providerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpServiceStream8001providerApplication.class, args);
    }

}
