package com.lt.gzj.sp.service.hystrix80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
public class SpServiceHystrix80Application {

    public static void main(String[] args) {
        SpringApplication.run(SpServiceHystrix80Application.class, args);
    }

}
