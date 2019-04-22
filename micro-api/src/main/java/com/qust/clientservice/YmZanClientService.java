package com.qust.clientservice;

import com.qust.common.Result;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(value = "MICRO-DEMO")
public interface YmZanClientService {

    @RequestMapping(value="list/{page}",method = RequestMethod.GET)
    public Result list(@PathVariable(value = "page") Integer page);
}
