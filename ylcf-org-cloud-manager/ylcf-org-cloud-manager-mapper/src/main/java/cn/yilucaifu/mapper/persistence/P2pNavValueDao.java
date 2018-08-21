package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.P2pNavValue;
import cn.yilucaifu.domain.P2pNavValueExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface P2pNavValueDao {
    long countByExample(P2pNavValueExample example);

    int deleteByExample(P2pNavValueExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(P2pNavValue record);

    int insertSelective(P2pNavValue record);

    List<P2pNavValue> selectByExample(P2pNavValueExample example);

    P2pNavValue selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") P2pNavValue record, @Param("example") P2pNavValueExample example);

    int updateByExample(@Param("record") P2pNavValue record, @Param("example") P2pNavValueExample example);

    int updateByPrimaryKeySelective(P2pNavValue record);

    int updateByPrimaryKey(P2pNavValue record);


    /**
     *
     * custom
     */
    //根据userid查询最新净值信息
    P2pNavValue selectByP2pNavId(Integer id);
    //根据userid和指定日期查询净值信息
    P2pNavValue selectByCreatetimeAndPId(@Param("p2pNavId") Integer p2pNavId, @Param("createtime") String createtime);
    //获取最后一条净值记录
    P2pNavValue getLastNavValue(@Param("p2pNavId") Integer p2pNavId);
}