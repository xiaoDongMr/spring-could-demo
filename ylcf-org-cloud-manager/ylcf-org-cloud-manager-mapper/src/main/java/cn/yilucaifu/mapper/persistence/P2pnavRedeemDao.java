package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.P2pnavRedeem;
import cn.yilucaifu.domain.P2pnavRedeemExample;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface P2pnavRedeemDao {
    long countByExample(P2pnavRedeemExample example);

    int deleteByExample(P2pnavRedeemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(P2pnavRedeem record);

    int insertSelective(P2pnavRedeem record);

    List<P2pnavRedeem> selectByExample(P2pnavRedeemExample example);

    P2pnavRedeem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") P2pnavRedeem record, @Param("example") P2pnavRedeemExample example);

    int updateByExample(@Param("record") P2pnavRedeem record, @Param("example") P2pnavRedeemExample example);

    int updateByPrimaryKeySelective(P2pnavRedeem record);

    int updateByPrimaryKey(P2pnavRedeem record);

    /*净值赎回*/
    List<Map<String, Object>> getP2pNavReturnMoneyPage(@Param("condition") HashMap<String, Object> condition);
}