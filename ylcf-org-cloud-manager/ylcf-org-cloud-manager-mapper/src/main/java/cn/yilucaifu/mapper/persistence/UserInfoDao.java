package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.UserInfo;
import cn.yilucaifu.domain.UserInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserInfoDao {
    long countByExample(UserInfoExample example);

    int deleteByExample(UserInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExample(UserInfoExample example);

    UserInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    /*myMapper*/

    List<UserInfo> getUserInfoByAll();

    int createUserInfo(UserInfo userInfo);

    int createUserQfii(@Param("userId") int userId, @Param("qfiiCard") String qfiiCard);

    List<UserInfo> getStatusAndTimeList(@Param("userIds") String userIds);

    public List<Map<String,Object>> getUserAuditList();
}