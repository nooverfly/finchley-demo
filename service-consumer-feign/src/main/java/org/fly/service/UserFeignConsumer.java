package org.fly.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by admin on 2018/6/29.
 */
@FeignClient(name="service-eureka-client")
public interface UserFeignConsumer {

    @GetMapping("/users")
    public String getUsers();
}
