package cn.yilucaifu.mapper.persistence_ylcf;


import cn.yilucaifu.domain.fundinfo.PinganTainfo;

/**
 * filename：cn.yilucaifu.mapper.persistence.PinganTainfoDao.java
 * 
 * @author: zhangyong
 * @time: 2013-10-21上午9:55:36
 */

public interface PinganTainfoDao {
	/**
	 * 保存tainfo
	 * 
	 * @param tainfo
	 */
	public void savaTainfo(PinganTainfo tainfo);

	/**
	 * 根据文件名获得tainfo条数
	 * 
	 * @param filetime
	 * @return
	 */
	public int findTainfoCountByFiletime(String filetime);
	
	
	public int queryRefreshPinganFile(); 
	
	public void updateRefreshPinganFile();

	//查询基金持仓filetime
	public String queryFundFiletime();
	//更新基金持仓filetime
	public void updateFundFiletime(String fund_file_time);
}
