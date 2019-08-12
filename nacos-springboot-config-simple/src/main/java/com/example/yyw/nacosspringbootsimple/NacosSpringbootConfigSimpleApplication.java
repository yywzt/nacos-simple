package com.example.yyw.nacosspringbootsimple;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@NacosPropertySource(dataId = "example", groupId = "test", autoRefreshed = true)
public class NacosSpringbootConfigSimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosSpringbootConfigSimpleApplication.class, args);
    }

}
