package cn.yilucaifu.domain;

import java.math.BigDecimal;

public class P2pnavUserbuy {
    private Integer id;

    private Integer userId;

    private String p2pnavId;

    private String p2pnavname;

    private String typecode;

    private Short paystatus;

    private String ordertime;

    private String paytime;

    private BigDecimal amount;

    private String buyShare;

    private String charge;

    private String p2pnavPeriods;

    private Integer p2pnavPeriodsUnit;

    private String yearEarnings;

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

    private String mobiletelno;

    private String payProof;

    private String payApply;

    private String createtime;

    private String userno;

    private String retcode;

    private String retmsg;

    private String tRANSACTION_URL; //交易跳转url

    private String rEBACK_URL;  //后台通知url

    private String sUCCESSRESULT_URL; //交易成功url

    private String navValue;  //最新净值

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

    public String getP2pnavId() {
        return p2pnavId;
    }

    public void setP2pnavId(String p2pnavId) {
        this.p2pnavId = p2pnavId == null ? null : p2pnavId.trim();
    }

    public String getP2pnavname() {
        return p2pnavname;
    }

    public void setP2pnavname(String p2pnavname) {
        this.p2pnavname = p2pnavname == null ? null : p2pnavname.trim();
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

    public String getBuyShare() {
        return buyShare;
    }

    public void setBuyShare(String buyShare) {
        this.buyShare = buyShare == null ? null : buyShare.trim();
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge == null ? null : charge.trim();
    }

    public String getP2pnavPeriods() {
        return p2pnavPeriods;
    }

    public void setP2pnavPeriods(String p2pnavPeriods) {
        this.p2pnavPeriods = p2pnavPeriods == null ? null : p2pnavPeriods.trim();
    }

    public Integer getP2pnavPeriodsUnit() {
        return p2pnavPeriodsUnit;
    }

    public void setP2pnavPeriodsUnit(Integer p2pnavPeriodsUnit) {
        this.p2pnavPeriodsUnit = p2pnavPeriodsUnit;
    }

    public String getYearEarnings() {
        return yearEarnings;
    }

    public void setYearEarnings(String yearEarnings) {
        this.yearEarnings = yearEarnings == null ? null : yearEarnings.trim();
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

    public String getNavValue() {
        return navValue;
    }

    public void setNavValue(String navValue) {
        this.navValue = navValue;
    }
}