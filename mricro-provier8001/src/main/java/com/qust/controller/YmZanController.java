package com.qust.controller;


import com.qust.service.YmZanService;
import com.qust.utils.ErrorEnum;
import com.qust.utils.Result;
import com.qust.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YmZanController {
    @Autowired
    YmZanService ymZanService;



    @RequestMapping(value="list/{page}",method = RequestMethod.GET)
    public Result list(@PathVariable(value = "page") Integer page) throws Exception{
        return  ResultUtils.result(ErrorEnum.SUCCESS, ymZanService.list());
    }
}
