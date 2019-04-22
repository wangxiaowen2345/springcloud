package com.qust.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class ApplicationPrivider9001 {


    public static void main(String [] args) {
        SpringApplication.run(ApplicationPrivider9001.class ,args);
    }
}
