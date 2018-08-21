package cn.yilucaifu.mapper.persistence_ylcf.yiluGrowth;

import java.util.List;

import cn.yilucaifu.domain.yiluGrowth.YiluGrowthNews;

public interface YiluGrowthNewsDao {

	public List<YiluGrowthNews> selectYiluGrowthNewsList();
	
	public YiluGrowthNews selectYiluGrowthNewsById(int id);
	
	public void saveYiluGrowthNews(YiluGrowthNews yiluGrowthNews);
	
	public void updateYiluGrowthNews(YiluGrowthNews yiluGrowthNews);
	
	// 查询所有启用的一路成长新闻List
	public List<YiluGrowthNews> selectEnableYiluGrowthNewsList();
	
}
