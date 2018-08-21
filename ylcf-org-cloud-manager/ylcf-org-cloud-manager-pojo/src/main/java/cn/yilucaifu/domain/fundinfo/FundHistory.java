package cn.yilucaifu.domain.fundinfo;

import cn.yilucaifu.utils.StringUtil;

import java.io.Serializable;

/**
 * filename：cn.yilucaifu.domain.pingan.FundHistory.java
 * 
 * @author: zhangyong
 * @time: 2014-7-16下午1:45:47
 */

public class FundHistory implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5117298602355462841L;
	/**
	 * 1 交易流水号 APPSHEETSERIALNO 24 右补空格
	 */
	private String appsheetserialno;
	/**
	 * 2 银行卡号 DEPOSITACCT 32 右补空格 发展卡号
	 */
	private String depositacct;
	/**
	 * 3 交易账号 TRANSACTIONACCOUNTID 17 右补空格
	 */
	private String transactionaccountid;
	/**
	 * 基金代码 FUNDCODE 6 右补空格
	 */
	private String fundcode;
	/**
	 * 5 基金名称 FUNDNAME 40 右补空格
	 */
	private String fundname;
	/**
	 * 6 业务种类 BUSINESSCODE 10 右补空格
	 */
	private String businesscode;
	/**
	 * 7 申请金额 APPLICATIONAMOUNT 15 补空格
	 */
	private String applicationamount;
	/**
	 * 8 申请份额 applicationvol 15 右补空格
	 */
	private String applicationvol;

	/**
	 * 9 确认金额 confirmedamount 15 增加的
	 */
	private String confirmedamount;
	/**
	 * 10 确认份额 confirmedvol 15 增加的
	 */
	private String confirmedvol;
	/**
	 * 11 手续费 charge 15 右补空格
	 */
	private String charge;
	/**
	 * 12 交易状态 applystname 20 右补空格 确认成功/失败
	 */
	private String applystname;
	/**
	 * 13 交易日期 transactiondate 8 右补空格
	 */
	private String transactiondate;
	/**
	 * 14 确认日期 transactioncfmdate 8 右补空格
	 */
	private String transactioncfmdate;
	/**
	 * 15 业务名称 businessname 30 右补空格
	 */
	private String businessname;

	/**
	 * 16 目标基金代码 codeoftargetfund 6 右补空格
	 */
	private String codeoftargetfund;
	/**
	 * 17 目标基金名称 nameoftargetfund 30 右补空格
	 */
	private String nameoftargetfund;
	/**
	 * 18 对方销售机构代码 targetdistributorcode 6 右补空格
	 */
	private String targetdistributorcode;
	/**
	 * 19 对方销售机构名称 targetdistributorname 30 右补空格
	 */
	private String targetdistributorname;
	/**
	 * 20 风险等级匹配说明 fundriskgradedesc 12 右补空格
	 */
	private String fundriskgradedesc;

	/**
	 * 21 巨额卖出标志 summaryi 10 右补空格
	 */
	private String summaryi;
	/**
	 * 22 分红方式 specifyredeemflag 10 右补空格
	 */
	private String specifyredeemflag;
	/**
	 * 23 渠道名称 acceptmethod 12 右补空格
	 */
	private String acceptmethod;
	/**
	 * 24 注册登记机构代码\对方机构代码 tano 6 右补空格
	 */
	private String tano;
	/**
	 * 25 基金账户 taaccountid 12 右补空格
	 */

	private String taaccountid;
	/**
	 * 26 定投协议号 saveplanno 24 右补空格
	 */
	private String saveplanno;
	/**
	 * 27 成交净值 nav 7，4 右补空格
	 */
	private String type;// fund,p2p

	private String p2p_id;

	private String targettransactionaccountid;

	private String p2pname;
	private String p2p_periods;
	private String nav;

	private String isYLbao;

	private int userid;

	private String showDate;
	
	private String EMSno;//快递单号

	public String getInvestorname() {
		return investorname;
	}

	public void setInvestorname(String investorname) {
		this.investorname = investorname;
	}

	private String investorname; // 对方账户名称

	public String getEMSno() {
		return EMSno;
	}

	public void setEMSno(String EMSno) {
		this.EMSno = EMSno;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	private String createtime;

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getIsYLbao() {
		return isYLbao;
	}

	public void setIsYLbao(String isYLbao) {
		this.isYLbao = isYLbao;
	}

	public String getAppsheetserialno() {
		return appsheetserialno;
	}

	public void setAppsheetserialno(String appsheetserialno) {
		this.appsheetserialno = appsheetserialno;
	}

	public String getDepositacct() {
		return depositacct;
	}

	public void setDepositacct(String depositacct) {
		this.depositacct = depositacct;
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

	public String getFundname() {
		return fundname;
	}

	public void setFundname(String fundname) {
		this.fundname = fundname;
	}

	public String getBusinesscode() {
		return businesscode;
	}

	public void setBusinesscode(String businesscode) {
		this.businesscode = businesscode;
	}

	public String getApplicationamount() {
		return applicationamount;
	}

	public void setApplicationamount(String applicationamount) {
		this.applicationamount = applicationamount;
	}

	public String getApplicationvol() {
		return applicationvol;
	}

	public void setApplicationvol(String applicationvol) {
		this.applicationvol = applicationvol;
	}

	public String getConfirmedamount() {
		return confirmedamount;
	}

	public void setConfirmedamount(String confirmedamount) {
		this.confirmedamount = confirmedamount;
	}

	public String getConfirmedvol() {
		return confirmedvol;
	}

	public void setConfirmedvol(String confirmedvol) {
		this.confirmedvol = confirmedvol;
	}

	public String getCharge() {
		return charge;
	}

	public void setCharge(String charge) {
		this.charge = charge;
	}

	public String getApplystname() {
		if (!StringUtil.isEmpty(applystname)) {
			return applystname.trim();
		}
		return applystname;
	}
	public void setApplystname(String applystname) {
		this.applystname = applystname;
	}

	public String getTransactiondate() {
		return transactiondate;
	}

	public void setTransactiondate(String transactiondate) {
		this.transactiondate = transactiondate;
	}

	public String getTransactioncfmdate() {
		return transactioncfmdate;
	}

	public void setTransactioncfmdate(String transactioncfmdate) {
		this.transactioncfmdate = transactioncfmdate;
	}


	public void setBusinessname(String businessname) {
		this.businessname = businessname;
	}

	public String getCodeoftargetfund() {
		return codeoftargetfund;
	}

	public void setCodeoftargetfund(String codeoftargetfund) {
		this.codeoftargetfund = codeoftargetfund;
	}

	public String getNameoftargetfund() {
		return nameoftargetfund;
	}

	public void setNameoftargetfund(String nameoftargetfund) {
		this.nameoftargetfund = nameoftargetfund;
	}

	public String getTargetdistributorcode() {
		return targetdistributorcode;
	}

	public void setTargetdistributorcode(String targetdistributorcode) {
		this.targetdistributorcode = targetdistributorcode;
	}

	public String getTargetdistributorname() {
		return targetdistributorname;
	}

	public void setTargetdistributorname(String targetdistributorname) {
		this.targetdistributorname = targetdistributorname;
	}

	public String getFundriskgradedesc() {
		return fundriskgradedesc;
	}

	public void setFundriskgradedesc(String fundriskgradedesc) {
		this.fundriskgradedesc = fundriskgradedesc;
	}

	public String getSummaryi() {
		return summaryi;
	}

	public void setSummaryi(String summaryi) {
		this.summaryi = summaryi;
	}

	public String getSpecifyredeemflag() {
		return specifyredeemflag;
	}

	public void setSpecifyredeemflag(String specifyredeemflag) {
		this.specifyredeemflag = specifyredeemflag;
	}

	public String getAcceptmethod() {
		return acceptmethod;
	}

	public void setAcceptmethod(String acceptmethod) {
		this.acceptmethod = acceptmethod;
	}

	public String getTano() {
		return tano;
	}

	public void setTano(String tano) {
		this.tano = tano;
	}

	public String getTaaccountid() {
		return taaccountid;
	}

	public void setTaaccountid(String taaccountid) {
		this.taaccountid = taaccountid;
	}

	public String getSaveplanno() {
		return saveplanno;
	}

	public void setSaveplanno(String saveplanno) {
		this.saveplanno = saveplanno;
	}

	public String getNav() {
		return nav;
	}

	public void setNav(String nav) {
		this.nav = nav;
	}

	public FundHistory() {
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getP2p_id() {
		return p2p_id;
	}

	public String getBusinessname() {
		return businessname;
	}

	public String getShowDate() {
		return showDate;
	}

	public void setP2p_id(String p2p_id) {
		this.p2p_id = p2p_id;
	}

	public String getP2pname() {
		return p2pname;
	}

	public void setP2pname(String p2pname) {
		this.p2pname = p2pname;
	}

	public void setShowDate(String showDate) {
		this.showDate = showDate;
	}

	public String getP2p_periods() {
		return p2p_periods;
	}

	public void setP2p_periods(String p2p_periods) {
		this.p2p_periods = p2p_periods;
	}

	public String getTargettransactionaccountid() {
		return targettransactionaccountid;
	}

	public void setTargettransactionaccountid(String targettransactionaccountid) {
		this.targettransactionaccountid = targettransactionaccountid;
	}

}