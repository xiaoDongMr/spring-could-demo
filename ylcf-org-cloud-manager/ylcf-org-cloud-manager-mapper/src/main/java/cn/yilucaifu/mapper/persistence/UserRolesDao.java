package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.UserRoles;
import cn.yilucaifu.domain.UserRolesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserRolesDao {
    long countByExample(UserRolesExample example);

    int deleteByExample(UserRolesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserRoles record);

    int insertSelective(UserRoles record);

    List<UserRoles> selectByExample(UserRolesExample example);

    UserRoles selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserRoles record, @Param("example") UserRolesExample example);

    int updateByExample(@Param("record") UserRoles record, @Param("example") UserRolesExample example);

    int updateByPrimaryKeySelective(UserRoles record);

    int updateByPrimaryKey(UserRoles record);

    /*myMapper*/
    int saveUserRole(UserRoles userRoles);

}