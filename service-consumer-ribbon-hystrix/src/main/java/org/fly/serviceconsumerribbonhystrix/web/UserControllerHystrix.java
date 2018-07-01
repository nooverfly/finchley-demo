package org.fly.serviceconsumerribbonhystrix.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2018/6/29.
 */
@RestController
public class UserControllerHystrix {

    @Autowired
    RestTemplate restTemplate;

    @Value("${server.port}")
    String port;

    @GetMapping("/users")
    @HystrixCommand(fallbackMethod="usersByRibbonFallback")
    public String listUsersByRibbon(){
        String result = this.restTemplate.getForObject("http://service-eureka-client/users", String.class);
        return result;
    }

    public String usersByRibbonFallback(){
        return "usersByRibbon异常，端口：" + port;
    }
}
