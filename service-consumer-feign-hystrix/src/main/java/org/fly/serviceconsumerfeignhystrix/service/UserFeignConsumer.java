package org.fly.serviceconsumerfeignhystrix.service;

import org.fly.serviceconsumerfeignhystrix.fallback.UserFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by admin on 2018/6/29.
 */
@FeignClient(name="service-eureka-client", fallback = UserFallback.class)
public interface UserFeignConsumer {

    @GetMapping("/users")
    public String getUsers();
}
