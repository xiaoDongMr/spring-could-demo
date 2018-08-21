package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.FundRiskResult;
import cn.yilucaifu.domain.FundRiskResultExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FundRiskResultDao {
    long countByExample(FundRiskResultExample example);

    int deleteByExample(FundRiskResultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FundRiskResult record);

    int insertSelective(FundRiskResult record);

    List<FundRiskResult> selectByExample(FundRiskResultExample example);

    FundRiskResult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FundRiskResult record, @Param("example") FundRiskResultExample example);

    int updateByExample(@Param("record") FundRiskResult record, @Param("example") FundRiskResultExample example);

    int updateByPrimaryKeySelective(FundRiskResult record);

    int updateByPrimaryKey(FundRiskResult record);
}