package com.qust;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.qust.clientservice"})
public class ApplicatonConsumerFeign80 {
    public static void main(String [] args) {
        SpringApplication.run(ApplicatonConsumerFeign80.class ,args);
    }
}
