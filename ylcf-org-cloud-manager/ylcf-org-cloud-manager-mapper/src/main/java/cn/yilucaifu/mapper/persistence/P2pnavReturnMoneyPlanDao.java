package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.P2pnavReturnmoneyPlan;
import cn.yilucaifu.domain.P2pnavReturnmoneyPlanExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface P2pnavReturnMoneyPlanDao {
    long countByExample(P2pnavReturnmoneyPlanExample example);

    int deleteByExample(P2pnavReturnmoneyPlanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(P2pnavReturnmoneyPlan record);

    int insertSelective(P2pnavReturnmoneyPlan record);

    List<P2pnavReturnmoneyPlan> selectByExample(P2pnavReturnmoneyPlanExample example);

    P2pnavReturnmoneyPlan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") P2pnavReturnmoneyPlan record, @Param("example") P2pnavReturnmoneyPlanExample example);

    int updateByExample(@Param("record") P2pnavReturnmoneyPlan record, @Param("example") P2pnavReturnmoneyPlanExample example);

    int updateByPrimaryKeySelective(P2pnavReturnmoneyPlan record);

    int updateByPrimaryKey(P2pnavReturnmoneyPlan record);
}