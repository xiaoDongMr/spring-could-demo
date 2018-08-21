/**
 * 
 */
package cn.yilucaifu.domain.fundinfo;

import java.io.Serializable;

/**
 * @author zhangpeng
 * @version 创建时间：2013-11-7 下午5:47:28 类说明
 */

public class MobileFund implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3169217757034042576L;
	/**
	 * 内部代码
	 */
	private String inner_code;
	/**
	 * 基金代码
	 */
	private String fund_code;
	/**
	 * 基金名称
	 */
	private String fundsname;

	/**
	 * 基金全称
	 */
	private String fundname;
	/**
	 * 基金管理者名称
	 */
	private String mana_name;

	// 基金经理
	private String indi_name;

	public String getIndi_name() {
		return indi_name;
	}

	public void setIndi_name(String indi_name) {
		this.indi_name = indi_name;
	}

	/**
	 * 
	 */
	private String fund_type;
	
	/**
	 * 托管人
	 */
	private String trup_name;
	/**
	 * 基金类型
	 */
	private String invst_type_mark;
	/**
	 * 最新净值数据发布日期日期
	 */
	private String endDate;
	/**
	 * 单位净值(万份收益)
	 */
	private float unit_net;
	/**
	 * 累计净值/七日年化
	 */
	private float accum_net;
	/**
	 * 最新净值增长率发布日期
	 */
	private String tradeDate;
	/**
	 * 单日净值变化
	 */
	private float unit_net_chng_pct;
	/**
	 * 一周
	 */
	private float unit_net_chng_pct_1_week;
	/**
	 * 一月
	 */
	private float unit_net_chng_pct_1_mon;
	/**
	 * 3个月
	 */
	private float unit_net_chng_pct_3_mon;
	/**
	 * 6个月
	 */
	private float unit_net_chng_pct_6_mon;
	/**
	 * 一年
	 */
	private float unit_net_chng_pct_1_year;

	/**
	 * 今年以来
	 */
	private float unit_net_chng_pct_tyear;

	/**
	 * 成立以来
	 */
	private float unit_net_chng_pct_base;

	/**
	 * 基金ID
	 */
	private String fund_id;
	/**
	 * 投资限额
	 */
	private float quota;
	/**
	 * 投资限额单位
	 */
	private String quota_unit_mark;
	/**
	 * 资产规模（亿元）
	 */
	private float merge_equity;

	/**
	 * 基金经理
	 */
	private String fund_manager;
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
	 * 是否可购买，0，不可购买，1 可购买
	 */
	private int status;

	private String comment;
	/**
	 * 近期收益
	 */
	private float profit;
	private float callRate;
	private float rate;
	private int isCollect;
	private float appl_shares;
	private String bank_rate;
	private int fund_charg_type;// 前后收费
	private String fund_rate;// 折扣
	/**
	 * 广告文案
	 * 
	 */
	private String adCopy;
	/**
	 * 选择展示数据
	 */
	private String sign;

	private int fund_status;

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
	private String cur_fund_ratestr;
	// 盈利指数、风险指数、稳定指数、是否为推荐、是否售罄


	private String profitIndex;// 盈利指数
	public String getCur_fund_ratestr() {
		return cur_fund_ratestr;
	}

	public void setCur_fund_ratestr(String cur_fund_ratestr) {
		this.cur_fund_ratestr = cur_fund_ratestr;
	}

	private String riskIndex;// 风险指数
	private String stabilityIndex;// 稳定指数
	private int isRecommand;// 是否为推荐
	private int isSellOut;// 是否售罄
	private int days;//升级天数
	
	private String level;// 等级
	
	private int position; //排位
	private String alias; // 别名
	
	/**
	 * 是否可定投,1可定投,0,不可定投,默认为0
	 */
	private int is_auto_invest;
	
	public int getIs_auto_invest() {
		return is_auto_invest;
	}

	public void setIs_auto_invest(int is_auto_invest) {
		this.is_auto_invest = is_auto_invest;
	}

	/**
	 * 是否可转换,1可转换,0,不可转换,默认为1
	 */
	private int is_transfer;

	public int getIs_transfer() {
		return is_transfer;
	}

	public void setIs_transfer(int is_transfer) {
		this.is_transfer = is_transfer;
	}

	/**
	 * 最高收益名称
	 * 
	 * @return
	 */
	private String high_chng_name;
	/**
	 * 最高收益
	 * 
	 * @return
	 */
	private String high_chng_pic;

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

	public int getFund_status() {
		return fund_status;
	}

	public void setFund_status(int fund_status) {
		this.fund_status = fund_status;
	}

	public int getFund_charg_type() {
		return fund_charg_type;
	}

	public void setFund_charg_type(int fund_charg_type) {
		this.fund_charg_type = fund_charg_type;
	}

	public String getFund_rate() {
		return fund_rate;
	}

	public void setFund_rate(String fund_rate) {
		this.fund_rate = fund_rate;
	}

	/**
	 * 已购买收益
	 */
	private float pingan_profit;

	/**
	 * @return the inner_code
	 */
	public String getInner_code() {
		return inner_code;
	}

	/**
	 * @param inner_code
	 *            the inner_code to set
	 */
	public void setInner_code(String inner_code) {
		this.inner_code = inner_code;
	}

	/**
	 * @return the fund_code
	 */
	public String getFund_code() {
		return fund_code;
	}

	/**
	 * @param fund_code
	 *            the fund_code to set
	 */
	public void setFund_code(String fund_code) {
		this.fund_code = fund_code;
	}

	/**
	 * @return the fundsname
	 */
	public String getFundsname() {
		return fundsname;
	}

	/**
	 * @param fundsname
	 *            the fundsname to set
	 */
	public void setFundsname(String fundsname) {

		this.fundsname = fundsname;

	}

	/**
	 * @return the fundname
	 */
	public String getFundname() {
		return fundname;
	}

	/**
	 * @param fundname
	 *            the fundname to set
	 */
	public void setFundname(String fundname) {
		this.fundname = fundname;
	}

	/**
	 * @return the mana_name
	 */
	public String getMana_name() {
		return mana_name;
	}

	/**
	 * @param mana_name
	 *            the mana_name to set
	 */
	public void setMana_name(String mana_name) {
		this.mana_name = mana_name;
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
	 * @return the invst_type_mark
	 */
	public String getInvst_type_mark() {
		return invst_type_mark;
	}

	/**
	 * @param invst_type_mark
	 *            the invst_type_mark to set
	 */
	public void setInvst_type_mark(String invst_type_mark) {
		this.invst_type_mark = invst_type_mark;
	}

	/**
	 * @return the endDate
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate
	 *            the endDate to set
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the unit_net
	 */
	public float getUnit_net() {
		return unit_net;
	}

	/**
	 * @param unit_net
	 *            the unit_net to set
	 */
	public void setUnit_net(float unit_net) {
		this.unit_net = unit_net;
	}

	/**
	 * @return the accum_net
	 */
	public float getAccum_net() {
		return accum_net;
	}

	/**
	 * @param accum_net
	 *            the accum_net to set
	 */
	public void setAccum_net(float accum_net) {
		this.accum_net = accum_net;
	}

	/**
	 * @return the tradeDate
	 */
	public String getTradeDate() {
		return tradeDate;
	}

	/**
	 * @param tradeDate
	 *            the tradeDate to set
	 */
	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}

	/**
	 * @return the unit_net_chng_pct
	 */
	public float getUnit_net_chng_pct() {
		return unit_net_chng_pct;
	}

	/**
	 * @param unit_net_chng_pct
	 *            the unit_net_chng_pct to set
	 */
	public void setUnit_net_chng_pct(float unit_net_chng_pct) {
		this.unit_net_chng_pct = unit_net_chng_pct;
	}

	/**
	 * @return the unit_net_chng_pct_1_week
	 */
	public float getUnit_net_chng_pct_1_week() {
		return unit_net_chng_pct_1_week;
	}

	/**
	 * @param unit_net_chng_pct_1_week
	 *            the unit_net_chng_pct_1_week to set
	 */
	public void setUnit_net_chng_pct_1_week(float unit_net_chng_pct_1_week) {
		this.unit_net_chng_pct_1_week = unit_net_chng_pct_1_week;
	}

	/**
	 * @return the unit_net_chng_pct_1_mon
	 */
	public float getUnit_net_chng_pct_1_mon() {
		return unit_net_chng_pct_1_mon;
	}

	/**
	 * @param unit_net_chng_pct_1_mon
	 *            the unit_net_chng_pct_1_mon to set
	 */
	public void setUnit_net_chng_pct_1_mon(float unit_net_chng_pct_1_mon) {
		this.unit_net_chng_pct_1_mon = unit_net_chng_pct_1_mon;
	}

	/**
	 * @return the unit_net_chng_pct_3_mon
	 */
	public float getUnit_net_chng_pct_3_mon() {
		return unit_net_chng_pct_3_mon;
	}

	/**
	 * @param unit_net_chng_pct_3_mon
	 *            the unit_net_chng_pct_3_mon to set
	 */
	public void setUnit_net_chng_pct_3_mon(float unit_net_chng_pct_3_mon) {
		this.unit_net_chng_pct_3_mon = unit_net_chng_pct_3_mon;
	}

	/**
	 * @return the unit_net_chng_pct_6_mon
	 */
	public float getUnit_net_chng_pct_6_mon() {
		return unit_net_chng_pct_6_mon;
	}

	/**
	 * @param unit_net_chng_pct_6_mon
	 *            the unit_net_chng_pct_6_mon to set
	 */
	public void setUnit_net_chng_pct_6_mon(float unit_net_chng_pct_6_mon) {
		this.unit_net_chng_pct_6_mon = unit_net_chng_pct_6_mon;
	}

	/**
	 * @return the unit_net_chng_pct_1_year
	 */
	public float getUnit_net_chng_pct_1_year() {
		return unit_net_chng_pct_1_year;
	}

	/**
	 * @param unit_net_chng_pct_1_year
	 *            the unit_net_chng_pct_1_year to set
	 */
	public void setUnit_net_chng_pct_1_year(float unit_net_chng_pct_1_year) {
		this.unit_net_chng_pct_1_year = unit_net_chng_pct_1_year;
	}

	/**
	 * @return the unit_net_chng_pct_tyear
	 */
	public float getUnit_net_chng_pct_tyear() {
		return unit_net_chng_pct_tyear;
	}

	/**
	 * @param unit_net_chng_pct_tyear
	 *            the unit_net_chng_pct_tyear to set
	 */
	public void setUnit_net_chng_pct_tyear(float unit_net_chng_pct_tyear) {
		this.unit_net_chng_pct_tyear = unit_net_chng_pct_tyear;
	}

	/**
	 * @return the unit_net_chng_pct_base
	 */
	public float getUnit_net_chng_pct_base() {
		return unit_net_chng_pct_base;
	}

	/**
	 * @param unit_net_chng_pct_base
	 *            the unit_net_chng_pct_base to set
	 */
	public void setUnit_net_chng_pct_base(float unit_net_chng_pct_base) {
		this.unit_net_chng_pct_base = unit_net_chng_pct_base;
	}

	/**
	 * @return the fund_id
	 */
	public String getFund_id() {
		return fund_id;
	}

	/**
	 * @param fund_id
	 *            the fund_id to set
	 */
	public void setFund_id(String fund_id) {
		this.fund_id = fund_id;
	}

	/**
	 * @return the quota
	 */
	public float getQuota() {
		return quota;
	}

	/**
	 * @param quota
	 *            the quota to set
	 */
	public void setQuota(float quota) {
		this.quota = quota;
	}

	/**
	 * @return the quota_unit_mark
	 */
	public String getQuota_unit_mark() {
		return quota_unit_mark;
	}

	/**
	 * @param quota_unit_mark
	 *            the quota_unit_mark to set
	 */
	public void setQuota_unit_mark(String quota_unit_mark) {
		this.quota_unit_mark = quota_unit_mark;
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

	/**
	 * @return the fund_manager
	 */
	public String getFund_manager() {
		return fund_manager;
	}

	/**
	 * @param fund_manager
	 *            the fund_manager to set
	 */
	public void setFund_manager(String fund_manager) {
		this.fund_manager = fund_manager;
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
	 * @return the div_cls_mark
	 */
	public String getDiv_cls_mark() {
		return div_cls_mark;
	}

	/**
	 * @param div_cls_mark
	 *            the div_cls_mark to set
	 */
	public void setDiv_cls_mark(String div_cls_mark) {
		this.div_cls_mark = div_cls_mark;
	}

	/**
	 * @return the div_cls
	 */
	public String getDiv_cls() {
		return div_cls;
	}

	/**
	 * @param div_cls
	 *            the div_cls to set
	 */
	public void setDiv_cls(String div_cls) {
		this.div_cls = div_cls;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment
	 *            the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return the profit
	 */
	public float getProfit() {
		return profit;
	}

	/**
	 * @param profit
	 *            the profit to set
	 */
	public void setProfit(float profit) {
		this.profit = profit;
	}

	/**
	 * @return the callRate
	 */
	public float getCallRate() {
		return callRate;
	}

	/**
	 * @param callRate
	 *            the callRate to set
	 */
	public void setCallRate(float callRate) {
		this.callRate = callRate;
	}

	/**
	 * @return the rate
	 */
	public float getRate() {
		return rate;
	}

	/**
	 * @param rate
	 *            the rate to set
	 */
	public void setRate(float rate) {
		this.rate = rate;
	}

	/**
	 * @return the isCollect
	 */
	public int getIsCollect() {
		return isCollect;
	}

	/**
	 * @param isCollect
	 *            the isCollect to set
	 */
	public void setIsCollect(int isCollect) {
		this.isCollect = isCollect;
	}

	/**
	 * @return the appl_shares
	 */
	public float getAppl_shares() {
		return appl_shares;
	}

	/**
	 * @param appl_shares
	 *            the appl_shares to set
	 */
	public void setAppl_shares(float appl_shares) {
		this.appl_shares = appl_shares;
	}

	/**
	 * @return the bank_rate
	 */
	public String getBank_rate() {
		return bank_rate;
	}

	/**
	 * @param bank_rate
	 *            the bank_rate to set
	 */
	public void setBank_rate(String bank_rate) {
		this.bank_rate = bank_rate;
	}

	/**
	 * @return the pingan_profit
	 */
	public float getPingan_profit() {
		return pingan_profit;
	}

	/**
	 * @param pingan_profit
	 *            the pingan_profit to set
	 */
	public void setPingan_profit(float pingan_profit) {
		this.pingan_profit = pingan_profit;
	}

	public String getProfitIndex() {
		return profitIndex;
	}

	public void setProfitIndex(String profitIndex) {
		this.profitIndex = profitIndex;
	}

	public String getRiskIndex() {
		return riskIndex;
	}

	public void setRiskIndex(String riskIndex) {
		this.riskIndex = riskIndex;
	}

	public String getStabilityIndex() {
		return stabilityIndex;
	}

	public void setStabilityIndex(String stabilityIndex) {
		this.stabilityIndex = stabilityIndex;
	}

	public int getIsRecommand() {
		return isRecommand;
	}

	public void setIsRecommand(int isRecommand) {
		this.isRecommand = isRecommand;
	}

	public int getIsSellOut() {
		return isSellOut;
	}

	public void setIsSellOut(int isSellOut) {
		this.isSellOut = isSellOut;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getFund_type() {
		return fund_type;
	}

	public void setFund_type(String fund_type) {
		this.fund_type = fund_type;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
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
	
	private String p2pName;
	private String p2p_periods;
	private String p2pId;
	private String year_earnings;
	private String isend;
	private String sell_time;
	private String deadline;
	private String buy_copies;
	private String buy_money;
	private String earning;
	private String p2pstatus;
	private String app_which;
	private String isNoviceExclusive;
	private String isAppointment;

	private String type; // 0 因

	public String getP2pName() {
		return p2pName;
	}

	public void setP2pName(String p2pName) {
		this.p2pName = p2pName;
	}

	public String getP2p_periods() {
		return p2p_periods;
	}

	public void setP2p_periods(String p2p_periods) {
		this.p2p_periods = p2p_periods;
	}

	public String getP2pId() {
		return p2pId;
	}

	public void setP2pId(String p2pId) {
		this.p2pId = p2pId;
	}

	public String getYear_earnings() {
		return year_earnings;
	}

	public void setYear_earnings(String year_earnings) {
		this.year_earnings = year_earnings;
	}

	public String getIsend() {
		return isend;
	}

	public void setIsend(String isend) {
		this.isend = isend;
	}

	public String getSell_time() {
		return sell_time;
	}

	public void setSell_time(String sell_time) {
		this.sell_time = sell_time;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public String getBuy_copies() {
		return buy_copies;
	}

	public void setBuy_copies(String buy_copies) {
		this.buy_copies = buy_copies;
	}

	public String getBuy_money() {
		return buy_money;
	}

	public void setBuy_money(String buy_money) {
		this.buy_money = buy_money;
	}

	public String getEarning() {
		return earning;
	}

	public void setEarning(String earning) {
		this.earning = earning;
	}

	public String getP2pstatus() {
		return p2pstatus;
	}

	public void setP2pstatus(String p2pstatus) {
		this.p2pstatus = p2pstatus;
	}

	public String getApp_which() {
		return app_which;
	}

	public void setApp_which(String app_which) {
		this.app_which = app_which;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getHigh_chng_name() {
		return high_chng_name;
	}

	public void setHigh_chng_name(String high_chng_name) {
		this.high_chng_name = high_chng_name;
	}

	public String getHigh_chng_pic() {
		return high_chng_pic;
	}

	public void setHigh_chng_pic(String high_chng_pic) {
		this.high_chng_pic = high_chng_pic;
	}

	public String getIsNoviceExclusive() {
		return isNoviceExclusive;
	}

	public void setIsNoviceExclusive(String isNoviceExclusive) {
		this.isNoviceExclusive = isNoviceExclusive;
	}

	public String getAdCopy() {
		return adCopy;
	}

	public void setAdCopy(String adCopy) {
		this.adCopy = adCopy;
	}

	public String getIsAppointment() {
		return isAppointment;
	}

	public void setIsAppointment(String isAppointment) {
		this.isAppointment = isAppointment;
	}
}
