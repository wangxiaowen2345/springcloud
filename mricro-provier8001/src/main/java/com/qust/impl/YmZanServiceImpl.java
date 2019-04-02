package com.qust.impl;


import com.qust.entity.YmZan;
import com.qust.mapper.YmZanMapper;
import com.qust.service.YmZanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class YmZanServiceImpl implements YmZanService {

    private static final Logger logger = LoggerFactory.getLogger(YmZanServiceImpl.class);

    @Autowired
    private YmZanMapper ymZanMapper;


    public int add(YmZan m) {
        return ymZanMapper.insertSelective(m);
    }

    public List<YmZan> list() {
        return ymZanMapper.list();
    }
}
