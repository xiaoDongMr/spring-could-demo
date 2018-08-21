package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.ContentFloor;
import cn.yilucaifu.domain.ContentFloorExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ContentFloorDao {
    long countByExample(ContentFloorExample example);

    int deleteByExample(ContentFloorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ContentFloor record);

    int insertSelective(ContentFloor record);

    List<ContentFloor> selectByExampleWithBLOBs(ContentFloorExample example);

    List<ContentFloor> selectByExample(ContentFloorExample example);

    ContentFloor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ContentFloor record, @Param("example") ContentFloorExample example);

    int updateByExampleWithBLOBs(@Param("record") ContentFloor record, @Param("example") ContentFloorExample example);

    int updateByExample(@Param("record") ContentFloor record, @Param("example") ContentFloorExample example);

    int updateByPrimaryKeySelective(ContentFloor record);

    int updateByPrimaryKeyWithBLOBs(ContentFloor record);

    int updateByPrimaryKey(ContentFloor record);
}