package cn.yilucaifu.domain;

import java.io.Serializable;

/**
 * filename：cn.yilucaifu.domain.UserVisit.UserTradeException
 * 
 * @author: dongxiaobing
 * @time: 2015-04-07 13:51:15 用户交易异常实体类
 */
public class UserTradeException implements Serializable {
	private static final long serialVersionUID = 2471467371389634757L;

	private int id;
	private int user_id; // 用户id
	private String product_id; // 产品id:基金代码、稳赢的id、组合id
	private int tradeStatus; // 交易状态,0:进入money页面，1:进入password页面，2：该基金状态不能购买等，4：基金交易完成--待确认，
								// 5："交易密码错误"，6： "余额不足或其他信息，7： "交易成功",8:用户撤单，9:自动作废
	private String orderTime; // 下单时间,输入money后提交时间
	private String appsheetserialno;   //订单流水号
	private String payTime; // 支付时间,输入password后提交时间
	private float amount; // 购买金额（元）
	private int product_classify; // 产品分类，0:基金或理财主题,1:赢产品,2:组合
	private int comId;  // 购买组合时基金所在的组合id
	private String comment; // 注释
	private int isAutoInvest; // 0:不是定投,1:是定投,2:赢产品来的,3:组合购买来的
	private String createtime; // 记录创建时间

	/*
	 * 恒生添加
	 */
	private String apply_date;// 申请日期 该笔交易的申请日期；比如下单日期时间是周一22点；那么申请日期是周二；
	private String apply_time;// 申请时间
	private String balance;// 发生金额
	
	public String getApply_date() {
		return apply_date;
	}

	public void setApply_date(String apply_date) {
		this.apply_date = apply_date;
	}

	public String getApply_time() {
		return apply_time;
	}

	public void setApply_time(String apply_time) {
		this.apply_time = apply_time;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public int getTradeStatus() {
		return tradeStatus;
	}

	public void setTradeStatus(int tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public String getAppsheetserialno() {
		return appsheetserialno;
	}

	public void setAppsheetserialno(String appsheetserialno) {
		this.appsheetserialno = appsheetserialno;
	}

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public int getProduct_classify() {
		return product_classify;
	}

	public void setProduct_classify(int product_classify) {
		this.product_classify = product_classify;
	}

	public int getComId() {
		return comId;
	}

	public void setComId(int comId) {
		this.comId = comId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getIsAutoInvest() {
		return isAutoInvest;
	}

	public void setIsAutoInvest(int isAutoInvest) {
		this.isAutoInvest = isAutoInvest;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

}
