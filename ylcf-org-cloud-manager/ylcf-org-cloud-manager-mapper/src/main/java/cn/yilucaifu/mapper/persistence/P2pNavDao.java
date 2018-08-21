package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.P2pNav;
import cn.yilucaifu.domain.P2pNavExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface P2pNavDao {
    long countByExample(P2pNavExample example);

    int deleteByExample(P2pNavExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(P2pNav record);

    int insertSelective(P2pNav record);

    List<P2pNav> selectByExample(P2pNavExample example);

    P2pNav selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") P2pNav record, @Param("example") P2pNavExample example);

    int updateByExample(@Param("record") P2pNav record, @Param("example") P2pNavExample example);

    int updateByPrimaryKeySelective(P2pNav record);

    int updateByPrimaryKey(P2pNav record);

    /*myMapper*/
    /*所有净值类产品*/
    List<P2pNav> getP2pNavByAll();
    /*插入净值产品并返回id*/
    int insertSelectiveBackId(P2pNav record);

    public List<Map<String,Object>> getP2pNavAndValue(@Param("p2pNavList") List p2pNavList);

}