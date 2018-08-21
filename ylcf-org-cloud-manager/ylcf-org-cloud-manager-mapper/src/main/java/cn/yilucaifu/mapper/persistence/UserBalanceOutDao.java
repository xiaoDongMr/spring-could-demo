package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.UserBalanceOut;
import cn.yilucaifu.domain.UserBalanceOutExample;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserBalanceOutDao {
    long countByExample(UserBalanceOutExample example);

    int deleteByExample(UserBalanceOutExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserBalanceOut record);

    int insertSelective(UserBalanceOut record);

    List<UserBalanceOut> selectByExample(UserBalanceOutExample example);

    UserBalanceOut selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserBalanceOut record, @Param("example") UserBalanceOutExample example);

    int updateByExample(@Param("record") UserBalanceOut record, @Param("example") UserBalanceOutExample example);

    int updateByPrimaryKeySelective(UserBalanceOut record);

    int updateByPrimaryKey(UserBalanceOut record);

    // 根据订单号查询转出信息
    UserBalanceOut getUserBalance(@Param("order_id") String order_id);

    //余额明细
    List<Map<String,Object>> getUserBalanceByDetail(@Param("condition") HashMap<String, Object> condition, @Param("user_id") Integer user_id, @Param("payStatus") String payStatus);

    // 查询徽商转出失败的订单
    List<UserBalanceOut> getFailUserBalanceOutList(@Param("start_time") String start_time, @Param("end_time") String end_time);
}