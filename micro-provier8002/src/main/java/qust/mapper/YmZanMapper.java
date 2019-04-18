package qust.mapper;

import com.qust.entity.YmZan;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface YmZanMapper {
    int insert(YmZan record);

    int insertSelective(YmZan record);

    List<YmZan> list();
}