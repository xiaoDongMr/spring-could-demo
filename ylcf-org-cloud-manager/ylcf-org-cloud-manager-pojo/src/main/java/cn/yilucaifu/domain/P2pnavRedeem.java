package cn.yilucaifu.domain;

import java.math.BigDecimal;

public class P2pnavRedeem {
    private Integer id;

    private Integer userId;

    private Integer p2pnavuserbuyid;

    private String p2pnavId;

    private String p2pnavname;

    private Short redeemstatus;

    private String applytime;

    private String affirmtime;

    private String applicationvol;

    private String confirmedvol;

    private BigDecimal amount;

    private String charge;

    private String orderId;

    private String eAccount;

    private String bankbook;

    private String bankno;

    private String bankname;

    private String comment;

    private String payApply;

    private String createtime;

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

    public Integer getP2pnavuserbuyid() {
        return p2pnavuserbuyid;
    }

    public void setP2pnavuserbuyid(Integer p2pnavuserbuyid) {
        this.p2pnavuserbuyid = p2pnavuserbuyid;
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

    public Short getRedeemstatus() {
        return redeemstatus;
    }

    public void setRedeemstatus(Short redeemstatus) {
        this.redeemstatus = redeemstatus;
    }

    public String getApplytime() {
        return applytime;
    }

    public void setApplytime(String applytime) {
        this.applytime = applytime == null ? null : applytime.trim();
    }

    public String getAffirmtime() {
        return affirmtime;
    }

    public void setAffirmtime(String affirmtime) {
        this.affirmtime = affirmtime == null ? null : affirmtime.trim();
    }

    public String getApplicationvol() {
        return applicationvol;
    }

    public void setApplicationvol(String applicationvol) {
        this.applicationvol = applicationvol == null ? null : applicationvol.trim();
    }

    public String getConfirmedvol() {
        return confirmedvol;
    }

    public void setConfirmedvol(String confirmedvol) {
        this.confirmedvol = confirmedvol == null ? null : confirmedvol.trim();
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
}