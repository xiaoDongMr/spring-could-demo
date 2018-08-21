package cn.yilucaifu.domain.fundinfo;


import java.io.Serializable;

/**
 * filename：com.yilucaifu.domain.icaifu.SubFund.java
 * 
 * @author: zhangyong
 * @time: 2014-7-21上午9:14:00
 */

public class MyFundDetail implements Serializable {
	private static final long serialVersionUID = -7915622893424698478L;
	private String vol;
	private String fundcode;
	private int day;
	private String opertime;// 操作时间

	// private String amount;// 额度

	public String getOpertime() {
		return opertime;
	}

	public void setOpertime(String opertime) {
		this.opertime = opertime;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getVol() {
		return vol;
	}

	public void setVol(String vol) {
		this.vol = vol;
	}

	public String getFundcode() {
		return fundcode;
	}

	public void setFundcode(String fundcode) {
		this.fundcode = fundcode;
	}


}
