package cn.yilucaifu.domain;

import java.math.BigDecimal;

public class P2pReturnmoneyPlan {
    private Integer id;

    private Integer p2puserbuyid;

    private String returnPeriods;

    private String returnTime;

    private BigDecimal amount;

    private BigDecimal amountprofit;

    private Byte isreturn;

    private String createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getP2puserbuyid() {
        return p2puserbuyid;
    }

    public void setP2puserbuyid(Integer p2puserbuyid) {
        this.p2puserbuyid = p2puserbuyid;
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

    public BigDecimal getAmountprofit() {
        return amountprofit;
    }

    public void setAmountprofit(BigDecimal amountprofit) {
        this.amountprofit = amountprofit;
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