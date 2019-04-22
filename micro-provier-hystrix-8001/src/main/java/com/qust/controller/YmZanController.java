package com.qust.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.qust.entity.YmZan;
import com.qust.service.YmZanService;
import com.qust.utils.ErrorEnum;
import com.qust.utils.Result;
import com.qust.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class YmZanController {
    @Autowired
    YmZanService ymZanService;

    @RequestMapping(value="list/{page}",method = RequestMethod.GET)
    @HystrixCommand(defaultFallback = "nullHystrix")//一旦调用服务信息失败并抛出了错误信息后，会自动调用@HystrixCommand指定的方法
    public Result list(@PathVariable(value = "page") Integer page) throws Exception{
        List<YmZan> ymZans = ymZanService.list();
        if (null==ymZans)
            throw new RuntimeException("未查找到数据！");
        return  ResultUtils.result(ErrorEnum.SUCCESS, ymZans);
    }


    public Result nullHystrix(@PathVariable(value = "page") Integer page){
        return  ResultUtils.result(ErrorEnum.SUCCESS, "未查找到数据");
    }

}
