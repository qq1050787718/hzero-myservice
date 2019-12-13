package com.example.hzeromyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HzeroMyserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HzeroMyserviceApplication.class, args);
    }

}
