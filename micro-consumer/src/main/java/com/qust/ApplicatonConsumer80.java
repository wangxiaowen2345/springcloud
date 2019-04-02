package com.qust;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApplicatonConsumer80 {
    public static void main(String [] args) {
        SpringApplication.run(ApplicatonConsumer80.class ,args);
    }
}
