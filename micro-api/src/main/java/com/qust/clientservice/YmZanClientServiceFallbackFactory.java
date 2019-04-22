package com.qust.clientservice;

import com.qust.common.ErrorEnum;
import com.qust.common.Result;
import com.qust.common.ResultUtils;
import feign.hystrix.FallbackFactory;

public class YmZanClientServiceFallbackFactory implements FallbackFactory<YmZanClientService> {
    public YmZanClientService create(Throwable throwable) {
        return new YmZanClientService() {
            public Result list(Integer page) {
                return ResultUtils.result(ErrorEnum.SUCCESS, "暂时不能访问三个月之前的点赞记录！");
            }
        };
    }
}
