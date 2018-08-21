package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.ContentFloorProduct;
import cn.yilucaifu.domain.ContentFloorProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ContentFloorProductDao {
    long countByExample(ContentFloorProductExample example);

    int deleteByExample(ContentFloorProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ContentFloorProduct record);

    int insertSelective(ContentFloorProduct record);

    List<ContentFloorProduct> selectByExample(ContentFloorProductExample example);

    ContentFloorProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ContentFloorProduct record, @Param("example") ContentFloorProductExample example);

    int updateByExample(@Param("record") ContentFloorProduct record, @Param("example") ContentFloorProductExample example);

    int updateByPrimaryKeySelective(ContentFloorProduct record);

    int updateByPrimaryKey(ContentFloorProduct record);
}