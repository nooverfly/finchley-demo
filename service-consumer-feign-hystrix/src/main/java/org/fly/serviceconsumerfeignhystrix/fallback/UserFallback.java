package org.fly.serviceconsumerfeignhystrix.fallback;

import org.fly.serviceconsumerfeignhystrix.service.UserFeignConsumer;

public class UserFallback implements UserFeignConsumer {
    @Override
    public String getUsers() {
        // TODO Auto-generated method stub
        return "服务调用失败";
    }
}
