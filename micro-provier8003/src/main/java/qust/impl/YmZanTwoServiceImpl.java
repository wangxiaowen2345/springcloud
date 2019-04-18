package qust.impl;


import com.qust.entity.YmZan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qust.mapper.YmZanMapper;
import qust.service.YmZanService;

import java.util.List;


@Service
public class YmZanTwoServiceImpl implements YmZanService {

    private static final Logger logger = LoggerFactory.getLogger(YmZanTwoServiceImpl.class);

    @Autowired
    private YmZanMapper ymZanMapper;


    public int add(YmZan m) {
        return ymZanMapper.insertSelective(m);
    }

    public List<YmZan> list() {
        return ymZanMapper.list();
    }
}
