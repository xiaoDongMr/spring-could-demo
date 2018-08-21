package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.P2pnavUserbuy;
import cn.yilucaifu.domain.P2pnavUserbuyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface P2pnavUserBuyDao {
    long countByExample(P2pnavUserbuyExample example);

    int deleteByExample(P2pnavUserbuyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(P2pnavUserbuy record);

    int insertSelective(P2pnavUserbuy record);

    List<P2pnavUserbuy> selectByExample(P2pnavUserbuyExample example);

    P2pnavUserbuy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") P2pnavUserbuy record, @Param("example") P2pnavUserbuyExample example);

    int updateByExample(@Param("record") P2pnavUserbuy record, @Param("example") P2pnavUserbuyExample example);

    int updateByPrimaryKeySelective(P2pnavUserbuy record);

    int updateByPrimaryKey(P2pnavUserbuy record);

    //本周投资TOP5
    public List<Map<String, Object>> getThisWeekTop5(@Param("pId") Integer pId, @Param("weekBegin") String weekBegin, @Param("weekEnd") String weekEnd);

    //获取需要计算收益的用户id
    public List<Integer> getSumByUserId();
    //根据user_id 获取订单信息
    public List<P2pnavUserbuy> getSumByP2pNavUserbuy(@Param("user_id") Integer user_id);

    //获取总资产、累计收益和最新收益
    public Map<String, Object> getP2pNavWealth(@Param("userId") Integer userId);

    //根据产品类型获取总资产、累计收益和最新收益
    public Map<String, Object> getP2pNavWealthByType(P2pnavUserbuy p2pnavUserbuy);

    //获取订单
    P2pnavUserbuy getUserBuyLogByOrderId(@Param("userId") Integer userId, @Param("orderId") String orderId);

    //查询净值订单列表
    List<Map<String, Object>> getP2pNavOrderPage();
}