package cn.yilucaifu.domain.fundinfo;


import cn.yilucaifu.utils.StringUtil;
import cn.yilucaifu.utils.hs.HsConstants;
import cn.yilucaifu.utils.hs.PinganConstants;

import java.io.Serializable;

/**
 * filename：cn.yilucaifu.domain.pingan.PinganFundinfo.java
 * 
 * @author: zhangyong 平安推送文件-基金详情
 * @time: 2013-10-19下午2:29:56
 */

public class PinganFundinfo implements Serializable {

	private static final long serialVersionUID = -6796964684632344569L;
	/**
	 * 主键
	 */
	private Integer id;
	/**
	 * 文件时间/读取标识
	 */
	private String filetime;
	/**
	 * 创建时间
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
	/**
	 * 基金名称
	 */
	private String fundname;
	/**
	 * 基金英文名称
	 */
	private String fundnameeng;

	/**
	 * 基金总份数
	 */
	private String totalfundvol;
	/**
	 * 
	 * 基金状态： 0 可申购赎回
	 * 
	 * 1 发行
	 * 
	 * 4 停止申购赎回
	 * 
	 * 5 停止申购
	 * 
	 * 6 停止赎回
	 * 
	 * 8 基金终止
	 * 
	 * 9 基金封闭
	 */
	private String fundstatus;
	/**
	 * 基金单位净值
	 */
	private String nav;
	/**
	 * 结算币种
	 */
	private String currencytype;
	/**
	 * 托管人代码
	 */
	private String custodiancode;

	/**
	 * TA代码
	 */
	private String tano;
	/**
	 * 基金发起人
	 */
	private String fundsponsor;
	/**
	 * 管理人代码
	 */
	private String managercode;
	/**
	 * 基金募集开始日期
	 */
	private String ipostartdate;
	/**
	 * 基金募集结束日期
	 */
	private String ipoenddate;
	/**
	 * 基金预定规模
	 */
	private String fundsize;
	/**
	 * 交易价格
	 */
	private String tradingprice;
	/**
	 * 基金信息更改日期
	 */
	private String updatedate;
	/**
	 * 基金面值
	 */
	private String facevalue;
	/**
	 * 基金转换状态(0-可转入,可转出 1-只可转入 // 2-只可转出 3-不可转换
	 */
	private String convertstatus;

	/**
	 * 分红日/发放
	 */
	private String dividentdate;
	/**
	 * 权益登记日期
	 */
	private String registrationdate;
	/**
	 * 认购方式(0-金额认购,1-份数认购)
	 */
	private String substype;
	/**
	 * 下一交易日
	 */
	private String nexttradedate;
	/**
	 * 产品价值线数值
	 */
	private String valueline;
	/**
	 * 基金募集期利息处理方式
	 */
	private String intmode;
	/**
	 * 募集期记息起始日
	 */
	private String intstart;
	/**
	 * 基金募集期记息终止日期
	 */
	private String intenddate;
	/**
	 * 累计净值
	 */
	private String accumulativenav;
	/**
	 * 费用系数(以表示收费的高低)
	 */
	private String feefactor;
	/**
	 * 收费方式(0:前收费代码 1:后收费代码 2:组合代码 3:货币基金代码)
	 */
	private String comtype;
	/**
	 * 基金类型(0: 股票型，1债券型，2货币型，3.积极配置型4，保本型基金，5.保守配置型，6短债型，8，专户理财，9集合理财 ,A 混合型)
	 */
	private String fundtype;
	/**
	 * 基金默认分红方式
	 */
	private String defdividendmethod;
	/**
	 * 基金风险等级
	 */
	private String fundriskgrade;
	/**
	 * 基金风险等级描述
	 */
	private String fundriskgradedesc;
	/**
	 * 基金风险等级信息
	 */
	private String fundriskgradeinfo;

	/**
	 * 基金收益
	 */
	private String totalincome;
	/**
	 * 万份基金单位收益
	 */
	private String ttincome;
	/**
	 * 基金收益率
	 */
	private String incomeyield;
	/**
	 * 备注(用作现金增利产品的说明)
	 */
	private String summary;
	/**
	 * 基金是否可更改分红方式 0:可更改1:不可更改
	 */
	private String dividendmodify;

	/**
	 * 基金是否可定投 0:可定投 1:不可定投
	 */
	private String savepalnmodify;
	/**
	 * 基金是否可销售 0:不可销售难 1:可销售
	 */
	private String disstatus;
	/**
	 * 渠道 0柜台 1电话和柜台 2网银和柜台3全部
	 */
	private String tradingmethod;
	/**
	 * 现金增利标志：00:不可现金增利:不可现金增利:可现金增利:可现金增利
	 */
	private String cashincreflag;

	// `refundmentflag` varchar(8) DEFAULT NULL COMMENT '员工手续费返还标志：0：不返还手续费
	/**
	 * 现金增利对应的原基金代码
	 */
	private String originalfundcode;
	/**
	 * 现金增利扣款周期(0:按月,3:按季)
	 */
	private String investperiods;
	/**
	 * 热销基金标志 0:非热销基金，1:热销基金
	 */
	private String wellsalesflag;

	// //后新增字段
	/**
	 * 1:认购期返还手续费 2：申购期返还手续费 3：认/申购期间均返还
	 */
	private String refundmentflag;
	/**
	 * 认购期最后一日收市时间
	 */
	private String substime;
	/**
	 * 是否为短债基金 0:否 1:是
	 */
	private String bondflag;
	/**
	 * 申购手续费划拨方式0手续费留存代销 1手续费上报TA',
	 */
	private String chargemode;
	/**
	 * 认购手续费划拨方式0手续费留存代销1手续费上报TA
	 */
	private String chargemode_rg;
	/**
	 * 收费方式
	 */
	private String shareclass;
	/**
	 * 转托管状态
	 */
	private String trusteestatus;

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

	public String getFundname() {
		return fundname;
	}

	public void setFundname(String fundname) {
		this.fundname = fundname;
	}

	public String getFundnameeng() {
		return fundnameeng;
	}

	public void setFundnameeng(String fundnameeng) {
		this.fundnameeng = fundnameeng;
	}

	public String getTotalfundvol() {
		return totalfundvol;
	}

	public void setTotalfundvol(String totalfundvol) {
		this.totalfundvol = totalfundvol;
	}

	public String getFundstatus() {
		return fundstatus;
	}

	public void setFundstatus(String fundstatus) {
		this.fundstatus = fundstatus;
	}

	public String getNav() {
		return nav;
	}

	public void setNav(String nav) {
		this.nav = nav;
	}

	public String getCurrencytype() {
		return currencytype;
	}

	public void setCurrencytype(String currencytype) {
		this.currencytype = currencytype;
	}

	public String getCustodiancode() {
		return custodiancode;
	}

	public void setCustodiancode(String custodiancode) {
		this.custodiancode = custodiancode;
	}

	public String getTano() {
		return tano;
	}

	public void setTano(String tano) {
		this.tano = tano;
	}

	public String getFundsponsor() {
		return fundsponsor;
	}

	public void setFundsponsor(String fundsponsor) {
		this.fundsponsor = fundsponsor;
	}

	public String getManagercode() {
		return managercode;
	}

	public void setManagercode(String managercode) {
		this.managercode = managercode;
	}

	public String getIpostartdate() {
		return ipostartdate;
	}

	public void setIpostartdate(String ipostartdate) {
		this.ipostartdate = ipostartdate;
	}

	public String getIpoenddate() {
		return ipoenddate;
	}

	public void setIpoenddate(String ipoenddate) {
		this.ipoenddate = ipoenddate;
	}

	public String getFundsize() {
		return fundsize;
	}

	public void setFundsize(String fundsize) {
		this.fundsize = fundsize;
	}

	public String getTradingprice() {
		return tradingprice;
	}

	public void setTradingprice(String tradingprice) {
		this.tradingprice = tradingprice;
	}

	public String getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}

	public String getFacevalue() {
		return facevalue;
	}

	public void setFacevalue(String facevalue) {
		this.facevalue = facevalue;
	}

	public String getConvertstatus() {
		return convertstatus;
	}

	public void setConvertstatus(String convertstatus) {
		this.convertstatus = convertstatus;
	}

	public String getDividentdate() {
		return dividentdate;
	}

	public void setDividentdate(String dividentdate) {
		this.dividentdate = dividentdate;
	}

	public String getRegistrationdate() {
		return registrationdate;
	}

	public void setRegistrationdate(String registrationdate) {
		this.registrationdate = registrationdate;
	}

	public String getSubstype() {
		return substype;
	}

	public void setSubstype(String substype) {
		this.substype = substype;
	}

	public String getNexttradedate() {
		return nexttradedate;
	}

	public void setNexttradedate(String nexttradedate) {
		this.nexttradedate = nexttradedate;
	}

	public String getValueline() {
		return valueline;
	}

	public void setValueline(String valueline) {
		this.valueline = valueline;
	}

	public String getIntmode() {
		return intmode;
	}

	public void setIntmode(String intmode) {
		this.intmode = intmode;
	}

	public String getIntstart() {
		return intstart;
	}

	public void setIntstart(String intstart) {
		this.intstart = intstart;
	}

	public String getIntenddate() {
		return intenddate;
	}

	public void setIntenddate(String intenddate) {
		this.intenddate = intenddate;
	}

	public String getAccumulativenav() {
		return accumulativenav;
	}

	public void setAccumulativenav(String accumulativenav) {
		this.accumulativenav = accumulativenav;
	}

	public String getFeefactor() {
		return feefactor;
	}

	public void setFeefactor(String feefactor) {
		this.feefactor = feefactor;
	}

	public String getComtype() {
		return comtype;
	}

	public void setComtype(String comtype) {
		this.comtype = comtype;
	}

	public String getFundtype() {
		return fundtype;
	}

	public void setFundtype(String fundtype) {
		this.fundtype = fundtype;
	}

	public String getDefdividendmethod() {
		return defdividendmethod;
	}

	public void setDefdividendmethod(String defdividendmethod) {
		this.defdividendmethod = defdividendmethod;
	}

	public String getFundriskgrade() {
		return fundriskgrade;
	}

	public void setFundriskgrade(String fundriskgrade) {
		this.fundriskgrade = fundriskgrade;
	}

	public String getFundriskgradedesc() {
		return fundriskgradedesc;
	}

	public void setFundriskgradedesc(String fundriskgradedesc) {
		this.fundriskgradedesc = fundriskgradedesc;
	}

	public String getFundriskgradeinfo() {
		return fundriskgradeinfo;
	}

	public void setFundriskgradeinfo(String fundriskgradeinfo) {
		this.fundriskgradeinfo = fundriskgradeinfo;
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

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDividendmodify() {
		return dividendmodify;
	}

	public void setDividendmodify(String dividendmodify) {
		this.dividendmodify = dividendmodify;
	}

	public String getSavepalnmodify() {
		return savepalnmodify;
	}

	public void setSavepalnmodify(String savepalnmodify) {
		this.savepalnmodify = savepalnmodify;
	}

	public String getDisstatus() {
		return disstatus;
	}

	public void setDisstatus(String disstatus) {
		this.disstatus = disstatus;
	}

	public String getTradingmethod() {
		return tradingmethod;
	}

	public void setTradingmethod(String tradingmethod) {
		this.tradingmethod = tradingmethod;
	}

	public String getCashincreflag() {
		return cashincreflag;
	}

	public void setCashincreflag(String cashincreflag) {
		this.cashincreflag = cashincreflag;
	}

	public String getOriginalfundcode() {
		return originalfundcode;
	}

	public void setOriginalfundcode(String originalfundcode) {
		this.originalfundcode = originalfundcode;
	}

	public String getInvestperiods() {
		return investperiods;
	}

	public void setInvestperiods(String investperiods) {
		this.investperiods = investperiods;
	}

	public String getWellsalesflag() {
		return wellsalesflag;
	}

	public void setWellsalesflag(String wellsalesflag) {
		this.wellsalesflag = wellsalesflag;
	}

	public String getRefundmentflag() {
		return refundmentflag;
	}

	public void setRefundmentflag(String refundmentflag) {
		this.refundmentflag = refundmentflag;
	}

	public String getSubstime() {
		return substime;
	}

	public void setSubstime(String substime) {
		this.substime = substime;
	}

	public String getBondflag() {
		return bondflag;
	}

	public void setBondflag(String bondflag) {
		this.bondflag = bondflag;
	}

	public String getChargemode() {
		return chargemode;
	}

	public void setChargemode(String chargemode) {
		this.chargemode = chargemode;
	}

	public String getChargemode_rg() {
		return chargemode_rg;
	}

	public void setChargemode_rg(String chargemode_rg) {
		this.chargemode_rg = chargemode_rg;
	}

	public String getShareclass() {
		return shareclass;
	}

	public void setShareclass(String shareclass) {
		this.shareclass = shareclass;
	}

	public String getTrusteestatus() {
		return trusteestatus;
	}

	public void setTrusteestatus(String trusteestatus) {
		this.trusteestatus = trusteestatus;
	}

	public String getDefdividendmethoddesc() {
		if (StringUtil.isEmpty(defdividendmethod)) {
			return "红利再投";
		}
		return PinganConstants.optypeMap.get(defdividendmethod);
	}

	public String getFundRiskGradeDesc() {
		String fundRiskGradeDesc = "";
		if("1".equals(fundriskgrade)){
			fundRiskGradeDesc = "低";
		}else if("2".equals(fundriskgrade)){
			fundRiskGradeDesc = "中低";
		}else if("3".equals(fundriskgrade)){
			fundRiskGradeDesc = "中";
		}else if("4".equals(fundriskgrade)){
			fundRiskGradeDesc = "中高";
		}else if("5".equals(fundriskgrade)){
			fundRiskGradeDesc = "高";
		}
		return fundRiskGradeDesc;
	}

	public String getFundtypedesc() {
		if (StringUtil.isEmpty(fundtype)) {
			return "";
		}
		return HsConstants.fundtypeMap.get(fundtype);
	}

}
