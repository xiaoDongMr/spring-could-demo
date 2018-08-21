package cn.yilucaifu.domain.fundinfo;

public class RecommendFundMap {
	private int id ; 
	/**
	 * 基金代码
	 */
	private String fund_code;
	
	private String fundcode;
	/**
	 * 图片
	 */
	private String manger_pic = "/public/fund/images/default.jpg";
	/**
	 * 基金经理
	 */
	private String indi_name;
	/**
	 * 基金全称
	 */
	private String fundname;
	/**
	 * 募集中
	 */
	private int fund_status;
	/**
	 * 最高收益名称
	 * @return
	 */
	private String HIGH_CHNG_NAME;
	/**
	 * 最高收益
	 * @return
	 */
	private String HIGH_CHNG_PIC;
	/**
	 * 一年
	 */
	private float UNIT_NET_CHNG_PCT_1_YEAR;
	/**
	 * 广告文案
	 */
	private String adCopy;
	
	/**
	 * 基金标签
	 */
	private String lable;
	/**
	 * 收益
	 */
	private float profit;
	/**
	 * 风险
	 */
	private int risk;
	/**
	 * 稳定
	 */
	private int stability;
	/**
	 * 是否可定投,1可定投,0,不可定投,默认为0
	 */
	private int is_auto_invest;
	/**
	 *
	 */
	private String fund_id ;
	
	private String inner_code ;
	
	private int fundtype ;
	
	private String publishTime ;
	private int position ;
	private String type ; 
    private int fundstatus ;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	private int status ;
    private String name ;
	
	
	
	
	public String getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFundcode() {
		return fundcode;
	}
	public void setFundcode(String fundcode) {
		this.fundcode = fundcode;
	}
	public int getFundstatus() {
		return fundstatus;
	}
	public void setFundstatus(int fundstatus) {
		this.fundstatus = fundstatus;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFundtype() {
		return fundtype;
	}
	public void setFundtype(int fundtype) {
		this.fundtype = fundtype;
	}
	public String getInner_code() {
		return inner_code;
	}
	public void setInner_code(String inner_code) {
		this.inner_code = inner_code;
	}
	public String getFund_id() {
		return fund_id;
	}
	public void setFund_id(String fund_id) {
		this.fund_id = fund_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFund_code() {
		return fund_code;
	}
	public void setFund_code(String fund_code) {
		this.fund_code = fund_code;
	}
	public String getManger_pic() {
		return manger_pic;
	}
	public void setManger_pic(String manger_pic) {
		this.manger_pic = manger_pic;
	}
	public String getIndi_name() {
		return indi_name;
	}
	public void setIndi_name(String indi_name) {
		this.indi_name = indi_name;
	}
	public String getFundname() {
		return fundname;
	}
	public void setFundname(String fundname) {
		this.fundname = fundname;
	}
	public int getFund_status() {
		return fund_status;
	}
	public void setFund_status(int fund_status) {
		this.fund_status = fund_status;
	}
	public String getHIGH_CHNG_NAME() {
		return HIGH_CHNG_NAME;
	}
	public void setHIGH_CHNG_NAME(String hIGH_CHNG_NAME) {
		HIGH_CHNG_NAME = hIGH_CHNG_NAME;
	}
	public String getHIGH_CHNG_PIC() {
		return HIGH_CHNG_PIC;
	}
	public void setHIGH_CHNG_PIC(String hIGH_CHNG_PIC) {
		HIGH_CHNG_PIC = hIGH_CHNG_PIC;
	}
	public float getUNIT_NET_CHNG_PCT_1_YEAR() {
		return UNIT_NET_CHNG_PCT_1_YEAR;
	}
	public void setUNIT_NET_CHNG_PCT_1_YEAR(float uNIT_NET_CHNG_PCT_1_YEAR) {
		UNIT_NET_CHNG_PCT_1_YEAR = uNIT_NET_CHNG_PCT_1_YEAR;
	}
	public String getAdCopy() {
		return adCopy;
	}
	public void setAdCopy(String adCopy) {
		this.adCopy = adCopy;
	}
	public float getProfit() {
		return profit;
	}
	public void setProfit(float profit) {
		this.profit = profit;
	}
	public int getRisk() {
		return risk;
	}
	public void setRisk(int risk) {
		this.risk = risk;
	}
	public int getStability() {
		return stability;
	}
	public void setStability(int stability) {
		this.stability = stability;
	}
	public int getIs_auto_invest() {
		return is_auto_invest;
	}
	public void setIs_auto_invest(int is_auto_invest) {
		this.is_auto_invest = is_auto_invest;
	}
	public String getLable() {
		return lable;
	}
	public void setLable(String lable) {
		this.lable = lable;
	}
	
}
