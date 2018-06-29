package org.fly.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by admin on 2018/6/29.
 */
@RestController
public class UserClient {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/users")
    public String users() {
        String result = this.restTemplate.getForObject("http://service-eureka-client/users", String.class);
        return result;
    }
}
