package cn.yilucaifu.domain.fundinfo;

import java.io.Serializable;

/** 
 * @author dongxiaobing
 * @version 创建时间：2015-01-27 下午17:51:39 
 * 一路宝实体类 
 */
public class YiluBao implements Serializable {
	private static final long serialVersionUID = 6636557766768783674L;

	private int id;						//主键id
	private String fundCode;			//基金代码
	private String fundName;			//基金名称
	private String yiluBaoAlias;		//一路宝别名
	private String isAppointment;		//是否支持预约,0:否,1:是
	private String isBuy;				//是否支持购买,0:否,1:是
	private String isQuickRedeem;		//是否支持快赎,0:否,1:是
	private String isAutoInvest;		//是否支持定投,0:否,1:是
	private String remark;				//备注
	private int position;				//排列顺序
	private String lastUpdateTime;		//最后修改时间
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFundCode() {
		return fundCode;
	}
	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}
	public String getFundName() {
		return fundName;
	}
	public void setFundName(String fundName) {
		this.fundName = fundName;
	}
	public String getYiluBaoAlias() {
		return yiluBaoAlias;
	}
	public void setYiluBaoAlias(String yiluBaoAlias) {
		this.yiluBaoAlias = yiluBaoAlias;
	}
	public String getIsAppointment() {
		return isAppointment;
	}
	public void setIsAppointment(String isAppointment) {
		this.isAppointment = isAppointment;
	}
	public String getIsBuy() {
		return isBuy;
	}
	public void setIsBuy(String isBuy) {
		this.isBuy = isBuy;
	}
	public String getIsQuickRedeem() {
		return isQuickRedeem;
	}
	public void setIsQuickRedeem(String isQuickRedeem) {
		this.isQuickRedeem = isQuickRedeem;
	}
	public String getIsAutoInvest() {
		return isAutoInvest;
	}
	public void setIsAutoInvest(String isAutoInvest) {
		this.isAutoInvest = isAutoInvest;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public String getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	
}
