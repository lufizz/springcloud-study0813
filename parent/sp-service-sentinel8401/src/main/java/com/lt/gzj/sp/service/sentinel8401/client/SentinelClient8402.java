package com.lt.gzj.sp.service.sentinel8401.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "cloud-alibaba-sentinel-service-provider",fallback = SentinelClient8402Impl.class)
public interface SentinelClient8402 {
    @GetMapping("v1/sentinel/testa/{name}")
    public String testA(@PathVariable("name") String name);
}
