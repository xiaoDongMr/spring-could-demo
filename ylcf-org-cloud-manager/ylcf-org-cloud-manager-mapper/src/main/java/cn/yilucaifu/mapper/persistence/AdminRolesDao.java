package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.AdminRoles;
import cn.yilucaifu.domain.AdminRolesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminRolesDao {
    long countByExample(AdminRolesExample example);

    int deleteByExample(AdminRolesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminRoles record);

    int insertSelective(AdminRoles record);

    List<AdminRoles> selectByExample(AdminRolesExample example);

    AdminRoles selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminRoles record, @Param("example") AdminRolesExample example);

    int updateByExample(@Param("record") AdminRoles record, @Param("example") AdminRolesExample example);

    int updateByPrimaryKeySelective(AdminRoles record);

    int updateByPrimaryKey(AdminRoles record);
}