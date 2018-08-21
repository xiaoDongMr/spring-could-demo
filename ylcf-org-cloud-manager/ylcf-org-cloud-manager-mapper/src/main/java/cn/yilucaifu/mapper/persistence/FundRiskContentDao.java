package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.FundRiskContent;
import cn.yilucaifu.domain.FundRiskContentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FundRiskContentDao {
    long countByExample(FundRiskContentExample example);

    int deleteByExample(FundRiskContentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FundRiskContent record);

    int insertSelective(FundRiskContent record);

    List<FundRiskContent> selectByExampleWithBLOBs(FundRiskContentExample example);

    List<FundRiskContent> selectByExample(FundRiskContentExample example);

    FundRiskContent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FundRiskContent record, @Param("example") FundRiskContentExample example);

    int updateByExampleWithBLOBs(@Param("record") FundRiskContent record, @Param("example") FundRiskContentExample example);

    int updateByExample(@Param("record") FundRiskContent record, @Param("example") FundRiskContentExample example);

    int updateByPrimaryKeySelective(FundRiskContent record);

    int updateByPrimaryKeyWithBLOBs(FundRiskContent record);

    int updateByPrimaryKey(FundRiskContent record);
}