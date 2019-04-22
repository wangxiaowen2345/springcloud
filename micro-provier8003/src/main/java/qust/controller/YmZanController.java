package qust.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import qust.common.Result;
import qust.service.YmZanService;
import qust.utils.ErrorEnum;
import qust.utils.ResultUtils;

@RestController
public class YmZanController {
    @Autowired
    YmZanService ymZanService;


    @RequestMapping(value="list/{page}",method = RequestMethod.GET)
    public Result list(@PathVariable(value = "page") Integer page) throws Exception{
        return  ResultUtils.result(ErrorEnum.SUCCESS, "8003");
    }
}
