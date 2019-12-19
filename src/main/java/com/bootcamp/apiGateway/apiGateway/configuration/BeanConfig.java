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
                .route(r -> r.path("/savingAccount/**")
                        /* .filters(f -> f.rewritePath("/api/student/(?.*)", "/${remains}")
                                 .addRequestHeader("X-first-Header", "first-service-header")
                                 .hystrix(c -> c.setName("hystrix")
                                         .setFallbackUri("forward:/fallback/student")))*/
                        .uri("lb://SERVICE-SAVINGACCOUNT/")
                        .id("service-savingAccount"))
                .route(r -> r.path("/fixedTermAccount/**")
                        /* .filters(f -> f.rewritePath("/api/student/(?.*)", "/${remains}")
                                 .addRequestHeader("X-first-Header", "first-service-header")
                                 .hystrix(c -> c.setName("hystrix")
                                         .setFallbackUri("forward:/fallback/student")))*/
                        .uri("lb://SERVICE-FIXEDTERMACCOUNT/")
                        .id("service-fixedTermAccount"))
                .route(r -> r.path("/currentAccount/**")
                        /* .filters(f -> f.rewritePath("/api/student/(?.*)", "/${remains}")
                                 .addRequestHeader("X-first-Header", "first-service-header")
                                 .hystrix(c -> c.setName("hystrix")
                                         .setFallbackUri("forward:/fallback/student")))*/
                        .uri("lb://SERVICE-CURRENTACCOUNT/")
                        .id("service-currentAccount"))
                .route(r -> r.path("/creditPersonal/**")
                        /* .filters(f -> f.rewritePath("/api/student/(?.*)", "/${remains}")
                                 .addRequestHeader("X-first-Header", "first-service-header")
                                 .hystrix(c -> c.setName("hystrix")
                                         .setFallbackUri("forward:/fallback/student")))*/
                        .uri("lb://SERVICE-CREDITPERSONAL/")
                        .id("service-creditPersonal"))
                .route(r -> r.path("/creditCompany/**")
                        /* .filters(f -> f.rewritePath("/api/student/(?.*)", "/${remains}")
                                 .addRequestHeader("X-first-Header", "first-service-header")
                                 .hystrix(c -> c.setName("hystrix")
                                         .setFallbackUri("forward:/fallback/student")))*/
                        .uri("lb://SERVICE-CREDITCOMPANY/")
                        .id("service-creditCompany"))
                .route(r -> r.path("/creditCard/**")
                        /* .filters(f -> f.rewritePath("/api/student/(?.*)", "/${remains}")
                                 .addRequestHeader("X-first-Header", "first-service-header")
                                 .hystrix(c -> c.setName("hystrix")
                                         .setFallbackUri("forward:/fallback/student")))*/
                        .uri("lb://SERVICE-CREDITCARD/")
                        .id("service-creditCard"))
                .route(r -> r.path("/cashAdvance/**")
                        /* .filters(f -> f.rewritePath("/api/student/(?.*)", "/${remains}")
                                 .addRequestHeader("X-first-Header", "first-service-header")
                                 .hystrix(c -> c.setName("hystrix")
                                         .setFallbackUri("forward:/fallback/student")))*/
                        .uri("lb://SERVICE-CASHADVANCE/")
                        .id("service-cashAdvance"))
                .build();
    }

}
