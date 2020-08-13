package com.lt.gzj.sp.service.hystrix80.client;

import org.springframework.stereotype.Component;

/**
 * @ProjectName: parent
 * @Package: com.lt.gzj.sp.service.hystrix80.client
 * @ClassName: gzj
 * @Author: gzj
 * @Description: ${description}
 * @Date: 2020/6/16 10:21
 * @Version: 1.0
 */
@Component
public class HystrixTest8001Impl implements HystrixTest8001Client {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService fall back--paymentInfo_OK";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----PaymentFallbackService fall back--paymentInfo_TimeOut";
    }
}
