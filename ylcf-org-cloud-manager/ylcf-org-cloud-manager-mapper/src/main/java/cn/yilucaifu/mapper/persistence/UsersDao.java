package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.Users;
import cn.yilucaifu.domain.UsersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsersDao {
    long countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);


    /*myMapper*/

    List<Users> getUserByAll();

    //验证注册信息有效性
    Users getUserByColumn(@Param("column") String column);

    //注册返回主键
    Integer createUser(Users users);
    //修改登录时间
    int updateLastlogin(@Param("user_id") int user_id);

    /**
     * 根据用户名查询
     *
     * @param username
     * @return
     */
    Users getUserByName(@Param("username") String username);

}