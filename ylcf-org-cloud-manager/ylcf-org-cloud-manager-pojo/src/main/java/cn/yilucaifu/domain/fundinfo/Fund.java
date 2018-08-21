/**
 * 
 */
package cn.yilucaifu.domain.fundinfo;

import cn.yilucaifu.utils.YLCFConstants;

import java.io.Serializable;
import java.util.List;

/**
 * @author Administrator
 * 
 */
public class Fund implements Serializable {

	
	/**
	 * 资产规模（万元）
	 */
	private String mergeequity;
	
	public String getMergeequity() {
		return mergeequity;
	}

	public void setMergeequity(String mergeequity) {
		this.mergeequity = mergeequity;
	}

	private String chi_spell_2;

	public String getChi_spell_2() {
		return chi_spell_2;
	}

	public void setChi_spell_2(String chi_spell_2) {
		this.chi_spell_2 = chi_spell_2;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -4948983267453512134L;
	/**
	 * 内部代码
	 */
	private String INNER_CODE;
	/**
	 * 基金代码
	 */
	private String FUND_CODE;
	/**
	 * 基金名称
	 */
	private String FUNDSNAME;

	/**
	 * 基金全称
	 */
	private String FUNDNAME;
	/**
	 * 基金管理者名称
	 */
	private String MANA_NAME;

	/**
	 * 组织机构名称
	 */
	private String MANA_ORG_NAME;
	/**
	 * 托管人
	 */
	private String trup_name;
	/**
	 * 基金类型
	 */
	private String INVST_TYPE_MARK;
	/**
	 * 最新净值数据发布日期日期
	 */
	private String ENDDATE;
	/**
	 * 单位净值
	 */
	private float UNIT_NET;

	/**
	 * 复权单位净值
	 */
	private float fac_unit_net;
	/**
	 * 累计净值/七日年化
	 */
	private float ACCUM_NET;
	/**
	 * 累计净值/七日年化
	 * 用于多个比较
	 */
	private Float ACCUM_NET_COMPARE;
	/**
	 * 最新净值增长率发布日期
	 */
	private String TRADEDATE;
	/**
	 * 单日净值变化
	 */
	private float UNIT_NET_CHNG_PCT;
	/**
	 * 一周
	 */
	private float UNIT_NET_CHNG_PCT_1_WEEK;
	/**
	 * 一月
	 */
	private float UNIT_NET_CHNG_PCT_1_MON;
	/**
	 * 3个月
	 */
	private float UNIT_NET_CHNG_PCT_3_MON;
	/**
	 * 6个月
	 */
	private float UNIT_NET_CHNG_PCT_6_MON;
	/**
	 * 一年
	 */
	private float UNIT_NET_CHNG_PCT_1_YEAR;

	private float UNIT_NET_CHNG_PCT_2_YEAR;

	private float UNIT_NET_CHNG_PCT_3_YEAR;

	/**
	 * 今年以来
	 */
	private float UNIT_NET_CHNG_PCT_TYEAR;

	/**
	 * 成立以来
	 */
	private float UNIT_NET_CHNG_PCT_BASE;

	/**
	 * 基金ID
	 */
	private String FUND_ID;
	/**
	 * 投资限额
	 */
	private long QUOTA;
	/**
	 * 投资限额单位
	 */
	private String QUOTA_UNIT_MARK;
	/**
	 * 资产规模（亿元）
	 */
	private float merge_equity;

	/**
	 * 基金经理
	 */
	private List<FundManager> fund_manager;
	/**
	 * 成立日期
	 */
	private String estab_date;
	/**
	 * 总净资产
	 */
	private float total_assets;

	/**
	 * 分红方式说明
	 */
	private String div_cls_mark;

	/**
	 * 分红方式
	 */
	private String div_cls;

	/**
	 * 是否可购买,1可购买,0,不可购买,默认为0
	 */
	private int status;
	/**
	 * 是否可定投,1可定投,0,不可定投,默认为0
	 */
	private int is_auto_invest;
	/**
	 * 基金折扣
	 */
	private String FUND_RATE;
	/**
	 * 推荐内容
	 */
	private String recommendContent;

	/**
	 * 以前费率
	 * 
	 */
	private float chag_rate_up_lim;
	/**
	 * 当前费率
	 * 
	 */
	private float CUR_FUND_RATE;
	/**
	 * 卖了多少钱
	 */
	private float appl_shares;
	/**
	 * 基金类型
	 */
	private int fund_type;

	private int fund_status = 0;

	/**
	 * 最高收益名称
	 * 
	 * @return
	 */
	private String HIGH_CHNG_NAME;
	/**
	 * 最高收益
	 * 
	 * @return
	 */
	private String HIGH_CHNG_PIC;
	// 人工操作的管理状态
	private String MANAGE_STATUS;

	// 募集结束时间
	private String raiseEnddate;

	private String is_quick_redeem;
	
	private String INDI_NAME;//高管姓名
	
	private String string_UNIT_NET;//String型单位净值
	
	private String string_UNIT_NET_CHNG_PCT;//String型日涨幅
	
	private String string_accum_NET;//String型  累计净值/七日年化
	private String AUTO_INVEST_FUND_RATE;//定投折扣
	public String getAUTO_INVEST_FUND_RATE() {
		return AUTO_INVEST_FUND_RATE;
	}

	public void setAUTO_INVEST_FUND_RATE(String AUTO_INVEST_FUND_RATE) {
		this.AUTO_INVEST_FUND_RATE = AUTO_INVEST_FUND_RATE;
	}

	public int getFund_status() {
		return fund_status;
	}

	public void setFund_status(int fund_status) {
		this.fund_status = fund_status;
	}

	public float getChag_rate_up_lim() {
		return chag_rate_up_lim;
	}

	public void setChag_rate_up_lim(float chag_rate_up_lim) {
		this.chag_rate_up_lim = chag_rate_up_lim;
	}

	public float getCUR_FUND_RATE() {
		return CUR_FUND_RATE;
	}

	public void setCUR_FUND_RATE(float cUR_FUND_RATE) {
		CUR_FUND_RATE = cUR_FUND_RATE;
	}

	/**
	 * @return the trup_name
	 */
	public String getTrup_name() {
		return trup_name;
	}

	/**
	 * @param trup_name
	 *            the trup_name to set
	 */
	public void setTrup_name(String trup_name) {
		this.trup_name = trup_name;
	}

	/**
	 * @return the estab_date
	 */
	public String getEstab_date() {
		return estab_date;
	}

	/**
	 * @param estab_date
	 *            the estab_date to set
	 */
	public void setEstab_date(String estab_date) {
		this.estab_date = estab_date;
	}

	/**
	 * @return the total_assets
	 */
	public float getTotal_assets() {
		return total_assets;
	}

	/**
	 * @param total_assets
	 *            the total_assets to set
	 */
	public void setTotal_assets(float total_assets) {
		this.total_assets = total_assets;
	}

	/**
	 * @return the iNNER_CODE
	 */
	public String getINNER_CODE() {
		return INNER_CODE;
	}

	/**
	 * @param iNNER_CODE
	 *            the iNNER_CODE to set
	 */
	public void setINNER_CODE(String iNNER_CODE) {
		INNER_CODE = iNNER_CODE;
	}

	/**
	 * @return the fUND_CODE
	 */
	public String getFUND_CODE() {
		return FUND_CODE;
	}

	/**
	 * @param fUND_CODE
	 *            the fUND_CODE to set
	 */
	public void setFUND_CODE(String fUND_CODE) {
		FUND_CODE = fUND_CODE;
	}

	/**
	 * @return the fUNDSNAME
	 */
	public String getFUNDSNAME() {
		return FUNDSNAME;
	}

	/**
	 * @param fUNDSNAME
	 *            the fUNDSNAME to set
	 */
	public void setFUNDSNAME(String fUNDSNAME) {

		FUNDSNAME = fUNDSNAME;

	}

	/**
	 * @return the mANA_NAME
	 */
	public String getMANA_NAME() {
		return MANA_NAME;
	}

	/**
	 * @param mANA_NAME
	 *            the mANA_NAME to set
	 */
	public void setMANA_NAME(String mANA_NAME) {
		MANA_NAME = mANA_NAME;
	}

	/**
	 * @return the iNVST_TYPE_MARK
	 */
	public String getINVST_TYPE_MARK() {
		return INVST_TYPE_MARK;
	}

	/**
	 * @param iNVST_TYPE_MARK
	 *            the iNVST_TYPE_MARK to set
	 */
	public void setINVST_TYPE_MARK(String iNVST_TYPE_MARK) {
		INVST_TYPE_MARK = iNVST_TYPE_MARK;
	}

	/**
	 * @return the eNDDATE
	 */
	public String getENDDATE() {
		return ENDDATE;
	}

	/**
	 * @param eNDDATE
	 *            the eNDDATE to set
	 */
	public void setENDDATE(String eNDDATE) {
		ENDDATE = eNDDATE;
	}

	/**
	 * @return the uNIT_NET
	 */
	public float getUNIT_NET() {
		return UNIT_NET;
	}

	/**
	 * @param uNIT_NET
	 *            the uNIT_NET to set
	 */
	public void setUNIT_NET(float uNIT_NET) {
		UNIT_NET = uNIT_NET;
	}

	/**
	 * @return the aCCUM_NET
	 */
	public float getACCUM_NET() {
		return ACCUM_NET;
	}

	/**
	 * @param aCCUM_NET
	 *            the aCCUM_NET to set
	 */
	public void setACCUM_NET(float aCCUM_NET) {
		ACCUM_NET = aCCUM_NET;
	}

	/**
	 * @return the tRADEDATE
	 */
	public String getTRADEDATE() {
		return TRADEDATE;
	}

	/**
	 * @param tRADEDATE
	 *            the tRADEDATE to set
	 */
	public void setTRADEDATE(String tRADEDATE) {
		TRADEDATE = tRADEDATE;
	}

	/**
	 * @return the uNIT_NET_CHNG_PCT
	 */
	public float getUNIT_NET_CHNG_PCT() {
		return UNIT_NET_CHNG_PCT;
	}

	/**
	 * @param uNIT_NET_CHNG_PCT
	 *            the uNIT_NET_CHNG_PCT to set
	 */
	public void setUNIT_NET_CHNG_PCT(float uNIT_NET_CHNG_PCT) {
		UNIT_NET_CHNG_PCT = uNIT_NET_CHNG_PCT;
	}

	/**
	 * @return the uNIT_NET_CHNG_PCT_1_WEEK
	 */
	public float getUNIT_NET_CHNG_PCT_1_WEEK() {
		return UNIT_NET_CHNG_PCT_1_WEEK;
	}

	/**
	 * @param uNIT_NET_CHNG_PCT_1_WEEK
	 *            the uNIT_NET_CHNG_PCT_1_WEEK to set
	 */
	public void setUNIT_NET_CHNG_PCT_1_WEEK(float uNIT_NET_CHNG_PCT_1_WEEK) {
		UNIT_NET_CHNG_PCT_1_WEEK = uNIT_NET_CHNG_PCT_1_WEEK;
	}

	/**
	 * @return the uNIT_NET_CHNG_PCT_1_MON
	 */
	public float getUNIT_NET_CHNG_PCT_1_MON() {
		return UNIT_NET_CHNG_PCT_1_MON;
	}

	/**
	 * @param uNIT_NET_CHNG_PCT_1_MON
	 *            the uNIT_NET_CHNG_PCT_1_MON to set
	 */
	public void setUNIT_NET_CHNG_PCT_1_MON(float uNIT_NET_CHNG_PCT_1_MON) {
		UNIT_NET_CHNG_PCT_1_MON = uNIT_NET_CHNG_PCT_1_MON;
	}

	/**
	 * @return the uNIT_NET_CHNG_PCT_3_MON
	 */
	public float getUNIT_NET_CHNG_PCT_3_MON() {
		return UNIT_NET_CHNG_PCT_3_MON;
	}

	/**
	 * @param uNIT_NET_CHNG_PCT_3_MON
	 *            the uNIT_NET_CHNG_PCT_3_MON to set
	 */
	public void setUNIT_NET_CHNG_PCT_3_MON(float uNIT_NET_CHNG_PCT_3_MON) {
		UNIT_NET_CHNG_PCT_3_MON = uNIT_NET_CHNG_PCT_3_MON;
	}

	/**
	 * @return the uNIT_NET_CHNG_PCT_6_MON
	 */
	public float getUNIT_NET_CHNG_PCT_6_MON() {
		return UNIT_NET_CHNG_PCT_6_MON;
	}

	/**
	 * @param uNIT_NET_CHNG_PCT_6_MON
	 *            the uNIT_NET_CHNG_PCT_6_MON to set
	 */
	public void setUNIT_NET_CHNG_PCT_6_MON(float uNIT_NET_CHNG_PCT_6_MON) {
		UNIT_NET_CHNG_PCT_6_MON = uNIT_NET_CHNG_PCT_6_MON;
	}

	/**
	 * @return the uNIT_NET_CHNG_PCT_1_YEAR
	 */
	public float getUNIT_NET_CHNG_PCT_1_YEAR() {
		return UNIT_NET_CHNG_PCT_1_YEAR;
	}

	/**
	 * @param uNIT_NET_CHNG_PCT_1_YEAR
	 *            the uNIT_NET_CHNG_PCT_1_YEAR to set
	 */
	public void setUNIT_NET_CHNG_PCT_1_YEAR(float uNIT_NET_CHNG_PCT_1_YEAR) {
		UNIT_NET_CHNG_PCT_1_YEAR = uNIT_NET_CHNG_PCT_1_YEAR;
	}

	/**
	 * @return the uNIT_NET_CHNG_PCT_2_YEAR
	 */
	public float getUNIT_NET_CHNG_PCT_2_YEAR() {
		return UNIT_NET_CHNG_PCT_2_YEAR;
	}

	/**
	 * @param uNIT_NET_CHNG_PCT_2_YEAR
	 *            the uNIT_NET_CHNG_PCT_2_YEAR to set
	 */
	public void setUNIT_NET_CHNG_PCT_2_YEAR(float uNIT_NET_CHNG_PCT_2_YEAR) {
		UNIT_NET_CHNG_PCT_2_YEAR = uNIT_NET_CHNG_PCT_2_YEAR;
	}

	/**
	 * @return the uNIT_NET_CHNG_PCT_3_YEAR
	 */
	public float getUNIT_NET_CHNG_PCT_3_YEAR() {
		return UNIT_NET_CHNG_PCT_3_YEAR;
	}

	/**
	 * @param uNIT_NET_CHNG_PCT_3_YEAR
	 *            the uNIT_NET_CHNG_PCT_3_YEAR to set
	 */
	public void setUNIT_NET_CHNG_PCT_3_YEAR(float uNIT_NET_CHNG_PCT_3_YEAR) {
		UNIT_NET_CHNG_PCT_3_YEAR = uNIT_NET_CHNG_PCT_3_YEAR;
	}

	/**
	 * @return the fUND_ID
	 */
	public String getFUND_ID() {
		return FUND_ID;
	}

	/**
	 * @param fUND_ID
	 *            the fUND_ID to set
	 */
	public void setFUND_ID(String fUND_ID) {
		FUND_ID = fUND_ID;
	}

	/**
	 * @return the fUNDNAME
	 */
	public String getFUNDNAME() {
		return FUNDNAME;
	}

	/**
	 * @param fUNDNAME
	 *            the fUNDNAME to set
	 */
	public void setFUNDNAME(String fUNDNAME) {
		FUNDNAME = fUNDNAME;
	}

	/**
	 * @return the qUOTA
	 */
	public long getQUOTA() {
		return QUOTA;
	}

	/**
	 * @param qUOTA
	 *            the qUOTA to set
	 */
	public void setQUOTA(long qUOTA) {
		QUOTA = qUOTA;
	}

	/**
	 * @return the qUOTA_UNIT_MARK
	 */
	public String getQUOTA_UNIT_MARK() {
		return QUOTA_UNIT_MARK;
	}

	/**
	 * @param qUOTA_UNIT_MARK
	 *            the qUOTA_UNIT_MARK to set
	 */
	public void setQUOTA_UNIT_MARK(String qUOTA_UNIT_MARK) {
		QUOTA_UNIT_MARK = qUOTA_UNIT_MARK;
	}

	/**
	 * @return the merge_equity
	 */
	public float getMerge_equity() {
		return merge_equity;
	}

	/**
	 * @param merge_equity
	 *            the merge_equity to set
	 */
	public void setMerge_equity(float merge_equity) {
		this.merge_equity = merge_equity;
	}

	public String getDiv_cls_mark() {
		return div_cls_mark;
	}

	public void setDiv_cls_mark(String div_cls_mark) {
		this.div_cls_mark = div_cls_mark;
	}

	public String getDiv_cls() {
		return div_cls;
	}

	public void setDiv_cls(String div_cls) {
		this.div_cls = div_cls;
	}

	public float getUNIT_NET_CHNG_PCT_TYEAR() {
		return UNIT_NET_CHNG_PCT_TYEAR;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public void setUNIT_NET_CHNG_PCT_TYEAR(float uNIT_NET_CHNG_PCT_TYEAR) {
		UNIT_NET_CHNG_PCT_TYEAR = uNIT_NET_CHNG_PCT_TYEAR;
	}

	public float getUNIT_NET_CHNG_PCT_BASE() {
		return UNIT_NET_CHNG_PCT_BASE;
	}

	public void setUNIT_NET_CHNG_PCT_BASE(float uNIT_NET_CHNG_PCT_BASE) {
		UNIT_NET_CHNG_PCT_BASE = uNIT_NET_CHNG_PCT_BASE;
	}

	/**
	 * @return the fund_manager
	 */
	public List<FundManager> getFund_manager() {
		return fund_manager;
	}

	public String getFUND_RATE() {
		return FUND_RATE;
	}

	public void setFUND_RATE(String fUND_RATE) {
		FUND_RATE = fUND_RATE;
	}

	/**
	 * @param fund_manager
	 *            the fund_manager to set
	 */
	public void setFund_manager(List<FundManager> fund_manager) {
		this.fund_manager = fund_manager;
	}

	/**
	 * @return the fac_unit_net
	 */
	public float getFac_unit_net() {
		return fac_unit_net;
	}

	/**
	 * @param fac_unit_net
	 *            the fac_unit_net to set
	 */
	public void setFac_unit_net(float fac_unit_net) {
		this.fac_unit_net = fac_unit_net;
	}

	public int getIs_auto_invest() {
		return is_auto_invest;
	}

	public void setIs_auto_invest(int is_auto_invest) {
		this.is_auto_invest = is_auto_invest;
	}

	public String getRecommendContent() {
		return recommendContent;
	}

	public void setRecommendContent(String recommendContent) {
		this.recommendContent = recommendContent;
	}

	public float getAppl_shares() {
		return appl_shares;
	}

	public void setAppl_shares(float appl_shares) {
		this.appl_shares = appl_shares;
	}

	public int getFund_type() {
		return fund_type;
	}

	public void setFund_type(int fund_type) {
		this.fund_type = fund_type;
	}

	public String getMANA_ORG_NAME() {
		return MANA_ORG_NAME;
	}

	public void setMANA_ORG_NAME(String mANA_ORG_NAME) {
		MANA_ORG_NAME = mANA_ORG_NAME;
	}

	public String getHIGH_CHNG_NAME() {
		return HIGH_CHNG_NAME;
	}

	public void setHIGH_CHNG_NAME(String hIGH_CHNG_NAME) {
		HIGH_CHNG_NAME = hIGH_CHNG_NAME;
	}

	public String getHIGH_CHNG_PIC() {
		return HIGH_CHNG_PIC;
	}

	public void setHIGH_CHNG_PIC(String hIGH_CHNG_PIC) {
		HIGH_CHNG_PIC = hIGH_CHNG_PIC;
	}

	public String getMANAGE_STATUS() {
		return MANAGE_STATUS;
	}

	public void setMANAGE_STATUS(String mANAGE_STATUS) {
		MANAGE_STATUS = mANAGE_STATUS;
	}

	/**
	 * @return the raiseEnddate
	 */
	public String getRaiseEnddate() {
		return raiseEnddate;
	}

	/**
	 * @param raiseEnddate
	 *            the raiseEnddate to set
	 */
	public void setRaiseEnddate(String raiseEnddate) {
		this.raiseEnddate = raiseEnddate;
	}

	public String getIs_quick_redeem() {
		return is_quick_redeem;
	}

	public void setIs_quick_redeem(String is_quick_redeem) {
		this.is_quick_redeem = is_quick_redeem;
	}

	public String getFundTypeDesc() {
		return YLCFConstants.fundTypeNanmeMap.get(fund_type + "");
	}

	public String getINDI_NAME() {
		return INDI_NAME;
	}

	public void setINDI_NAME(String INDI_NAME) {
		this.INDI_NAME =INDI_NAME;
	}

	public Float getACCUM_NET_COMPARE() {
		return ACCUM_NET_COMPARE;
	}

	public void setACCUM_NET_COMPARE(Float aCCUM_NET_COMPARE) {
		ACCUM_NET_COMPARE = aCCUM_NET_COMPARE;
	}

	public String getString_UNIT_NET() {
		return string_UNIT_NET;
	}

	public void setString_UNIT_NET(String string_UNIT_NET) {
		this.string_UNIT_NET = string_UNIT_NET;
	}

	public String getString_UNIT_NET_CHNG_PCT() {
		return string_UNIT_NET_CHNG_PCT;
	}

	public void setString_UNIT_NET_CHNG_PCT(String string_UNIT_NET_CHNG_PCT) {
		this.string_UNIT_NET_CHNG_PCT = string_UNIT_NET_CHNG_PCT;
	}

	public String getString_accum_NET() {
		return string_accum_NET;
	}

	public void setString_accum_NET(String string_accum_NET) {
		this.string_accum_NET = string_accum_NET;
	}
	
}
