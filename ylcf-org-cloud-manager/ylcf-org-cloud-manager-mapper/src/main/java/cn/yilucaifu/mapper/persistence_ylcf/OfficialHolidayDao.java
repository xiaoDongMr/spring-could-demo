package cn.yilucaifu.mapper.persistence_ylcf;


import cn.yilucaifu.domain.fundinfo.OfficialHoliday;

/**
 * filename：cn.yilucaifu.mapper.persistence.OfficialHolidayDao.java
 * 
 * @author: zhangyong
 * @time: 2014-5-12上午11:52:09
 */

public interface OfficialHolidayDao {

	public OfficialHoliday findOfficialHolidayByDate(String holiday);
}
