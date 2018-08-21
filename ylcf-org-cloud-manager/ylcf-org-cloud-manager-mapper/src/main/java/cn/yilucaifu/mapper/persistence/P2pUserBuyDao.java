package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.P2pUserbuy;
import cn.yilucaifu.domain.P2pUserbuyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface P2pUserBuyDao {
    long countByExample(P2pUserbuyExample example);

    int deleteByExample(P2pUserbuyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(P2pUserbuy record);

    int insertSelective(P2pUserbuy record);

    List<P2pUserbuy> selectByExample(P2pUserbuyExample example);

    P2pUserbuy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") P2pUserbuy record, @Param("example") P2pUserbuyExample example);

    int updateByExample(@Param("record") P2pUserbuy record, @Param("example") P2pUserbuyExample example);

    int updateByPrimaryKeySelective(P2pUserbuy record);

    int updateByPrimaryKey(P2pUserbuy record);

    //custom/////////////////
    float getSumRaiseMoney(@Param("p2pId") Integer p2pId);

    //根据userid和支付状态查询订单信息
    public List<P2pUserbuy> selectP2pUserbuyByUid(P2pUserbuy p2pUserbuy);

    //获取需要计算收益的用户id
    public List<Integer> getSumByUserId();
    //根据user_id 获取订单信息
    public List<P2pUserbuy> getSumByP2pUserbuy(@Param("user_id") Integer user_id);

    //本周投资TOP5
    public List<Map<String, Object>> getThisWeekTop5(@Param("pId") Integer pId, @Param("weekBegin") String weekBegin, @Param("weekEnd") String weekEnd);

    //获取总资产、累计收益和最新收益
    public Map<String, Object> getP2pWealth(@Param("userId") Integer userId);
    //根据产品类型获取资产，累计收益，和最新收益
    public Map<String, Object> getP2pWealthByType(P2pUserbuy p2pUserbuy);

    P2pUserbuy getUserBuyLogByOrderId(@Param("userId") Integer userId, @Param("orderId") String orderId);

    //查询固收订单列表
    List<Map<String, Object>> getP2pOrderPage();
}