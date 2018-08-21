package cn.yilucaifu.domain.fundinfo;

import java.io.Serializable;

/**
 * filename：cn.yilucaifu.domain.pingan.PinganFundlimit.java
 * 
 * @author: zhangyong
 * @time: 2013-10-19下午4:14:05
 */

public class PinganFundlimit implements Serializable {
	private static final long serialVersionUID = 6655515574907504815L;

	/**
	 * 主键
	 */
	private Integer id;
	/**
	 * 
	 */
	private String filetime;
	/**
	 * 创建 时间
	 */
	private String createtime;
	/**
	 * 销售商代码
	 */
	private String distributorcode;

	/**
	 * 基金代码
	 */
	private String fundcode;

	// 考虑到科学计数法等,所有数据改成字符串形式
	/**
	 * 基金最高赎回份数
	 */
	private String maxredemptionvol;

	/**
	 * 基金最低持有份数
	 */
	private String minaccountbalance;
	/**
	 * 基金最少赎回份数
	 */
	private String minredemptionvol;

	/**
	 * 定投最低申请金额
	 */
	private String minspbidsamount;
	/**
	 * 最低基金转换份数
	 */
	private String mininterconvertvol;

	/**
	 * 最低红利现金金额
	 */
	private String minbonuscash;
	/**
	 * 法人追加认购金额
	 */
	private String instappsubsamnt;
	/**
	 * 法人追加认购份数
	 */
	private String instappsubsvol;

	/**
	 * 个人追加认购份数
	 */
	private String indiappsubsvol;
	/**
	 * 个人追加认购金额
	 */
	private String indiappsubsamount;
	/**
	 * 法人最低认购金额
	 */
	private String minamountbyinst;
	/**
	 * 法人最低认购份数
	 */
	private String minvolbyinst;
	/**
	 * 个人最低认购份数
	 */
	private String minsubsvolbyindi;
	/**
	 * 个人最低认购金额
	 */
	private String minsubsamountbyindi;
	/**
	 * 个人首次申购最低金额
	 */
	private String minbidsamountbyindi;
	/**
	 * 法人首次申购最低金额
	 */
	private String minbidsamountbyinst;
	/**
	 * 个人追加申购最低金额
	 */
	private String minappbidsamountbyindi;

	/**
	 * 法人追加申购最低金额'
	 */
	private String minappbidsamountbyinst;
	/**
	 * 个人最高认购份数
	 */
	private String maxsubsvolbyindi;
	/**
	 * 个人最高认购金额
	 */
	private String maxsubsamountbyindi;

	/**
	 * 法人高认购份数
	 */
	private String maxsubsvolbyinst;
	/**
	 * 法人最高认购金额'
	 */
	private String maxsubsamountbyinst;
	/**
	 * 申请份额基数
	 */
	private String subunitvol;
	// 新增字段

	/**
	 * 人数
	 */
	private String maxaccouts;
	/**
	 * 人数
	 */
	private String indimaxpurchase;
	/**
	 * 个人最大申购金额
	 */
	private String instmaxpurchase;
	/**
	 * 个人当日累计购买最大金额
	 */
	private String indidaymaxsumbuy;
	/**
	 * 法人当日累计购买最大金额
	 */
	private String instdaymaxsumbuy;
	/**
	 * 个人当日累计赎回最大份额
	 */
	private String indidaymaxsumredeem;
	/**
	 * 法人当日累计赎回最大份额
	 */
	private String instdaymaxsumredeem;
	/**
	 * 个人最大赎回份额
	 */
	private String indimaxredeem;
	/**
	 * 法人最大赎回份额
	 */
	private String instmaxredeem;
	/*
	 * 业务名称 认购、申购、赎回、基金转换、定期定额申购
	 */
	private String businessname;
	
	public String getBusinessname() {
		return businessname;
	}

	public void setBusinessname(String businessname) {
		this.businessname = businessname;
	}

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

	public String getMaxredemptionvol() {
		return maxredemptionvol;
	}

	public void setMaxredemptionvol(String maxredemptionvol) {
		this.maxredemptionvol = maxredemptionvol;
	}

	public String getMinaccountbalance() {
		return minaccountbalance;
	}

	public void setMinaccountbalance(String minaccountbalance) {
		this.minaccountbalance = minaccountbalance;
	}

	public String getMinredemptionvol() {
		return minredemptionvol;
	}

	public void setMinredemptionvol(String minredemptionvol) {
		this.minredemptionvol = minredemptionvol;
	}

	public String getMinspbidsamount() {
		return minspbidsamount;
	}

	public void setMinspbidsamount(String minspbidsamount) {
		this.minspbidsamount = minspbidsamount;
	}

	public String getMininterconvertvol() {
		return mininterconvertvol;
	}

	public void setMininterconvertvol(String mininterconvertvol) {
		this.mininterconvertvol = mininterconvertvol;
	}

	public String getMinbonuscash() {
		return minbonuscash;
	}

	public void setMinbonuscash(String minbonuscash) {
		this.minbonuscash = minbonuscash;
	}

	public String getInstappsubsamnt() {
		return instappsubsamnt;
	}

	public void setInstappsubsamnt(String instappsubsamnt) {
		this.instappsubsamnt = instappsubsamnt;
	}

	public String getInstappsubsvol() {
		return instappsubsvol;
	}

	public void setInstappsubsvol(String instappsubsvol) {
		this.instappsubsvol = instappsubsvol;
	}

	public String getIndiappsubsvol() {
		return indiappsubsvol;
	}

	public void setIndiappsubsvol(String indiappsubsvol) {
		this.indiappsubsvol = indiappsubsvol;
	}

	public String getIndiappsubsamount() {
		return indiappsubsamount;
	}

	public void setIndiappsubsamount(String indiappsubsamount) {
		this.indiappsubsamount = indiappsubsamount;
	}

	public String getMinamountbyinst() {
		return minamountbyinst;
	}

	public void setMinamountbyinst(String minamountbyinst) {
		this.minamountbyinst = minamountbyinst;
	}

	public String getMinvolbyinst() {
		return minvolbyinst;
	}

	public void setMinvolbyinst(String minvolbyinst) {
		this.minvolbyinst = minvolbyinst;
	}

	public String getMinsubsvolbyindi() {
		return minsubsvolbyindi;
	}

	public void setMinsubsvolbyindi(String minsubsvolbyindi) {
		this.minsubsvolbyindi = minsubsvolbyindi;
	}

	public String getMinsubsamountbyindi() {
		return minsubsamountbyindi;
	}

	public void setMinsubsamountbyindi(String minsubsamountbyindi) {
		this.minsubsamountbyindi = minsubsamountbyindi;
	}

	public String getMinbidsamountbyindi() {
		return minbidsamountbyindi;
	}

	public void setMinbidsamountbyindi(String minbidsamountbyindi) {
		this.minbidsamountbyindi = minbidsamountbyindi;
	}

	public String getMinbidsamountbyinst() {
		return minbidsamountbyinst;
	}

	public void setMinbidsamountbyinst(String minbidsamountbyinst) {
		this.minbidsamountbyinst = minbidsamountbyinst;
	}

	public String getMinappbidsamountbyindi() {
		return minappbidsamountbyindi;
	}

	public void setMinappbidsamountbyindi(String minappbidsamountbyindi) {
		this.minappbidsamountbyindi = minappbidsamountbyindi;
	}

	public String getMinappbidsamountbyinst() {
		return minappbidsamountbyinst;
	}

	public void setMinappbidsamountbyinst(String minappbidsamountbyinst) {
		this.minappbidsamountbyinst = minappbidsamountbyinst;
	}

	public String getMaxsubsvolbyindi() {
		return maxsubsvolbyindi;
	}

	public void setMaxsubsvolbyindi(String maxsubsvolbyindi) {
		this.maxsubsvolbyindi = maxsubsvolbyindi;
	}

	public String getMaxsubsamountbyindi() {
		return maxsubsamountbyindi;
	}

	public void setMaxsubsamountbyindi(String maxsubsamountbyindi) {
		this.maxsubsamountbyindi = maxsubsamountbyindi;
	}

	public String getMaxsubsvolbyinst() {
		return maxsubsvolbyinst;
	}

	public void setMaxsubsvolbyinst(String maxsubsvolbyinst) {
		this.maxsubsvolbyinst = maxsubsvolbyinst;
	}

	public String getMaxsubsamountbyinst() {
		return maxsubsamountbyinst;
	}

	public void setMaxsubsamountbyinst(String maxsubsamountbyinst) {
		this.maxsubsamountbyinst = maxsubsamountbyinst;
	}

	public String getSubunitvol() {
		return subunitvol;
	}

	public void setSubunitvol(String subunitvol) {
		this.subunitvol = subunitvol;
	}

	public String getMaxaccouts() {
		return maxaccouts;
	}

	public void setMaxaccouts(String maxaccouts) {
		this.maxaccouts = maxaccouts;
	}

	public String getIndimaxpurchase() {
		return indimaxpurchase;
	}

	public void setIndimaxpurchase(String indimaxpurchase) {
		this.indimaxpurchase = indimaxpurchase;
	}

	public String getInstmaxpurchase() {
		return instmaxpurchase;
	}

	public void setInstmaxpurchase(String instmaxpurchase) {
		this.instmaxpurchase = instmaxpurchase;
	}

	public String getIndidaymaxsumbuy() {
		return indidaymaxsumbuy;
	}

	public void setIndidaymaxsumbuy(String indidaymaxsumbuy) {
		this.indidaymaxsumbuy = indidaymaxsumbuy;
	}

	public String getInstdaymaxsumbuy() {
		return instdaymaxsumbuy;
	}

	public void setInstdaymaxsumbuy(String instdaymaxsumbuy) {
		this.instdaymaxsumbuy = instdaymaxsumbuy;
	}

	public String getIndidaymaxsumredeem() {
		return indidaymaxsumredeem;
	}

	public void setIndidaymaxsumredeem(String indidaymaxsumredeem) {
		this.indidaymaxsumredeem = indidaymaxsumredeem;
	}

	public String getInstdaymaxsumredeem() {
		return instdaymaxsumredeem;
	}

	public void setInstdaymaxsumredeem(String instdaymaxsumredeem) {
		this.instdaymaxsumredeem = instdaymaxsumredeem;
	}

	public String getIndimaxredeem() {
		return indimaxredeem;
	}

	public void setIndimaxredeem(String indimaxredeem) {
		this.indimaxredeem = indimaxredeem;
	}

	public String getInstmaxredeem() {
		return instmaxredeem;
	}

	public void setInstmaxredeem(String instmaxredeem) {
		this.instmaxredeem = instmaxredeem;
	}

}
