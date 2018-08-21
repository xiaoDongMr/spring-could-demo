package cn.yilucaifu.domain.fundinfo;

/**
 * Created by yangkang on 2018/4/10 0010.
 */
public class FundBuyInfo extends FundRedeemInfo {
    private String applyConfirmDate;        // 申购确认日
    private String chag_rate_up_lim;        // 以前费率
    private String cur_fund_rate;           // 当前费率
    private String fund_rate;               // 折扣
    private String quota;                   // 起购金额
    private String fundriskgradedesc;       // 基金风险等级
    private String risklevelDesc;              // 机构用户抗风险能力

    public String getApplyConfirmDate() {
        return applyConfirmDate;
    }

    public void setApplyConfirmDate(String applyConfirmDate) {
        this.applyConfirmDate = applyConfirmDate;
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

    public String getFund_rate() {
        return fund_rate;
    }

    public void setFund_rate(String fund_rate) {
        this.fund_rate = fund_rate;
    }

    public String getQuota() {
        return quota;
    }

    public void setQuota(String quota) {
        this.quota = quota;
    }

    public String getFundriskgradedesc() {
        return fundriskgradedesc;
    }

    public void setFundriskgradedesc(String fundriskgradedesc) {
        this.fundriskgradedesc = fundriskgradedesc;
    }

    public String getRisklevelDesc() {
        return risklevelDesc;
    }

    public void setRisklevelDesc(String risklevelDesc) {
        this.risklevelDesc = risklevelDesc;
    }
}
