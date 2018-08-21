package cn.yilucaifu.domain.fundinfo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * filename：cn.yilucaifu.domain.icaifu.MyFund.java
 * 
 * @author: zhangyong
 * @time: 2014-7-18下午4:44:09
 */

public class MyFund implements Serializable {

	private static final long serialVersionUID = -6641630665111470467L;

	private int id;
	private String fundcode;// 基金代码
	private String fundname;// 基金名称
	private int userid;// 用户id
	private String accum_net;// 七日年化
	private String vol;// 持有份额
	private String profit;// 收益
	private String amount;// 持有金额
	private String enableVol;// 可赎回份额
	private int days; // 升级所需天数
	private String endDate; // 日期
	private int position; //排位
	private String alias; // 别名
	private String unit_net; // 万份收益
	private String yestDprofit;// 最新收益 
	private String is_quick_redeem;// 1支持快赎 0不支持快赎
	private String qRFrozeWealth;
	

	private List<MyFundDetail> myFundDetailList = new ArrayList<MyFundDetail>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFundcode() {
		return fundcode;
	}

	public void setFundcode(String fundcode) {
		this.fundcode = fundcode;
	}

	public String getFundname() {
		return fundname;
	}

	public void setFundname(String fundname) {
		this.fundname = fundname;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getAccum_net() {
		return accum_net;
	}

	public void setAccum_net(String accum_net) {
		this.accum_net = accum_net;
	}

	public String getVol() {
		return vol;
	}

	public void setVol(String vol) {
		this.vol = vol;
	}

	public String getProfit() {
		return profit;
	}

	public void setProfit(String profit) {
		this.profit = profit;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public List<MyFundDetail> getMyFundDetailList() {
		return myFundDetailList;
	}

	public void setMyFundDetailList(List<MyFundDetail> myFundDetailList) {
		this.myFundDetailList = myFundDetailList;
	}

	public String getEnableVol() {
		return enableVol;
	}

	public void setEnableVol(String enableVol) {
		this.enableVol = enableVol;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getUnit_net() {
		return unit_net;
	}

	public void setUnit_net(String unit_net) {
		this.unit_net = unit_net;
	}

	public String getYestDprofit() {
		return yestDprofit;
	}

	public void setYestDprofit(String yestDprofit) {
		this.yestDprofit = yestDprofit;
	}

	public String getIs_quick_redeem() {
		return is_quick_redeem;
	}

	public void setIs_quick_redeem(String is_quick_redeem) {
		this.is_quick_redeem = is_quick_redeem;
	}

	public String getqRFrozeWealth() {
		return qRFrozeWealth;
	}

	public void setqRFrozeWealth(String qRFrozeWealth) {
		this.qRFrozeWealth = qRFrozeWealth;
	}
}