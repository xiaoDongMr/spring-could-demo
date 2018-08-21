package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.UserVipInfo;
import cn.yilucaifu.domain.UserVipInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserVipInfoDao {
    long countByExample(UserVipInfoExample example);

    int deleteByExample(UserVipInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserVipInfo record);

    int insertSelective(UserVipInfo record);

    List<UserVipInfo> selectByExample(UserVipInfoExample example);

    UserVipInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserVipInfo record, @Param("example") UserVipInfoExample example);

    int updateByExample(@Param("record") UserVipInfo record, @Param("example") UserVipInfoExample example);

    int updateByPrimaryKeySelective(UserVipInfo record);

    int updateByPrimaryKey(UserVipInfo record);

    /*myMapper*/

    /**
     * 注册初始化会员等级
     * @param userId
     * @param vipLevel
     */
    int insertUserVipInfo(@Param("userId") int userId, @Param("vipLevel") int vipLevel);
}