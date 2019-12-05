package com.bootcamp.apiGateway.apiGateway.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/person/**")
                        /* .filters(f -> f.rewritePath("/api/student/(?.*)", "/${remains}")
                                 .addRequestHeader("X-first-Header", "first-service-header")
                                 .hystrix(c -> c.setName("hystrix")
                                         .setFallbackUri("forward:/fallback/student")))*/
                        .uri("lb://SERVICE-PERSONS/")
                        .id("service-persons"))
                .route(r -> r.path("/company/**")
                        /* .filters(f -> f.rewritePath("/api/student/(?.*)", "/${remains}")
                                 .addRequestHeader("X-first-Header", "first-service-header")
                                 .hystrix(c -> c.setName("hystrix")
                                         .setFallbackUri("forward:/fallback/student")))*/
                        .uri("lb://SERVICE-COMPANY/")
                        .id("service-company"))
                .build();

    }

}
