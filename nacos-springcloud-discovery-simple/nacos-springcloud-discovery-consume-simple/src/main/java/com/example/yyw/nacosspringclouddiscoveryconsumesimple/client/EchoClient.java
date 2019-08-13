package com.example.yyw.nacosspringclouddiscoveryconsumesimple.client;

import feign.hystrix.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author yanzhitao@xiaomalixing.com
 * @date 2019/8/13 15:46
 * @describe
 */
@FeignClient(value = "nacos-springcloud-discovery-provider-simple", fallback = EchoClientFallBack.class)
//@FeignClient(value = "nacos-springcloud-discovery-provider-simple", fallbackFactory = EchoClientFallBackFactory.class)
public interface EchoClient {

    @RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
    String echo(@PathVariable String string);
}

@Component
class EchoClientFallBack implements EchoClient {

    @Override
    public String echo(String string) {
        return "error";
    }
}

@Component
class EchoClientFallBackFactory implements FallbackFactory<EchoClient> {

    @Override
    public EchoClient create(Throwable throwable) {
        return new EchoClient() {
            @Override
            public String echo(String string) {
                return "error";
            }
        };
    }
}
