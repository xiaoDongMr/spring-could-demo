package cn.yilucaifu.domain.fundinfo;

import java.io.Serializable;

/**
 * Created by yangkang on 2018/4/4 0004.
 */
public class FundRedeemInfo implements Serializable {
    private static final long serialVersionUID = 4514893152880760459L;

    private String fundcode;                   // 基金代码
    private String fundname;                   // 基金名称
    private String fund_type;                  // 基金类型
    private String invst_type_mark;            // 基金类型描述
    private String redeemConfirtmDate;         // 赎回确认日
    private String minredemptionvol;           // 最低赎回份额
    private String currentshare;               // 持有份额
    private String availablevol;               // 可用份额
    private String redeemDate;                 // 赎回时间
    private String banknoname;                 // 银行简称
    private String depositacct;                // 银行卡号
    private String banklogo;                   // 银行卡logo地址


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

    public String getRedeemConfirtmDate() {
        return redeemConfirtmDate;
    }

    public void setRedeemConfirtmDate(String redeemConfirtmDate) {
        this.redeemConfirtmDate = redeemConfirtmDate;
    }

    public String getMinredemptionvol() {
        return minredemptionvol;
    }

    public void setMinredemptionvol(String minredemptionvol) {
        this.minredemptionvol = minredemptionvol;
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

    public String getRedeemDate() {
        return redeemDate;
    }

    public void setRedeemDate(String redeemDate) {
        this.redeemDate = redeemDate;
    }

    public String getBanknoname() {
        return banknoname;
    }

    public void setBanknoname(String banknoname) {
        this.banknoname = banknoname;
    }

    public String getDepositacct() {
        return depositacct;
    }

    public void setDepositacct(String depositacct) {
        this.depositacct = depositacct;
    }

    public String getBanklogo() {
        return banklogo;
    }

    public void setBanklogo(String banklogo) {
        this.banklogo = banklogo;
    }
}
