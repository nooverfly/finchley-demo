package org.fly.commonservicezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class CommonServiceZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonServiceZuulApplication.class, args);
    }
}
