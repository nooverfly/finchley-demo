package org.fly.servicesessionredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceSessionRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceSessionRedisApplication.class, args);
    }
}
