package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.P2pBanks;
import cn.yilucaifu.domain.P2pBanksExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface P2pBanksDao {
    long countByExample(P2pBanksExample example);

    int deleteByExample(P2pBanksExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(P2pBanks record);

    int insertSelective(P2pBanks record);

    List<P2pBanks> selectByExample(P2pBanksExample example);

    P2pBanks selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") P2pBanks record, @Param("example") P2pBanksExample example);

    int updateByExample(@Param("record") P2pBanks record, @Param("example") P2pBanksExample example);

    int updateByPrimaryKeySelective(P2pBanks record);

    int updateByPrimaryKey(P2pBanks record);
}