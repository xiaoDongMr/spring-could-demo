package cn.yilucaifu.domain.fundinfo;

import java.io.Serializable;

/**
 * filename：cn.yilucaifu.domain.pingan.OfficialHoliday.java
 * 
 * @author: zhangyong
 * @time: 2014-5-12上午11:46:51
 */

public class OfficialHoliday implements Serializable {

	private static final long serialVersionUID = -1995817440629931205L;
	private int id;// 主键
	private String holiday;// 假期

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHoliday() {
		return holiday;
	}

	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}

}
