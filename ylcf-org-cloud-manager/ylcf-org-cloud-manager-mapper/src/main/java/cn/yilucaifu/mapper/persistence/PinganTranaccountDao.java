package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.PinganTranaccount;
import cn.yilucaifu.domain.PinganTranaccountExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PinganTranaccountDao {
    long countByExample(PinganTranaccountExample example);

    int deleteByExample(PinganTranaccountExample example);

    int deleteByPrimaryKey(Integer accountId);

    int insert(PinganTranaccount record);

    int insertSelective(PinganTranaccount record);

    List<PinganTranaccount> selectByExample(PinganTranaccountExample example);

    PinganTranaccount selectByPrimaryKey(Integer accountId);

    int updateByExampleSelective(@Param("record") PinganTranaccount record, @Param("example") PinganTranaccountExample example);

    int updateByExample(@Param("record") PinganTranaccount record, @Param("example") PinganTranaccountExample example);

    int updateByPrimaryKeySelective(PinganTranaccount record);

    int updateByPrimaryKey(PinganTranaccount record);
}