package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.P2pAccount;
import cn.yilucaifu.domain.P2pAccountExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface P2pAccountDao {
    long countByExample(P2pAccountExample example);

    int deleteByExample(P2pAccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(P2pAccount record);

    int insertSelective(P2pAccount record);

    List<P2pAccount> selectByExample(P2pAccountExample example);

    P2pAccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") P2pAccount record, @Param("example") P2pAccountExample example);

    int updateByExample(@Param("record") P2pAccount record, @Param("example") P2pAccountExample example);

    int updateByPrimaryKeySelective(P2pAccount record);

    int updateByPrimaryKey(P2pAccount record);
}