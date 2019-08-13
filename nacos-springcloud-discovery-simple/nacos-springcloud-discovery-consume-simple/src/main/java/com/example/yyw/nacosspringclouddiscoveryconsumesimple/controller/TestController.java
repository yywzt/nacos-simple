package com.example.yyw.nacosspringclouddiscoveryconsumesimple.controller;

import com.example.yyw.nacosspringclouddiscoveryconsumesimple.client.EchoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author yanzhitao@xiaomalixing.com
 * @date 2019/8/12 20:57
 * @describe
 */
@RestController
public class TestController {

    private final RestTemplate restTemplate;

    @Autowired
    EchoClient echoClient;

    @Autowired
    public TestController(RestTemplate restTemplate) {this.restTemplate = restTemplate;}

    @RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
    public String echo(@PathVariable String str) {
        return restTemplate.getForObject("http://nacos-springcloud-discovery-provider-simple/echo/" + str, String.class);
    }

    @RequestMapping(value = "/feign/echo/{str}", method = RequestMethod.GET)
    public String feignEcho(@PathVariable String str) {
        return echoClient.echo(str);
    }
}
