package cn.yilucaifu.mapper.persistence_ylcf.yiluGrowth;

import java.util.List;

import cn.yilucaifu.domain.yiluGrowth.YiluGrowthColor;

public interface YiluGrowthColorDao {

	public List<YiluGrowthColor> selectYiluGrowthColor();
	
	public void addYiluGrowthColor(YiluGrowthColor yiluGrowthColor);

	public YiluGrowthColor selectYiluGrowthColorById(int id);

	public void updateYiluGrowthColor(YiluGrowthColor yiluGrowthColor);
	
}
