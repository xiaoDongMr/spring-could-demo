package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.P2p;
import cn.yilucaifu.domain.P2pExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface P2pDao {
    long countByExample(P2pExample example);

    int deleteByExample(P2pExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(P2p record);

    int insertSelective(P2p record);

    List<P2p> selectByExample(P2pExample example);

    P2p selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") P2p record, @Param("example") P2pExample example);

    int updateByExample(@Param("record") P2p record, @Param("example") P2pExample example);

    int updateByPrimaryKeySelective(P2p record);

    int updateByPrimaryKey(P2p record);

    /*myMapper*/
    /*所有固收类产品*/
    List<P2p> getP2pByAll();
    /*插入固收产品并返回id*/
    int insertSelectiveBackId(P2p record);
}