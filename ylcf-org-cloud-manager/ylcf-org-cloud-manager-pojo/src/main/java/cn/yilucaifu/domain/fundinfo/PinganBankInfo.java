package cn.yilucaifu.domain.fundinfo;

import cn.yilucaifu.utils.StringUtil;

import java.io.Serializable;

/**
 * filename：cn.yilucaifu.domain.pingan.QuickPayEbank.java
 * 
 * @author: zhangyong
 * @time: 2014-12-11下午2:06:12
 */

public class PinganBankInfo implements Serializable {

	private static final long serialVersionUID = -8723431984646284559L;
	private int id;
	private int paytype;// 支持哪种方式 0,小额扣款,1,短信验证方式,2，两种都支持
	private String bankname;
	private String bankno;
	private String ebankcode;
	private String logo_url;
	private int recommend_position;
	private String limitdesc; // 银行限额描述（易办事，不支持的情况下该字段为null）
	private String unionPaylimit; //银行限额描述（银联通道单日限额，不支持的情况下该字段为null）
	private String unionPaylimitSingle;//银行限额描述（银联通道单比限额，不支持的情况下该字段为null）

	//开通基金账户时判断是使用易办事还是银联
	public int getAccountType(){
//		if(CommonUtil.getLimitByStr(limitdesc)<CommonUtil.getLimitByStr(unionPaylimit))
			return 0;//使用银联
//		else
//			return 1;//使用易办事
	}
	
	public PinganBankInfo() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPaytype() {
		return paytype;
	}

	public void setPaytype(int paytype) {
		this.paytype = paytype;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getBankno() {
		return bankno;
	}

	public void setBankno(String bankno) {
		this.bankno = bankno;
	}

	public String getEbankcode() {
		return ebankcode;
	}

	public void setEbankcode(String ebankcode) {
		this.ebankcode = ebankcode;
	}

	public String getLogo_url() {
		if(StringUtil.isEmpty(logo_url)){
			return "https://a.yilucaifu.com/public/mobile/banklogo/card" + bankno + ".png";
		}
		return logo_url;
	}

	public void setLogo_url(String logo_url) {
		this.logo_url = logo_url;
	}

	public int getRecommend_position() {
		return recommend_position;
	}

	public void setRecommend_position(int recommend_position) {
		this.recommend_position = recommend_position;
	}

	public String getLimitdesc() {
		return limitdesc;
	}

	public void setLimitdesc(String limitdesc) {
		this.limitdesc = limitdesc;
	}

	public String getUnionPaylimit() {
		return unionPaylimit;
	}

	public void setUnionPaylimit(String unionPaylimit) {
		this.unionPaylimit = unionPaylimit;
	}

	public String getUnionPaylimitSingle() {
		return unionPaylimitSingle;
	}

	public void setUnionPaylimitSingle(String unionPaylimitSingle) {
		this.unionPaylimitSingle = unionPaylimitSingle;
	}
	
}
