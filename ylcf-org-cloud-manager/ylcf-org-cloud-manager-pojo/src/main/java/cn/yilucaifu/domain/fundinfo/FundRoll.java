package cn.yilucaifu.domain.fundinfo;

import java.io.Serializable;

/**
 * Created by yangkang on 2018/3/21 0021.
 */
public class FundRoll implements Serializable{
    private static final long serialVersionUID = 1922485693897060103L;

    private String enddate;                        // 确认成功日期
    private String roll_in;                        // 转入金额
    private String roll_out;                       // 转出金额
    private String roll_vol;                       // 转出份额
    private String transactionaccountid;           // 交易账号
    private int userid;                            // 用户id
    private String fundcode;                       // 基金代码
    private String nav;                            // 基金净值
    private String remark;                         // 备注字段：roll_flag : 1代表转入，0是转出
    private String createtime;                     // 创建时间

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getRoll_in() {
        return roll_in;
    }

    public void setRoll_in(String roll_in) {
        this.roll_in = roll_in;
    }

    public String getRoll_out() {
        return roll_out;
    }

    public void setRoll_out(String roll_out) {
        this.roll_out = roll_out;
    }

    public String getRoll_vol() {
        return roll_vol;
    }

    public void setRoll_vol(String roll_vol) {
        this.roll_vol = roll_vol;
    }

    public String getTransactionaccountid() {
        return transactionaccountid;
    }

    public void setTransactionaccountid(String transactionaccountid) {
        this.transactionaccountid = transactionaccountid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getFundcode() {
        return fundcode;
    }

    public void setFundcode(String fundcode) {
        this.fundcode = fundcode;
    }

    public String getNav() {
        return nav;
    }

    public void setNav(String nav) {
        this.nav = nav;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }
}
