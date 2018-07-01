package org.fly.commonservicegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.springframework.web.reactive.function.server.RequestPredicates.path;

@SpringBootApplication
@EnableEurekaClient
public class CommonServiceGatewayApplication {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("prices", r -> r.path("/prices")
                        .filters(f -> f.stripPrefix(1))
                        .uri("http://localhost:8090"))
                .build();

    }
    public static void main(String[] args) {
        SpringApplication.run(CommonServiceGatewayApplication.class, args);
    }
}
