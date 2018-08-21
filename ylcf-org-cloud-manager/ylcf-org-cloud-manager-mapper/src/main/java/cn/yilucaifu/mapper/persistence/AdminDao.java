package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.Admin;
import cn.yilucaifu.domain.AdminExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminDao {
    long countByExample(AdminExample example);

    int deleteByExample(AdminExample example);

    int deleteByPrimaryKey(Integer adminId);

    int insert(Admin record);

    int insertSelective(Admin record);

    List<Admin> selectByExample(AdminExample example);

    Admin selectByPrimaryKey(Integer adminId);

    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    /*myMapper*/

    /**
     *
     * @param username
     * @param password
     * @return
     */
    public Admin getAdminByLogin(@Param("username") String username, @Param("password") String password);

    /**
     * 根据用户名查询
     *
     * @param username
     * @return
     */
    public Admin getAdminByName(@Param("username") String username);
}