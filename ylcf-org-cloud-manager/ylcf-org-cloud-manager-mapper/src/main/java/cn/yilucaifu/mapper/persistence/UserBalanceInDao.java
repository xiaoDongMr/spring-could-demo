package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.UserBalanceIn;
import cn.yilucaifu.domain.UserBalanceInExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserBalanceInDao {
    long countByExample(UserBalanceInExample example);

    int deleteByExample(UserBalanceInExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserBalanceIn record);

    int insertSelective(UserBalanceIn record);

    List<UserBalanceIn> selectByExample(UserBalanceInExample example);

    UserBalanceIn selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserBalanceIn record, @Param("example") UserBalanceInExample example);

    int updateByExample(@Param("record") UserBalanceIn record, @Param("example") UserBalanceInExample example);

    int updateByPrimaryKeySelective(UserBalanceIn record);

    int updateByPrimaryKey(UserBalanceIn record);
}