package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.P2pReturnmoneyPlan;
import cn.yilucaifu.domain.P2pReturnmoneyPlanExample;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface P2pReturnMoneyPlanDao {
    long countByExample(P2pReturnmoneyPlanExample example);

    int deleteByExample(P2pReturnmoneyPlanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(P2pReturnmoneyPlan record);

    int insertSelective(P2pReturnmoneyPlan record);

    List<P2pReturnmoneyPlan> selectByExample(P2pReturnmoneyPlanExample example);

    P2pReturnmoneyPlan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") P2pReturnmoneyPlan record, @Param("example") P2pReturnmoneyPlanExample example);

    int updateByExample(@Param("record") P2pReturnmoneyPlan record, @Param("example") P2pReturnmoneyPlanExample example);

    int updateByPrimaryKeySelective(P2pReturnmoneyPlan record);

    int updateByPrimaryKey(P2pReturnmoneyPlan record);

    //查询固收回款列表
    List<Map<String, Object>> getP2pReturnMoneyPage(@Param("condition") HashMap<String, Object> condition);
}