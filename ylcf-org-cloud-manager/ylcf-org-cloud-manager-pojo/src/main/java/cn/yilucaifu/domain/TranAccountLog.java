package cn.yilucaifu.domain;

import java.io.Serializable;

/**
 * filename：com.yilucaifu.domain.pingan.TranAccountLog.java
 * 
 * @author: zhangyong
 * @time: 2013-10-9下午2:51:22 基金账户
 */

public class TranAccountLog implements Serializable {
	private static final long serialVersionUID = -4817793918970419442L;

	/**
	 * 主键
	 */
	private Integer account_id;

	private int user_id;
	/**
	 * 
	 * 银行卡号
	 */
	private String depositacct;
	/**
	 * 开卡网点
	 */
	private String bankno;

	/**
	 * 扣款金额
	 */
	private String amount;

	private String createtime;

	private String provincecode;// 省份代码

	private String citycode;// 城市代码
	private String trancode;
	private String respcode;
	private String respmsg;

	public Integer getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Integer account_id) {
		this.account_id = account_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getDepositacct() {
		return depositacct;
	}

	public void setDepositacct(String depositacct) {
		this.depositacct = depositacct;
	}

	public String getBankno() {
		return bankno;
	}

	public void setBankno(String bankno) {
		this.bankno = bankno;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getProvincecode() {
		return provincecode;
	}

	public void setProvincecode(String provincecode) {
		this.provincecode = provincecode;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public String getTrancode() {
		return trancode;
	}

	public void setTrancode(String trancode) {
		this.trancode = trancode;
	}

	public String getRespcode() {
		return respcode;
	}

	public void setRespcode(String respcode) {
		this.respcode = respcode;
	}

	public String getRespmsg() {
		return respmsg;
	}

	public void setRespmsg(String respmsg) {
		this.respmsg = respmsg;
	}

}