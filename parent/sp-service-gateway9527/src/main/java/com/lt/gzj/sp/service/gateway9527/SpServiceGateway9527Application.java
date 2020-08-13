package com.lt.gzj.sp.service.gateway9527;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
public class SpServiceGateway9527Application {

    public static void main(String[] args) {
        SpringApplication.run(SpServiceGateway9527Application.class, args);
    }

}
