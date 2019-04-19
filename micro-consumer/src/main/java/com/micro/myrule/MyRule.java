package com.micro.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRule {

    /**
     * 不能放到@ComponentScan 包 及其子包下，会起不到自定义效果
     * @return
     */
    @Bean
    public IRule MyRule(){
        return new MySelfRule();
    }
}
