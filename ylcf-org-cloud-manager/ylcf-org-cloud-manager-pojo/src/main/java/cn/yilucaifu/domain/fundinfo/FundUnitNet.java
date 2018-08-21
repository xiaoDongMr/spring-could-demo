package cn.yilucaifu.domain.fundinfo;

import java.io.Serializable;

/**
 * filename：FundUnitNet.java
 * 
 * @author: zhangyong
 * @time: 2014-5-8下午3:32:55
 */

public class FundUnitNet implements Serializable {
	private static final long serialVersionUID = -5214924920511465462L;
	private String unit_net;// 基金单位净值
	private String tradedate;// 交易时间
	private String transtimestamp; // 时间戳

	public String getTranstimestamp() {
		return transtimestamp;
	}

	public void setTranstimestamp(String transtimestamp) {
		this.transtimestamp = transtimestamp;
	}

	public String getUnit_net() {
		return unit_net;
	}

	public void setUnit_net(String unit_net) {
		this.unit_net = unit_net;
	}

	public String getTradedate() {
		return tradedate;
	}

	public void setTradedate(String tradedate) {
		this.tradedate = tradedate;
	}

}
