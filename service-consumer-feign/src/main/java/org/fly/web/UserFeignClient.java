package org.fly.web;

import org.fly.service.UserFeignConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2018/6/29.
 */
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
