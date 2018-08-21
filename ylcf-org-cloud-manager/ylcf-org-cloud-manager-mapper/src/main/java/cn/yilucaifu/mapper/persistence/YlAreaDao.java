package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.YlArea;
import cn.yilucaifu.domain.YlAreaExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface YlAreaDao {
    long countByExample(YlAreaExample example);

    int deleteByExample(YlAreaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YlArea record);

    int insertSelective(YlArea record);

    List<YlArea> selectByExample(YlAreaExample example);

    YlArea selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YlArea record, @Param("example") YlAreaExample example);

    int updateByExample(@Param("record") YlArea record, @Param("example") YlAreaExample example);

    int updateByPrimaryKeySelective(YlArea record);

    int updateByPrimaryKey(YlArea record);
}