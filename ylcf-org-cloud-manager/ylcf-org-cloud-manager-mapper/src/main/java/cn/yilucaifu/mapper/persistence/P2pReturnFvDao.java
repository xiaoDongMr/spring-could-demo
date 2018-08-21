package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.P2pReturnFv;
import cn.yilucaifu.domain.P2pReturnFvExample;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface P2pReturnFvDao {
    long countByExample(P2pReturnFvExample example);

    int deleteByExample(P2pReturnFvExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(P2pReturnFv record);

    int insertSelective(P2pReturnFv record);

    List<P2pReturnFv> selectByExample(P2pReturnFvExample example);

    P2pReturnFv selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") P2pReturnFv record, @Param("example") P2pReturnFvExample example);

    int updateByExample(@Param("record") P2pReturnFv record, @Param("example") P2pReturnFvExample example);

    int updateByPrimaryKeySelective(P2pReturnFv record);

    int updateByPrimaryKey(P2pReturnFv record);


    /*mymapper*/

    /*资管方回款*/
    List<Map<String, Object>> getP2pReturnFvPage(@Param("condition") HashMap<String, Object> condition);
}