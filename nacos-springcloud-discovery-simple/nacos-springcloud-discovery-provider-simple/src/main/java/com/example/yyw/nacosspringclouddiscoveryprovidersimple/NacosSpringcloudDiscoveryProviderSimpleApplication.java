package com.example.yyw.nacosspringclouddiscoveryprovidersimple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosSpringcloudDiscoveryProviderSimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosSpringcloudDiscoveryProviderSimpleApplication.class, args);
    }

}
