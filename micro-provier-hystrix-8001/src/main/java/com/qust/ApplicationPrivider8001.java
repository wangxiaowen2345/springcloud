package com.qust;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class ApplicationPrivider8001 {


    public static void main(String [] args) {
        SpringApplication.run(ApplicationPrivider8001.class ,args);
    }
}
