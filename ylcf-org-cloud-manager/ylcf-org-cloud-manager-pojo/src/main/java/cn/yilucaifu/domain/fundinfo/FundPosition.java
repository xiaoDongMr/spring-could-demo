package cn.yilucaifu.domain.fundinfo;

import java.io.Serializable;

/**
 * Created by yangkang on 2018/3/9 0009.
 */
public class FundPosition implements Serializable {

    private static final long serialVersionUID = -7972863866368458846L;

    private String inner_code;                             // 基金内部代码
    private String fund_code;                              // 基金代码
    private String fundname;                               // 基金名称
    private String fund_type;                              // 基金类型
    private String property;                               // 资产
    private String currentshare;                           // 持有份额
    private String availablevol;                           // 可用份额
    private String frozevol;                               // 冻结份额
    private String unit_net;                               // 非货币：单位净值|货币：每万元基金收益
    private String net_cost;                               // 成本净值
    private String accum_net;                              // 货币：七日年化
    private String yestDprofit;                            // 日收益
    private String yestdPct;                               // 日收益率
    private String holdProfit;                             // 持仓收益
    private String holdPec;                                // 持仓收益率
    private String totalMoneyInTransit;                    // 购买中（在途）
    private String waitingIncome = "0";                    // 未付收益
    private String leftDays = "0";                         // 剩余天数（理财型基金）
    private String availableWithdrawMoney = "0";           // 可取金额（理财型基金）
    private String enddate;                                // 净值或万份收益时间
    private String incomedate;                             // 收益时间
    private String principal;                              // 本金
    private int status;                                    // 申购状态
    private int is_auto_invest;                            // 定投状态
    private int fund_status;                               // 基金状态
    private String recommend;                              // 推荐语

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

    public String getFund_type() {
        return fund_type;
    }

    public void setFund_type(String fund_type) {
        this.fund_type = fund_type;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getCurrentshare() {
        return currentshare;
    }

    public void setCurrentshare(String currentshare) {
        this.currentshare = currentshare;
    }

    public String getAvailablevol() {
        return availablevol;
    }

    public void setAvailablevol(String availablevol) {
        this.availablevol = availablevol;
    }

    public String getFrozevol() {
        return frozevol;
    }

    public void setFrozevol(String frozevol) {
        this.frozevol = frozevol;
    }

    public String getUnit_net() {
        return unit_net;
    }

    public void setUnit_net(String unit_net) {
        this.unit_net = unit_net;
    }

    public String getNet_cost() {
        return net_cost;
    }

    public void setNet_cost(String net_cost) {
        this.net_cost = net_cost;
    }

    public String getAccum_net() {
        return accum_net;
    }

    public void setAccum_net(String accum_net) {
        this.accum_net = accum_net;
    }

    public String getYestDprofit() {
        return yestDprofit;
    }

    public void setYestDprofit(String yestDprofit) {
        this.yestDprofit = yestDprofit;
    }

    public String getYestdPct() {
        return yestdPct;
    }

    public void setYestdPct(String yestdPct) {
        this.yestdPct = yestdPct;
    }

    public String getHoldProfit() {
        return holdProfit;
    }

    public void setHoldProfit(String holdProfit) {
        this.holdProfit = holdProfit;
    }

    public String getHoldPec() {
        return holdPec;
    }

    public void setHoldPec(String holdPec) {
        this.holdPec = holdPec;
    }

    public String getTotalMoneyInTransit() {
        return totalMoneyInTransit;
    }

    public void setTotalMoneyInTransit(String totalMoneyInTransit) {
        this.totalMoneyInTransit = totalMoneyInTransit;
    }

    public String getWaitingIncome() {
        return waitingIncome;
    }

    public void setWaitingIncome(String waitingIncome) {
        this.waitingIncome = waitingIncome;
    }

    public String getLeftDays() {
        return leftDays;
    }

    public void setLeftDays(String leftDays) {
        this.leftDays = leftDays;
    }

    public String getAvailableWithdrawMoney() {
        return availableWithdrawMoney;
    }

    public void setAvailableWithdrawMoney(String availableWithdrawMoney) {
        this.availableWithdrawMoney = availableWithdrawMoney;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getIncomedate() {
        return incomedate;
    }

    public void setIncomedate(String incomedate) {
        this.incomedate = incomedate;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getIs_auto_invest() {
        return is_auto_invest;
    }

    public void setIs_auto_invest(int is_auto_invest) {
        this.is_auto_invest = is_auto_invest;
    }

    public int getFund_status() {
        return fund_status;
    }

    public void setFund_status(int fund_status) {
        this.fund_status = fund_status;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }
}
