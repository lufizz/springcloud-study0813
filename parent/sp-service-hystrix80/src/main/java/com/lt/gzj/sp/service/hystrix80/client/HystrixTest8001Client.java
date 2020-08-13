package com.lt.gzj.sp.service.hystrix80.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ProjectName: parent
 * @Package: com.lt.gzj.sp.service.hystrix80.client
 * @ClassName: gzj
 * @Author: gzj
 * @Description: ${description}
 * @Date: 2020/6/16 10:09
 * @Version: 1.0
 */
//@FeignClient(value = "SP-SERVICE-HYSTRIX8001" ,fallback = HystrixTest8001Impl.class)
@FeignClient(value = "SP-SERVICE-HYSTRIX8001")
public interface HystrixTest8001Client {
    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id);

    /**
     * 非正常访问
     *
     * @param id
     * @return
     */
    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(Integer id);

}
