package cn.yilucaifu.domain;

import com.yilucaifu.utils.DateUtils;
import com.yilucaifu.utils.StringUtil;

import java.math.BigDecimal;

public class P2pUserbuy {
    private Integer id;

    private Integer userId;

    private String p2pId;

    private String p2pname;

    private String typecode;

    private Short paystatus;

    private String ordertime;

    private String paytime;

    private BigDecimal amount;

    private String charge;

    private String deadline;

    private Integer deadlineUnit;

    private String yearEarnings;

    private String interestTime;

    private String stopTime;

    private BigDecimal amountprofit;

    private BigDecimal accumprofit;

    private String orderId;

    private String eAccount;

    private String identityCode;

    private String bankbook;

    private String bankno;

    private String bankname;

    private String comment;

    private String client;

    private Integer payWay;

    private Integer payMent;

    private String mobiletelno;

    private String payProof;

    private String payApply;

    private String createtime;

    private String userno;

    private String retcode;

    private String retmsg;

    //custom
    private String tRANSACTION_URL; //交易跳转url

    private String rEBACK_URL;  //后台通知url

    private String sUCCESSRESULT_URL; //交易成功url

    private String interestTimeDesc; //计息状态

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getP2pId() {
        return p2pId;
    }

    public void setP2pId(String p2pId) {
        this.p2pId = p2pId == null ? null : p2pId.trim();
    }

    public String getP2pname() {
        return p2pname;
    }

    public void setP2pname(String p2pname) {
        this.p2pname = p2pname == null ? null : p2pname.trim();
    }

    public String getTypecode() {
        return typecode;
    }

    public void setTypecode(String typecode) {
        this.typecode = typecode == null ? null : typecode.trim();
    }

    public Short getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(Short paystatus) {
        this.paystatus = paystatus;
    }

    public String getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(String ordertime) {
        this.ordertime = ordertime == null ? null : ordertime.trim();
    }

    public String getPaytime() {
        return paytime;
    }

    public void setPaytime(String paytime) {
        this.paytime = paytime == null ? null : paytime.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge == null ? null : charge.trim();
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline == null ? null : deadline.trim();
    }

    public Integer getDeadlineUnit() {
        return deadlineUnit;
    }

    public void setDeadlineUnit(Integer deadlineUnit) {
        this.deadlineUnit = deadlineUnit;
    }

    public String getYearEarnings() {
        return yearEarnings;
    }

    public void setYearEarnings(String yearEarnings) {
        this.yearEarnings = yearEarnings == null ? null : yearEarnings.trim();
    }

    public String getInterestTime() {
        return interestTime;
    }

    public void setInterestTime(String interestTime) {
        this.interestTime = interestTime == null ? null : interestTime.trim();
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime == null ? null : stopTime.trim();
    }

    public BigDecimal getAmountprofit() {
        return amountprofit;
    }

    public void setAmountprofit(BigDecimal amountprofit) {
        this.amountprofit = amountprofit;
    }

    public BigDecimal getAccumprofit() {
        return accumprofit;
    }

    public void setAccumprofit(BigDecimal accumprofit) {
        this.accumprofit = accumprofit;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String geteAccount() {
        return eAccount;
    }

    public void seteAccount(String eAccount) {
        this.eAccount = eAccount == null ? null : eAccount.trim();
    }

    public String getIdentityCode() {
        return identityCode;
    }

    public void setIdentityCode(String identityCode) {
        this.identityCode = identityCode == null ? null : identityCode.trim();
    }

    public String getBankbook() {
        return bankbook;
    }

    public void setBankbook(String bankbook) {
        this.bankbook = bankbook == null ? null : bankbook.trim();
    }

    public String getBankno() {
        return bankno;
    }

    public void setBankno(String bankno) {
        this.bankno = bankno == null ? null : bankno.trim();
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client == null ? null : client.trim();
    }

    public Integer getPayWay() {
        return payWay;
    }

    public void setPayWay(Integer payWay) {
        this.payWay = payWay;
    }

    public Integer getPayMent() {
        return payMent;
    }

    public void setPayMent(Integer payMent) {
        this.payMent = payMent;
    }

    public String getMobiletelno() {
        return mobiletelno;
    }

    public void setMobiletelno(String mobiletelno) {
        this.mobiletelno = mobiletelno == null ? null : mobiletelno.trim();
    }

    public String getPayProof() {
        return payProof;
    }

    public void setPayProof(String payProof) {
        this.payProof = payProof == null ? null : payProof.trim();
    }

    public String getPayApply() {
        return payApply;
    }

    public void setPayApply(String payApply) {
        this.payApply = payApply == null ? null : payApply.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }

    public String getRetcode() {
        return retcode;
    }

    public void setRetcode(String retcode) {
        this.retcode = retcode == null ? null : retcode.trim();
    }

    public String getRetmsg() {
        return retmsg;
    }

    public void setRetmsg(String retmsg) {
        this.retmsg = retmsg == null ? null : retmsg.trim();
    }

    public String gettRANSACTION_URL() {
        return tRANSACTION_URL;
    }

    public void settRANSACTION_URL(String tRANSACTION_URL) {
        this.tRANSACTION_URL = tRANSACTION_URL;
    }

    public String getrEBACK_URL() {
        return rEBACK_URL;
    }

    public void setrEBACK_URL(String rEBACK_URL) {
        this.rEBACK_URL = rEBACK_URL;
    }

    public String getsUCCESSRESULT_URL() {
        return sUCCESSRESULT_URL;
    }

    public void setsUCCESSRESULT_URL(String sUCCESSRESULT_URL) {
        this.sUCCESSRESULT_URL = sUCCESSRESULT_URL;
    }

    public String getInterestTimeDesc() {
        if(StringUtil.isEmpty(this.interestTime) || this.interestTime == null){
            return "";
        }
        if (DateUtils.getNowDay().compareTo(this.interestTime)<0) {
            return "募集中";
        } else if (DateUtils.getNowDay().compareTo(this.stopTime)<0) {
            return "计息中";
        }
        return "已完成";
    }

    public void setInterestTimeDesc(String interestTimeDesc) {
        this.interestTimeDesc = interestTimeDesc;
    }
}