package cn.yilucaifu.mapper.persistence_ylcf.yiluGrowth;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.yilucaifu.domain.yiluGrowth.YiluGrowth;

public interface YiluGrowthDao {

	public List<YiluGrowth> selectAllYiluGrowth();
	
	public YiluGrowth selectYiluGrowthById(int id);
	
	public List<YiluGrowth> selectAllYiluGrowthByCondition(@Param("start_time") String start_time,
                                                           @Param("end_time") String end_time, @Param("title") String title, @Param("mediaFrom") String mediaFrom, @Param("typeList") List<String> typeList);
	
	public void saveYiluGrowth(YiluGrowth yiluGrowth);
	
	public void updateYiluGrowth(YiluGrowth yiluGrowth);
	
	public void deleteYiluGrowthById(int id);

	public List<YiluGrowth> getAllGrowthList();
	
	public List<String> getAllYearList();
	
}
