package org.fly.serviceconsumerfeignhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ServiceConsumerFeignHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceConsumerFeignHystrixApplication.class, args);
    }
}
