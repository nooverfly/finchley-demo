package org.fly.serviceconsumerfeignhystrix.web;

import org.fly.serviceconsumerfeignhystrix.service.UserFeignConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserFeignClient {

    @Autowired
    private UserFeignConsumer userFeignConsumer;

    @GetMapping("/users")
    public String ListUsers(){
        String users = this.userFeignConsumer.getUsers();
        return users;
    }
}
