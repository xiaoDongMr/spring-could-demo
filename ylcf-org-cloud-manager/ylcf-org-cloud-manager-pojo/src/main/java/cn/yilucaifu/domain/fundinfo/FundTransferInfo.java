package cn.yilucaifu.domain.fundinfo;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/4/15 0015.
 */
public class FundTransferInfo extends FundRedeemInfo implements Serializable {

    private static final long serialVersionUID = -28860499254541422L;

    private String fundriskgradedesc;       // 基金风险等级
    private String risklevelDesc;           // 机构用户抗风险能力

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
