package com.lt.gzj.sp.service.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.lt.gzj.sp.service.order.mappers.**")
@SpringBootApplication
public class SpServiceOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpServiceOrderApplication.class, args);

//        DocsConfig config = new DocsConfig();
//        config.setProjectPath("F:\\github\\springcloud-study\\parent"); // 项目根目录
//        config.setProjectName("parent-sp"); // 项目名称
//        config.setApiVersion("V1.0");       // 声明该API的版本
////        config.setDocsPath("your api docs path"); // 生成API 文档所在目录
//        config.setAutoGenerate(Boolean.TRUE);  // 配置自动生成
//        Docs.buildHtmlDocs(config); // 执行生成文档
    }

}
