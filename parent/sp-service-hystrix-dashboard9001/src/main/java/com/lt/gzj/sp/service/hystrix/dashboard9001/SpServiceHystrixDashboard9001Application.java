package com.lt.gzj.sp.service.hystrix.dashboard9001;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableHystrixDashboard
public class SpServiceHystrixDashboard9001Application {

    public static void main(String[] args) {
        SpringApplication.run(SpServiceHystrixDashboard9001Application.class, args);
    }

}
