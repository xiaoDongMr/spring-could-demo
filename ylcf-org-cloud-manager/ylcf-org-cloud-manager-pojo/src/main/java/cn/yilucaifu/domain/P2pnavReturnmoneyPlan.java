package cn.yilucaifu.domain;

import java.math.BigDecimal;

public class P2pnavReturnmoneyPlan {
    private Integer id;

    private Integer redeemid;

    private String returnPeriods;

    private String returnTime;

    private BigDecimal amount;

    private Byte isreturn;

    private String createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRedeemid() {
        return redeemid;
    }

    public void setRedeemid(Integer redeemid) {
        this.redeemid = redeemid;
    }

    public String getReturnPeriods() {
        return returnPeriods;
    }

    public void setReturnPeriods(String returnPeriods) {
        this.returnPeriods = returnPeriods == null ? null : returnPeriods.trim();
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime == null ? null : returnTime.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Byte getIsreturn() {
        return isreturn;
    }

    public void setIsreturn(Byte isreturn) {
        this.isreturn = isreturn;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }
}