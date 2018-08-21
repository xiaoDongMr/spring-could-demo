package cn.yilucaifu.domain.fundinfo;

import java.io.Serializable;
import java.util.Date;

public class PinganThirdBulFund implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1761538864686147341L;
	private int id; // 主鍵
	private String filetime;
	private Date createTime;// 创建时间
	private String distributorCode; // 销售商代码
	private String transactionAccountId;// 交易账号
	private String custManagerId;// 客户经理代码
	private String tano; // TA代码
	private String fundCode;// 基金代码
	private String branchCode;// 网点
	private String depositAcct;// 银行卡号/账号
	private String taaccountId;// 基金账号
	private String fundvolBalance;// 持有份额
	private String availablevol;// 可用份额
	private String frozen;// 冻结份额
	private String buyInCost;// 买入成本
	private String holdCost;// 持仓成本
	private String defdividendMethod;// 分红方式
	private String sysdate;
	private String yestdProfit;
	private String isCalc;
	private String nav; // 净值
	private String customkey;// 渠道
	private String fundType;// 基金类型
	private String fundName;// 基金名称
	private String profit;// 基金名称

	public String getProfit() {
		return profit;
	}

	public void setProfit(String profit) {
		this.profit = profit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFiletime() {
		return filetime;
	}

	public void setFiletime(String filetime) {
		this.filetime = filetime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDistributorCode() {
		return distributorCode;
	}

	public void setDistributorCode(String distributorCode) {
		this.distributorCode = distributorCode;
	}

	public String getTransactionAccountId() {
		return transactionAccountId;
	}

	public void setTransactionAccountId(String transactionAccountId) {
		this.transactionAccountId = transactionAccountId;
	}

	public String getTano() {
		return tano;
	}

	public void setTano(String tano) {
		this.tano = tano;
	}

	public String getFundCode() {
		return fundCode;
	}

	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getDepositAcct() {
		return depositAcct;
	}

	public void setDepositAcct(String depositAcct) {
		this.depositAcct = depositAcct;
	}

	public String getTaaccountId() {
		return taaccountId;
	}

	public void setTaaccountId(String taaccountId) {
		this.taaccountId = taaccountId;
	}

	public String getFundvolBalance() {
		return fundvolBalance;
	}

	public void setFundvolBalance(String fundvolBalance) {
		this.fundvolBalance = fundvolBalance;
	}

	public String getAvailablevol() {
		return availablevol;
	}

	public void setAvailablevol(String availablevol) {
		this.availablevol = availablevol;
	}

	public String getFrozen() {
		return frozen;
	}

	public void setFrozen(String frozen) {
		this.frozen = frozen;
	}

	public String getDefdividendMethod() {
		return defdividendMethod;
	}

	public void setDefdividendMethod(String defdividendMethod) {
		this.defdividendMethod = defdividendMethod;
	}

	public String getSysdate() {
		return sysdate;
	}

	public void setSysdate(String sysdate) {
		this.sysdate = sysdate;
	}

	public String getYestdProfit() {
		return yestdProfit;
	}

	public void setYestdProfit(String yestdProfit) {
		this.yestdProfit = yestdProfit;
	}

	public String getIsCalc() {
		return isCalc;
	}

	public void setIsCalc(String isCalc) {
		this.isCalc = isCalc;
	}

	public String getNav() {
		return nav;
	}

	public void setNav(String nav) {
		this.nav = nav;
	}

	public String getCustomkey() {
		return customkey;
	}

	public void setCustomkey(String customkey) {
		this.customkey = customkey;
	}

	public String getFundType() {
		return fundType;
	}

	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	public String getFundName() {
		return fundName;
	}

	public void setFundName(String fundName) {
		this.fundName = fundName;
	}

	public String getCustManagerId() {
		return custManagerId;
	}

	public void setCustManagerId(String custManagerId) {
		this.custManagerId = custManagerId;
	}

	public String getBuyInCost() {
		return buyInCost;
	}

	public void setBuyInCost(String buyInCost) {
		this.buyInCost = buyInCost;
	}

	public String getHoldCost() {
		return holdCost;
	}

	public void setHoldCost(String holdCost) {
		this.holdCost = holdCost;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
