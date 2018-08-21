package cn.yilucaifu.domain.fundinfo;

import java.io.Serializable;

/**
 * Created by yangkang on 2018/1/25 0025.
 * 基金详情一级页面
 */
public class FundDetail implements Serializable {

    private static final long serialVersionUID = -1138746215921667020L;
    /**
     * 基金id
     */
    private String fund_id;

    /**
     * 基金内部代码
     */
    private String inner_code;

    /**
     * 基金代码
     */
    private String fund_code;

    /**
     * 基金全称
     */
    private String fundname;

    /**
     * 基金简称
     */
    private String fundsname;

    /**
     * 非货币：单位净值
     * 货币：每万元基金收益
     */
    private String unit_net;

    /**
     * 非货币：累计净值
     * 货币：七日年化
     */
    private String accum_net;

    /**
     * 日涨幅
     */
    private String unit_net_chng_pct;


    /**
     * 近1周涨幅(非货币)
     */
    private String unit_net_chng_pct_1_week;

    /**
     * 近1月涨幅
     */
    private String unit_net_chng_pct_1_mon;

    /**
     * 近3月涨幅
     */
    private String unit_net_chng_pct_3_mon;

    /**
     * 近6月涨幅
     */
    private String unit_net_chng_pct_6_mon;

    /**
     * 近1年涨幅
     */
    private String unit_net_chng_pct_1_year;

    /**
     * 今年以来涨幅
     */
    private String unit_net_chng_pct_tyear;

    public String getUnit_net_chng_pct_tyear() {
        return unit_net_chng_pct_tyear;
    }

    public void setUnit_net_chng_pct_tyear(String unit_net_chng_pct_tyear) {
        this.unit_net_chng_pct_tyear = unit_net_chng_pct_tyear;
    }

    /**
     * 成立以来涨幅
     */
    private String unit_net_chng_pct_base;

    public String getUnit_net_chng_pct_1_mon() {
        return unit_net_chng_pct_1_mon;
    }

    public void setUnit_net_chng_pct_1_mon(String unit_net_chng_pct_1_mon) {
        this.unit_net_chng_pct_1_mon = unit_net_chng_pct_1_mon;
    }

    public String getUnit_net_chng_pct_6_mon() {
        return unit_net_chng_pct_6_mon;
    }

    public void setUnit_net_chng_pct_6_mon(String unit_net_chng_pct_6_mon) {
        this.unit_net_chng_pct_6_mon = unit_net_chng_pct_6_mon;
    }

    /**
     * 公布时间
     */
    private String 	declaredate;

    /**
     * 基金类型:
     * 1:封闭式基金;2:股票型;3:混合型;4:ETF;5:债券型;
     * 6:货币型;7:QDII;8:其他;9:指数型;10:保本基金;
     * 11:理财基金
     */
    private String fund_type;

    /**
     * 基金类型描述：股票型
     */
    private String invst_type_mark;

    /**
     * 基金风险等级
     */
    private String fundriskgrade;

    /**
     * 基金风险等级描述
     */
    private String fundriskgradedesc;

    /**
     * 基金评级级别
     */
    private String stars;

     /**
     * 基金评级级别描述
     */
    private String starsDesc;

    /**
     * 交易状态：（开放申购、暂停申购、限大额）|（开放赎回、暂停赎回）
     */
    private String transactionStatus;

    /**
     * 是否支持快赎,1支持
     */
    private int is_quick_redeem;

    /**
     * 是否可购买,1可购买,0,不可购买,默认为0
     */
    private int status;

    /**
     * 基金状态： 1-正常上市 3-终止上市 4-发行配售期间
     */
    private int fund_status;

    /**
     * 是否可定投,1可定投,0,不可定投,默认为0
     */
    private int is_auto_invest;


    /**
     * 基金折扣，默认交易方式：申购；
     * 如果基金属于认购状态，交易方式为：认购
     */
    private String fund_rate;

    /**
     * 基金定投折扣
     */
    private String auto_invest_fund_rate;

    /**
     * 基金转换折扣
     */
    private String fund_transfer;

    /**
     * 以前费率（折前费率），默认交易方式：申购；
     * 如果基金属于认购状态，交易方式为：认购
     */
    private String chag_rate_up_lim;

    /**
     * 当前费率(折后费率)，默认交易方式：申购；
     * 如果基金属于认购状态，交易方式为：认购
     */
    private String cur_fund_rate;

    /**
     * 当前费率(折后费率)，默认交易方式：定投
     */
    private String auto_invest_cur_fund_rate;

    /**
     * 当前费率(折后费率)，默认交易方式：基金转换
     */
    private String transfer_cur_fund_rate;

    /**
     * 确认日期：1个交易日/2个交易日
     */
    private String confirmDay;

    /**
     * 申购起购金额
     */
    private String quota;

    /**
     * 定投起购金额
     */
    private String auto_invest_quota;

    /**
     * 申购起购金额单位
     */
    private String quota_unit_mark;

    /**
     * 定投起购金额单位
     */
    private String auto_invest_quota_unit_mark;

    /**
     * 基金的成立时间：认购期结束的第二天
     */
    private String estab_date;

    /**
     *	截止日期（净值/七日年化）
     */
    private String enddate;

    /**
     * 基金净值增长率最新时间
     */
    private String tradedate;

    /**
     * 认购开始时间
     */
    private String executedate;

    /**
     * 认购结束时间
     */
    private String raiseEnddate;

    /**
     * 基金经理（可能不止一个）
     */
    private String indi_name;

    /**
     * 首募规模（亿元）
     */
    private String first_equity = "";

    /**
     * 资产规模（亿元）
     */
    private String merge_equity = "";
    /**
     * 资产规模（万份）
     */
    private String merge_share = "";

    /**
     * 资产规模对应时间
     */
    private String rpt_date = "";
    /**
     * 基金管理人（机构）
     */
    private String mana_name;

    /**
     * 基金托管人
     */
    private String trup_name;

    /**
     * 同类近3月业绩排名
     */
    private String kind_3mon_rank = "";

    /**
     * 收益结转时间
     */
    private String carry_time = "";

    /**
     * 认购剩余时间（时间戳）
     */
    private String leftTime = "";



    public String getFund_id() {
        return fund_id;
    }

    public void setFund_id(String fund_id) {
        this.fund_id = fund_id;
    }

    public String getInner_code() {
        return inner_code;
    }

    public void setInner_code(String inner_code) {
        this.inner_code = inner_code;
    }

    public String getFund_code() {
        return fund_code;
    }

    public void setFund_code(String fund_code) {
        this.fund_code = fund_code;
    }

    public String getFundname() {
        return fundname;
    }

    public void setFundname(String fundname) {
        this.fundname = fundname;
    }

    public String getFundsname() {
        return fundsname;
    }

    public void setFundsname(String fundsname) {
        this.fundsname = fundsname;
    }

    public String getUnit_net() {
        return unit_net;
    }

    public void setUnit_net(String unit_net) {
        this.unit_net = unit_net;
    }

    public String getAccum_net() {
        return accum_net;
    }

    public void setAccum_net(String accum_net) {
        this.accum_net = accum_net;
    }

    public String getUnit_net_chng_pct() {
        return unit_net_chng_pct;
    }

    public void setUnit_net_chng_pct(String unit_net_chng_pct) {
        this.unit_net_chng_pct = unit_net_chng_pct;
    }

    public String getUnit_net_chng_pct_1_week() {
        return unit_net_chng_pct_1_week;
    }

    public void setUnit_net_chng_pct_1_week(String unit_net_chng_pct_1_week) {
        this.unit_net_chng_pct_1_week = unit_net_chng_pct_1_week;
    }

    public String getUnit_net_chng_pct_3_mon() {
        return unit_net_chng_pct_3_mon;
    }

    public void setUnit_net_chng_pct_3_mon(String unit_net_chng_pct_3_mon) {
        this.unit_net_chng_pct_3_mon = unit_net_chng_pct_3_mon;
    }

    public String getUnit_net_chng_pct_1_year() {
        return unit_net_chng_pct_1_year;
    }

    public void setUnit_net_chng_pct_1_year(String unit_net_chng_pct_1_year) {
        this.unit_net_chng_pct_1_year = unit_net_chng_pct_1_year;
    }

    public String getUnit_net_chng_pct_base() {
        return unit_net_chng_pct_base;
    }

    public void setUnit_net_chng_pct_base(String unit_net_chng_pct_base) {
        this.unit_net_chng_pct_base = unit_net_chng_pct_base;
    }

    public String getDeclaredate() {
        return declaredate;
    }

    public void setDeclaredate(String declaredate) {
        this.declaredate = declaredate;
    }

    public String getFund_type() {
        return fund_type;
    }

    public void setFund_type(String fund_type) {
        this.fund_type = fund_type;
    }

    public String getInvst_type_mark() {
        return invst_type_mark;
    }

    public void setInvst_type_mark(String invst_type_mark) {
        this.invst_type_mark = invst_type_mark;
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

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    public String getStarsDesc() {
        return starsDesc;
    }

    public void setStarsDesc(String starsDesc) {
        this.starsDesc = starsDesc;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public int getIs_quick_redeem() {
        return is_quick_redeem;
    }

    public void setIs_quick_redeem(int is_quick_redeem) {
        this.is_quick_redeem = is_quick_redeem;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getFund_status() {
        return fund_status;
    }

    public void setFund_status(int fund_status) {
        this.fund_status = fund_status;
    }

    public int getIs_auto_invest() {
        return is_auto_invest;
    }

    public void setIs_auto_invest(int is_auto_invest) {
        this.is_auto_invest = is_auto_invest;
    }

    public String getFund_rate() {
        return fund_rate;
    }

    public void setFund_rate(String fund_rate) {
        this.fund_rate = fund_rate;
    }

    public String getAuto_invest_fund_rate() {
        return auto_invest_fund_rate;
    }

    public void setAuto_invest_fund_rate(String auto_invest_fund_rate) {
        this.auto_invest_fund_rate = auto_invest_fund_rate;
    }

    public String getFund_transfer() {
        return fund_transfer;
    }

    public void setFund_transfer(String fund_transfer) {
        this.fund_transfer = fund_transfer;
    }

    public String getChag_rate_up_lim() {
        return chag_rate_up_lim;
    }

    public void setChag_rate_up_lim(String chag_rate_up_lim) {
        this.chag_rate_up_lim = chag_rate_up_lim;
    }

    public String getCur_fund_rate() {
        return cur_fund_rate;
    }

    public void setCur_fund_rate(String cur_fund_rate) {
        this.cur_fund_rate = cur_fund_rate;
    }

    public String getAuto_invest_cur_fund_rate() {
        return auto_invest_cur_fund_rate;
    }

    public void setAuto_invest_cur_fund_rate(String auto_invest_cur_fund_rate) {
        this.auto_invest_cur_fund_rate = auto_invest_cur_fund_rate;
    }

    public String getTransfer_cur_fund_rate() {
        return transfer_cur_fund_rate;
    }

    public void setTransfer_cur_fund_rate(String transfer_cur_fund_rate) {
        this.transfer_cur_fund_rate = transfer_cur_fund_rate;
    }

    public String getConfirmDay() {
        return confirmDay;
    }

    public void setConfirmDay(String confirmDay) {
        this.confirmDay = confirmDay;
    }

    public String getQuota() {
        return quota;
    }

    public void setQuota(String quota) {
        this.quota = quota;
    }

    public String getAuto_invest_quota() {
        return auto_invest_quota;
    }

    public void setAuto_invest_quota(String auto_invest_quota) {
        this.auto_invest_quota = auto_invest_quota;
    }

    public String getQuota_unit_mark() {
        return quota_unit_mark;
    }

    public void setQuota_unit_mark(String quota_unit_mark) {
        this.quota_unit_mark = quota_unit_mark;
    }

    public String getAuto_invest_quota_unit_mark() {
        return auto_invest_quota_unit_mark;
    }

    public void setAuto_invest_quota_unit_mark(String auto_invest_quota_unit_mark) {
        this.auto_invest_quota_unit_mark = auto_invest_quota_unit_mark;
    }

    public String getEstab_date() {
        return estab_date;
    }

    public void setEstab_date(String estab_date) {
        this.estab_date = estab_date;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getTradedate() {
        return tradedate;
    }

    public void setTradedate(String tradedate) {
        this.tradedate = tradedate;
    }

    public String getExecutedate() {
        return executedate;
    }

    public void setExecutedate(String executedate) {
        this.executedate = executedate;
    }

    public String getRaiseEnddate() {
        return raiseEnddate;
    }

    public void setRaiseEnddate(String raiseEnddate) {
        this.raiseEnddate = raiseEnddate;
    }

    public String getIndi_name() {
        return indi_name;
    }

    public void setIndi_name(String indi_name) {
        this.indi_name = indi_name;
    }

    public String getMerge_equity() {
        return merge_equity;
    }

    public void setMerge_equity(String merge_equity) {
        this.merge_equity = merge_equity;
    }

    public String getMana_name() {
        return mana_name;
    }

    public void setMana_name(String mana_name) {
        this.mana_name = mana_name;
    }

    public String getTrup_name() {
        return trup_name;
    }

    public void setTrup_name(String trup_name) {
        this.trup_name = trup_name;
    }

    public String getKind_3mon_rank() {
        return kind_3mon_rank;
    }

    public void setKind_3mon_rank(String kind_3mon_rank) {
        this.kind_3mon_rank = kind_3mon_rank;
    }

    public String getCarry_time() {
        return carry_time;
    }

    public void setCarry_time(String carry_time) {
        this.carry_time = carry_time;
    }

    public String getLeftTime() {
        return leftTime;
    }

    public void setLeftTime(String leftTime) {
        this.leftTime = leftTime;
    }

    public String getRpt_date() {
        return rpt_date;
    }

    public void setRpt_date(String rpt_date) {
        this.rpt_date = rpt_date;
    }

    public String getMerge_share() {
        return merge_share;
    }

    public void setMerge_share(String merge_share) {
        this.merge_share = merge_share;
    }

    public String getFirst_equity() {
        return first_equity;
    }

    public void setFirst_equity(String first_equity) {
        this.first_equity = first_equity;
    }
}
