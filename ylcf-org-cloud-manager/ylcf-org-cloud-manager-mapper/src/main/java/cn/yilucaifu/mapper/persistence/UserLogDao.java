package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.UserLog;
import cn.yilucaifu.domain.UserLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserLogDao {
    long countByExample(UserLogExample example);

    int deleteByExample(UserLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserLog record);

    int insertSelective(UserLog record);

    List<UserLog> selectByExample(UserLogExample example);

    UserLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserLog record, @Param("example") UserLogExample example);

    int updateByExample(@Param("record") UserLog record, @Param("example") UserLogExample example);

    int updateByPrimaryKeySelective(UserLog record);

    int updateByPrimaryKey(UserLog record);

    /*myMapper*/

    List<UserLog> getUserLogByAll();

    int saveUserLog(UserLog userLog);
}