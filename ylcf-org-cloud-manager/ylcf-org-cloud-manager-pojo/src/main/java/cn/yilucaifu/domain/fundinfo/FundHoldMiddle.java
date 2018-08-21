package cn.yilucaifu.domain.fundinfo;

import java.io.Serializable;

/**
 * filename：com.yilucaifu.domain.pingan.FundHoldMiddle.java
 *
 * @author: huzhong
 * @time: 2017-12-05
 */
public class FundHoldMiddle implements Serializable {
	private static final long serialVersionUID = 7858881935208754570L;
	private int id;
	//交易账号
	private String transactionaccountid;
	//基金代码
	private String fundcode;
	// 清仓日期
	private String clearHoldDate;
	//昨日收益和
	private String yestDprofitSum;
	//本金
	private String principal;
	//银行卡本金
	private String pricipalBank;
	private String createtime;
	private String nav;

	public int getIsRedeem() {
		return isRedeem;
	}

	public void setIsRedeem(int isRedeem) {
		this.isRedeem = isRedeem;
	}

	private int isRedeem;

	public String getNav() {
		return nav;
	}

	public void setNav(String nav) {
		this.nav = nav;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTransactionaccountid() {
		return transactionaccountid;
	}

	public void setTransactionaccountid(String transactionaccountid) {
		this.transactionaccountid = transactionaccountid;
	}

	public String getFundcode() {
		return fundcode;
	}

	public void setFundcode(String fundcode) {
		this.fundcode = fundcode;
	}

	public String getClearHoldDate() {
		return clearHoldDate;
	}

	public void setClearHoldDate(String clearHoldDate) {
		this.clearHoldDate = clearHoldDate;
	}

	public String getYestDprofitSum() {
		return yestDprofitSum;
	}

	public void setYestDprofitSum(String yestDprofitSum) {
		this.yestDprofitSum = yestDprofitSum;
	}

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getPricipalBank() {
		return pricipalBank;
	}

	public void setPricipalBank(String pricipalBank) {
		this.pricipalBank = pricipalBank;
	}
}