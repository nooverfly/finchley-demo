package org.fly.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2018/6/29.
 */
@RestController
public class UserController {

    @Value("${server.port}")
    String serverPort;

    @GetMapping("/users")
    public String allUsers(){
        List<Map<String, Object>> users = new ArrayList<Map<String, Object>>();
        for (int i=1;i<5;i++){
            Map<String, Object> user = new HashMap<String, Object>();
            user.put("id",i);
            user.put("name","admin"+i);
            user.put("age",17+i);
            users.add(user);
        }
        return "服务器端口号: " + serverPort + "|用户信息: " + users.toString();
    }
}
