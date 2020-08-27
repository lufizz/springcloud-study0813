package com.lt.gzj.sp.service.sentinel8401;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpServiceSentinel8401Application {

    public static void main(String[] args) {
        SpringApplication.run(SpServiceSentinel8401Application.class, args);
    }

}
