package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.P2pManager;
import cn.yilucaifu.domain.P2pManagerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface P2pManagerDao {
    long countByExample(P2pManagerExample example);

    int deleteByExample(P2pManagerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(P2pManager record);

    int insertSelective(P2pManager record);

    int insertSelectiveBackId(P2pManager record);

    List<P2pManager> selectByExample(P2pManagerExample example);

    P2pManager selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") P2pManager record, @Param("example") P2pManagerExample example);

    int updateByExample(@Param("record") P2pManager record, @Param("example") P2pManagerExample example);

    int updateByPrimaryKeySelective(P2pManager record);

    int updateByPrimaryKey(P2pManager record);
}