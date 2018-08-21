package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.UserWealth;
import cn.yilucaifu.domain.UserWealthExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserWealthDao {
    long countByExample(UserWealthExample example);

    int deleteByExample(UserWealthExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserWealth record);

    int insertSelective(UserWealth record);

    List<UserWealth> selectByExample(UserWealthExample example);

    UserWealth selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserWealth record, @Param("example") UserWealthExample example);

    int updateByExample(@Param("record") UserWealth record, @Param("example") UserWealthExample example);

    int updateByPrimaryKeySelective(UserWealth record);

    int updateByPrimaryKey(UserWealth record);

    //custom
    //更新定期产品总资产和总收益
    void addP2p(UserWealth userWealth);
    //更新净值型产品总资产和总收益
    void addP2pNav(UserWealth userWealth);
}