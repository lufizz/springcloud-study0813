package com.lt.gzj.sp.service.stream8001provider.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

/**
 * @ProjectName: parent
 * @Package: com.lt.gzj.sp.service.stream8001provider.Client
 * @ClassName: gzj
 * @Author: gzj
 * @Description: ${description}
 * @Date: 2020/6/22 17:47
 * @Version: 1.0
 */
@FeignClient(value = "sp-service",url = "http://127.0.0.1:9101")
//        url = "http://218.94.136.91:4451"

//)
public interface ISclient  {
//    @PostMapping(value = "/sp9101/gateway.htm")
//    public Map queryQrCode(@RequestBody Map req);
    @PostMapping(value = "/gateway.htm")
    public Map queryQrCode(@RequestBody Map req);
}
