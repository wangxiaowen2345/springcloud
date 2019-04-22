package com.qust.controller;

import com.qust.clientservice.YmZanClientService;
import com.qust.common.ErrorEnum;
import com.qust.common.Result;
import com.qust.common.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class YmZanController_Consumer {

    @Autowired
    private YmZanClientService ymZanService;

    @RequestMapping(value="/consumer/activity/list/{page}")
    public Result list (@PathVariable("page") Integer page){
        return ResultUtils.result(ErrorEnum.SUCCESS,this.ymZanService.list(page));
    }

}
