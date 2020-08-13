package com.lt.gzj.sp.service.hystrix8001.controller;

import com.lt.gzj.sp.service.hystrix8001.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: parent
 * @Package: com.lt.gzj.sp.service.hystrix8001.controller
 * @ClassName: gzj
 * @Author: gzj
 * @Description: ${description}
 * @Date: 2020/6/16 10:16
 * @Version: 1.0
 */
@RestController
@RequestMapping("payment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;
    /**
     * 正常访问
     *
     * @param id
     * @return
     */
    @GetMapping("/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
        final String result = paymentService.paymentInfo_OK(id);
        return result;
    }

    /**
     * 非正常访问
     *
     * @param id
     * @return
     */
    @GetMapping("/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
        final String result = paymentService.paymentInfo_TimeOut(id);
        return result;
    }

    /**
     * 服务熔断
     * http://localhost:8001/payment/circuit/1
     *
     * @param id
     * @return
     */
    @GetMapping("/circuit/{id}")
    @HystrixCommand
    public String paymentCircuitBreaker(@PathVariable("id") Integer id) {
        String result = paymentService.paymentCircuitBreaker(id);
        return result;
    }


    @GetMapping("/get/{id}")
    public String getHahaha(@PathVariable("id") Integer id) {
        return "hahaha";
    }

    @GetMapping("/lb/{id}")
    public String getNonono(@PathVariable("id") Integer id) {
        return "NoNoNo";
    }
}
