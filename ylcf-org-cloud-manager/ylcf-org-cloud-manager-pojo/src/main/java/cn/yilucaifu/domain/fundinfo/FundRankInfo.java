package cn.yilucaifu.domain.fundinfo;

import java.io.Serializable;

/**
 * Created by yangkang on 2018/3/7 0007.
 */
public class FundRankInfo implements Serializable {
    private static final long serialVersionUID = -3495502613774665776L;

    private  int rownum;                             // 同类排名
    private  String tradedate;                       // 交易时间
    private  int inner_code;                         // 基金内部码
    private  String fund_code;                       // 基金代码
    private  String enddate;                         // 截止时间
    private  String unit_net_chng_pct_3_mon;         // 近3月收益率
    private  int fund_type;                          // 基金类型

    public int getRownum() {
        return rownum;
    }

    public void setRownum(int rownum) {
        this.rownum = rownum;
    }

    public String getTradedate() {
        return tradedate;
    }

    public void setTradedate(String tradedate) {
        this.tradedate = tradedate;
    }

    public int getInner_code() {
        return inner_code;
    }

    public void setInner_code(int inner_code) {
        this.inner_code = inner_code;
    }

    public String getFund_code() {
        return fund_code;
    }

    public void setFund_code(String fund_code) {
        this.fund_code = fund_code;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getUnit_net_chng_pct_3_mon() {
        return unit_net_chng_pct_3_mon;
    }

    public void setUnit_net_chng_pct_3_mon(String unit_net_chng_pct_3_mon) {
        this.unit_net_chng_pct_3_mon = unit_net_chng_pct_3_mon;
    }

    public int getFund_type() {
        return fund_type;
    }

    public void setFund_type(int fund_type) {
        this.fund_type = fund_type;
    }
}
