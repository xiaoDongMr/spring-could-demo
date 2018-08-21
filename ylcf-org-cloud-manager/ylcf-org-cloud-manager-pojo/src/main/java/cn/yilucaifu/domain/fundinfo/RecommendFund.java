/**
 * 
 */
package cn.yilucaifu.domain.fundinfo;

import java.io.Serializable;

/** 
 * @author zhangpeng
 * @version 创建时间：2013-8-27 上午10:17:23 
 * 类说明 
 */

public class RecommendFund implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4118136388470755408L;

	/**
	 *id 
	 */
	private int id;
	
	/**
	 * 基金代码
	 */
	private String fundcode;
	/**
	 * 推荐名称
	 */
	private String name;
	/**
	 * 推荐理由(已经不适用 ，现在使用adCopy)
	 */
	private String description;
	/**
	 * 适合人群
	 */
	private String suitcrowds;
	/**
	 *  发布时间
	 */
	private String publishTime;
	/**
	 * 推荐排位
	 */
	private int position;
	/**
	 * 费率折扣
	 */
	private int rate;
	/**
	 * 推荐类型
	 */
	private String type;

	/**
	 * 基金id
	 */
	private String fundid;
	/**
	 * 巨灵内部代码
	 */	
	private String innercode;
	
	/**
	 * 组合投资中所占的比例
	 */
	private int combinationRate;
	
	/**
	 * 基金图片
	 */
	private String fundPic;
	/**
	 * 广告推荐语
	 */
	private String adCopy;
	/**
	 * 基金标签
	 */
	private String lable;
	/**
	 * 选择展示数据
	 */
	private String sign;
	/**
	 * 基金类型
	 * @return
	 */
	private String fundtype;
	
	private String fundstatus;
	/**
	 * 是否在前端显示
	 * @return
	 */
	private String isDisplay;
	
	public String getFundstatus() {
		return fundstatus;
	}

	public void setFundstatus(String fundstatus) {
		this.fundstatus = fundstatus;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getAdCopy() {
		return adCopy;
	}

	public void setAdCopy(String adCopy) {
		this.adCopy = adCopy;
	}

	/**
	 * @return the fundcode
	 */
	public String getFundcode() {
		return fundcode;
	}

	/**
	 * @param fundcode the fundcode to set
	 */
	public void setFundcode(String fundcode) {
		this.fundcode = fundcode;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the suitcrowds
	 */
	public String getSuitcrowds() {
		return suitcrowds;
	}

	/**
	 * @param suitcrowds the suitcrowds to set
	 */
	public void setSuitcrowds(String suitcrowds) {
		this.suitcrowds = suitcrowds;
	}

	/**
	 * @return the publishTime
	 */
	public String getPublishTime() {
		return publishTime;
	}

	/**
	 * @param publishTime the publishTime to set
	 */
	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}

	/**
	 * @return the position
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(int position) {
		this.position = position;
	}

	/**
	 * @return the rate
	 */
	public int getRate() {
		return rate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(int rate) {
		this.rate = rate;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the fundid
	 */
	public String getFundid() {
		return fundid;
	}

	/**
	 * @param fundid the fundid to set
	 */
	public void setFundid(String fundid) {
		this.fundid = fundid;
	}

	/**
	 * @return the innercode
	 */
	public String getInnercode() {
		return innercode;
	}

	/**
	 * @param innercode the innercode to set
	 */
	public void setInnercode(String innercode) {
		this.innercode = innercode;
	}

	/**
	 * @return the combinationRate
	 */
	public int getCombinationRate() {
		return combinationRate;
	}

	/**
	 * @param combinationRate the combinationRate to set
	 */
	public void setCombinationRate(int combinationRate) {
		this.combinationRate = combinationRate;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the fundPic
	 */
	public String getFundPic() {
		return fundPic;
	}

	/**
	 * @param fundPic the fundPic to set
	 */
	public void setFundPic(String fundPic) {
		this.fundPic = fundPic;
	}

	public String getFundtype() {
		return fundtype;
	}

	public void setFundtype(String fundtype) {
		this.fundtype = fundtype;
	}

	public String getIsDisplay() {
		return isDisplay;
	}

	public void setIsDisplay(String isDisplay) {
		this.isDisplay = isDisplay;
	}

	public String getLable() {
		return lable;
	}

	public void setLable(String lable) {
		this.lable = lable;
	}
	
}
