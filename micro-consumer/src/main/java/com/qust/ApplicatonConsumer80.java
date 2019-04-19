package com.qust;

import com.micro.myrule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICRO-DEMO",configuration = MyRule.class)
public class ApplicatonConsumer80 {
    public static void main(String [] args) {
        SpringApplication.run(ApplicatonConsumer80.class ,args);
    }
}
