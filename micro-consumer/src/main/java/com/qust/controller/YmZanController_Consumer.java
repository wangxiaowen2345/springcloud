package com.qust.controller;

import com.qust.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class YmZanController_Consumer {
    private static final String REST_URL_PREFIX="http://MICRO-DEMO";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value="/consumer/activity/list/{page}")
    public Result list (@PathVariable("page") Integer page){
        return restTemplate.getForObject(REST_URL_PREFIX+"/list/"+page,Result.class);
    }

}
