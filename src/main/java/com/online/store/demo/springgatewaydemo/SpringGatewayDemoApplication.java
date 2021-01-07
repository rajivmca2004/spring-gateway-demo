package com.online.store.demo.springgatewaydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;

import reactor.core.publisher.Mono;

@SpringBootApplication
public class SpringGatewayDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGatewayDemoApplication.class, args);
	}
	
//	@Bean
//	KeyResolver userKeyResolver() {
//	    return exchange -> Mono.just(exchange.getRequest().getQueryParams().getFirst("user"));
//	}
	
	@Bean
    KeyResolver userKeyResolver() {
        return exchange -> Mono.just("1");
    }

}
