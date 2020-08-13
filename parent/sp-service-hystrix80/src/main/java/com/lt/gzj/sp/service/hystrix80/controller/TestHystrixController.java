package com.lt.gzj.sp.service.hystrix80.controller;

import com.lt.gzj.sp.service.hystrix80.client.HystrixTest8001Client;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ProjectName: parent
 * @Package: com.lt.gzj.sp.service.hystrix80.controller
 * @ClassName: gzj
 * @Author: gzj
 * @Description: ${description}
 * @Date: 2020/6/16 9:51
 * @Version: 1.0
 */
@RestController
@RequestMapping("v1/hystrixtest")
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")  //全局降级处理方式
public class TestHystrixController {
    @Autowired
    HystrixTest8001Client hystrixTest8001Client;
    @RequestMapping("test1")
    public String test1(){
        return hystrixTest8001Client.paymentInfo_OK(1);
    }



    @RequestMapping("test2")
    //定制化服务降级处理方式
//    @HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod", commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
//    })
    //全局降级处理方式
    @HystrixCommand
    public String test2(){
        return hystrixTest8001Client.paymentInfo_TimeOut(2);
    }


    private String paymentTimeOutFallbackMethod() {
        return "消费者80，对方支付系统繁忙，或自己运行出错请检查自己，请10秒后再试。";
    }

    /**
     * 全局fallback方法
     *
     * @return
     */
    private String payment_Global_FallbackMethod() {
        return "Global异常处理信息,请稍后再试。";
    }
}
