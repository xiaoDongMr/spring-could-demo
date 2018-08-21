package cn.yilucaifu.domain.fundinfo;

import java.io.Serializable;

/**
 *
 * @author: zhangyong
 * @time: 2013-10-19下午4:14:50
 */

public class PinganFundnav implements Serializable {
	private static final long serialVersionUID = -3471892426447646918L;
	private Integer id;
	private String filetime;
	private String createtime;
	private String distributorcode;
	private String fundcode;
	private String dayorder;
	private String tradedate;//净值日期
	private String totalfundvol;
	private String nav;
	private String accumulativenav;
//	基金状态：
//	0 可申购赎回   
//	1 发行   
//	4 停止申购赎回   
//	5 停止申购   
//	6 停止赎回   
//	8 基金终止   
//	9 基金封闭

	private String fundstatus;
	private String confirmflag;
	private String settlest;
	private String workday;
	private String totalincome;
	private String ttincome;
	private String incomeyield;
	private String tano;
	private String weekyield;
	// 新增字段
	private String netvaluetype;
	private String guaranteednav;
	private String yield;
	private String fundyearincomerate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFiletime() {
		return filetime;
	}

	public void setFiletime(String filetime) {
		this.filetime = filetime;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getDistributorcode() {
		return distributorcode;
	}

	public void setDistributorcode(String distributorcode) {
		this.distributorcode = distributorcode;
	}

	public String getFundcode() {
		return fundcode;
	}

	public void setFundcode(String fundcode) {
		this.fundcode = fundcode;
	}

	public String getDayorder() {
		return dayorder;
	}

	public void setDayorder(String dayorder) {
		this.dayorder = dayorder;
	}

	public String getTradedate() {
		return tradedate;
	}

	public void setTradedate(String tradedate) {
		this.tradedate = tradedate;
	}

	public String getTotalfundvol() {
		return totalfundvol;
	}

	public void setTotalfundvol(String totalfundvol) {
		this.totalfundvol = totalfundvol;
	}

	public String getNav() {
		return nav;
	}

	public void setNav(String nav) {
		this.nav = nav;
	}

	public String getAccumulativenav() {
		return accumulativenav;
	}

	public void setAccumulativenav(String accumulativenav) {
		this.accumulativenav = accumulativenav;
	}

	public String getFundstatus() {
		return fundstatus;
	}

	public void setFundstatus(String fundstatus) {
		this.fundstatus = fundstatus;
	}

	public String getConfirmflag() {
		return confirmflag;
	}

	public void setConfirmflag(String confirmflag) {
		this.confirmflag = confirmflag;
	}

	public String getSettlest() {
		return settlest;
	}

	public void setSettlest(String settlest) {
		this.settlest = settlest;
	}

	public String getWorkday() {
		return workday;
	}

	public void setWorkday(String workday) {
		this.workday = workday;
	}

	public String getTotalincome() {
		return totalincome;
	}

	public void setTotalincome(String totalincome) {
		this.totalincome = totalincome;
	}

	public String getTtincome() {
		return ttincome;
	}

	public void setTtincome(String ttincome) {
		this.ttincome = ttincome;
	}

	public String getIncomeyield() {
		return incomeyield;
	}

	public void setIncomeyield(String incomeyield) {
		this.incomeyield = incomeyield;
	}

	public String getTano() {
		return tano;
	}

	public void setTano(String tano) {
		this.tano = tano;
	}

	public String getWeekyield() {
		return weekyield;
	}

	public void setWeekyield(String weekyield) {
		this.weekyield = weekyield;
	}

	public String getNetvaluetype() {
		return netvaluetype;
	}

	public void setNetvaluetype(String netvaluetype) {
		this.netvaluetype = netvaluetype;
	}

	public String getGuaranteednav() {
		return guaranteednav;
	}

	public void setGuaranteednav(String guaranteednav) {
		this.guaranteednav = guaranteednav;
	}

	public String getYield() {
		return yield;
	}

	public void setYield(String yield) {
		this.yield = yield;
	}

	public String getFundyearincomerate() {
		return fundyearincomerate;
	}

	public void setFundyearincomerate(String fundyearincomerate) {
		this.fundyearincomerate = fundyearincomerate;
	}

}
