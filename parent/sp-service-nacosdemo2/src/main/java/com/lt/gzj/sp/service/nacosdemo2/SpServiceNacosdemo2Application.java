package com.lt.gzj.sp.service.nacosdemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpServiceNacosdemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpServiceNacosdemo2Application.class, args);
    }

}
