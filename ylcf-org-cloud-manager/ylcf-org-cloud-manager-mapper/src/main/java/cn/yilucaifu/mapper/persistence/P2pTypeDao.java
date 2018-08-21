package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.P2pType;
import cn.yilucaifu.domain.P2pTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface P2pTypeDao {
    long countByExample(P2pTypeExample example);

    int deleteByExample(P2pTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(P2pType record);

    int insertSelective(P2pType record);

    List<P2pType> selectByExample(P2pTypeExample example);

    P2pType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") P2pType record, @Param("example") P2pTypeExample example);

    int updateByExample(@Param("record") P2pType record, @Param("example") P2pTypeExample example);

    int updateByPrimaryKeySelective(P2pType record);

    int updateByPrimaryKey(P2pType record);
}