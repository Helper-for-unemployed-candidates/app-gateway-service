package com.jobhunter.appgatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AppGatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppGatewayServiceApplication.class, args);
    }

}
