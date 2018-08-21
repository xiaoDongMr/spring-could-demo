/**
 * 
 */
package cn.yilucaifu.domain.fundinfo;

import cn.yilucaifu.utils.StringUtil;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * filename：cn.yilucaifu.domain.home.RecommandProduct.java 
 * 
 * @author: linan
 * @time: 2015-4-28 下午2:05:15 
 * 产品详情
 */
public class RecommandProduct implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6940291082351601178L;
	
	private int id;
	private int modularid; // 模块id
	private String position; // 排位
	private String name;	// 商品名称
	private String chng_name; // 收益名称
	private String chng_pic; // 收益率

	private String fundcode; // 基金代码
	private int productid; // 产品id 
	
	private String typemark; // 商品种类 (基金 :基金类型，p2p：类型)
	private String adCopy; // 描述
	private String p2p_periods; //期数
	private String specialNovice; // 是否为新手专享，0：不是,1:是
	private String buyUserAccount; // 用户购买人数
	private String deadline; // 期限
	private String cur_fund_rate; // 手续费
	private String chag_rate_up_lim; // 原费率
	private String fund_rate; // 折扣
	private String p2p_progress; // 进度
	private String isNewFund; // 是否为新基金 1是0不是
	private String app_which; //属于哪个赢系列，0：稳赢，1：安赢
	private String isRetrunMoneyType; //1为等额本息还款产品
	private String fundtype; //基金类型 // 1封闭式基金 2 股票型 3混合型 4ETF 5债券型 6货币型 7QDII 8其他 9指数型 10保本基金 11理财基金
	private String fund_status; //状态 0：其他 1：正常上市 3：终止上市 4：募集
	
	private String buy_money; // 起购金额
	private String raise_money; // 叠加金额
	
	private String img_url; // 图片地址
	private String modularName; //模块名称
	
	private int enable; // 是否可用
	private int isMammonRecommend;  //是否是财神推荐，0：不是，1：是
	private String mammonRecommendType;  //财神推进类型  1:基金;2:p2p;3:组合;4:理财主题
	
	private String unit_net;//最新净值 或者 万份收益
	private String productLable;//四字标签推荐描述
	private String bondId;//债券转让的主键

	public List<FundHistory> fundHistoryList=new ArrayList<FundHistory>(); //小沃项目首页显示最近五条购买数据   wanghait 20161028 添加
	
	
	public List<FundHistory> getFundHistoryList() {
		return fundHistoryList;
	}

	public void setFundHistoryList(List<FundHistory> fundHistoryList) {
		this.fundHistoryList = fundHistoryList;
	}

	public String getProductLable() {
		return productLable;
	}

	public void setProductLable(String productLable) {
		this.productLable = productLable;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getModularid() {
		return modularid;
	}

	public void setModularid(int modularid) {
		this.modularid = modularid;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getChng_name() {
		return chng_name;
	}

	public void setChng_name(String chng_name) {
		this.chng_name = chng_name;
	}

	public String getChng_pic() {
		if(!StringUtil.isEmpty(chng_pic) && chng_pic.indexOf("%") >= 0){
			chng_pic = chng_pic.substring(0, chng_pic.indexOf("%"));
		}
		return chng_pic;
	}

	public void setChng_pic(String chng_pic) {
		this.chng_pic = chng_pic;
	}

	public String getFundcode() {
		return fundcode;
	}

	public void setFundcode(String fundcode) {
		this.fundcode = fundcode;
	}

	public String getTypemark() {
		return typemark;
	}

	public void setTypemark(String typemark) {
		this.typemark = typemark;
	}

	public String getAdCopy() {
		return adCopy;
	}

	public void setAdCopy(String adCopy) {
		this.adCopy = adCopy;
	}

	public String getP2p_periods() {
		return p2p_periods;
	}

	public void setP2p_periods(String p2p_periods) {
		this.p2p_periods = p2p_periods;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public String getChag_rate_up_lim() {
		return chag_rate_up_lim;
	}

	public void setChag_rate_up_lim(String chag_rate_up_lim) {
		this.chag_rate_up_lim = chag_rate_up_lim;
	}

	public String getBuy_money() {
		return buy_money;
	}

	public void setBuy_money(String buy_money) {
		this.buy_money = buy_money;
	}

	public String getRaise_money() {
		return raise_money;
	}

	public void setRaise_money(String raise_money) {
		this.raise_money = raise_money;
	}

	public String getImg_url() {
		return img_url;
	}

	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}

	public int getEnable() {
		return enable;
	}

	public void setEnable(int enable) {
		this.enable = enable;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getCur_fund_rate() {
		return cur_fund_rate;
	}

	public void setCur_fund_rate(String cur_fund_rate) {
		this.cur_fund_rate = cur_fund_rate;
	}

	public String getFund_rate() {
		return fund_rate;
	}

	public void setFund_rate(String fund_rate) {
		this.fund_rate = fund_rate;
	}

	public String getP2p_progress() {
		return p2p_progress;
	}

	public void setP2p_progress(String p2p_progress) {
		this.p2p_progress = p2p_progress;
	}

	public String getIsNewFund() {
		return isNewFund;
	}

	public void setIsNewFund(String inNewFund) {
		this.isNewFund = inNewFund;
	}

	public String getApp_which() {
		return app_which;
	}

	public void setApp_which(String app_which) {
		this.app_which = app_which;
	}

	public String getModularName() {
		return modularName;
	}

	public void setModularName(String modularName) {
		this.modularName = modularName;
	}

	public int getIsMammonRecommend() {
		return isMammonRecommend;
	}

	public void setIsMammonRecommend(int isMammonRecommend) {
		this.isMammonRecommend = isMammonRecommend;
	}

	public String getMammonRecommendType() {
		return mammonRecommendType;
	}

	public void setMammonRecommendType(String mammonRecommendType) {
		this.mammonRecommendType = mammonRecommendType;
	}

	public String getFundtype() {
		return fundtype;
	}

	public void setFundtype(String fundtype) {
		this.fundtype = fundtype;
	}

	public String getFund_status() {
		return fund_status;
	}

	public void setFund_status(String fund_status) {
		this.fund_status = fund_status;
	}

	
	public String getSpecialNovice() {
		return specialNovice;
	}

	public void setSpecialNovice(String specialNovice) {
		this.specialNovice = specialNovice;
	}

	public String getBuyUserAccount() {
		return buyUserAccount;
	}

	public void setBuyUserAccount(String buyUserAccount) {
		this.buyUserAccount = buyUserAccount;
	}

	public String getUnit_net() {
		return unit_net;
	}

	public void setUnit_net(String unit_net) {
		this.unit_net = unit_net;
	}
 
	public String getIsRetrunMoneyType() {
		return isRetrunMoneyType;
	}

	public void setIsRetrunMoneyType(String isRetrunMoneyType) {
		this.isRetrunMoneyType = isRetrunMoneyType;
	}

	public String getBondId() {
		return bondId;
	}

	public void setBondId(String bondId) {
		this.bondId = bondId;
	}
	
}
