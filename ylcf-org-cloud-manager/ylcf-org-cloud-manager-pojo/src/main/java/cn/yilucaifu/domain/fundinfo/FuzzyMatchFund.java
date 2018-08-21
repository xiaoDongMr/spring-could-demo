/**
 * 
 */
package cn.yilucaifu.domain.fundinfo;

import java.io.Serializable;

/** 
 * @author zhangpeng
 * @version 创建时间：2013-9-23 下午8:25:51 
 * 类说明 
 */

public class FuzzyMatchFund implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1634853877723569017L;
	private String fundsname;
	private int inner_code;
	private String fund_code;
	private int fund_id;
	/**
	 * @return the fundsname
	 */
	public String getFundsname() {
		return fundsname;
	}
	/**
	 * @param fundsname the fundsname to set
	 */
	public void setFundsname(String fundsname) {
		this.fundsname = fundsname;
	}
	/**
	 * @return the inner_code
	 */
	public int getInner_code() {
		return inner_code;
	}
	/**
	 * @param inner_code the inner_code to set
	 */
	public void setInner_code(int inner_code) {
		this.inner_code = inner_code;
	}
	/**
	 * @return the fund_code
	 */
	public String getFund_code() {
		return fund_code;
	}
	/**
	 * @param fund_code the fund_code to set
	 */
	public void setFund_code(String fund_code) {
		this.fund_code = fund_code;
	}
	/**
	 * @return the fund_id
	 */
	public int getFund_id() {
		return fund_id;
	}
	/**
	 * @param fund_id the fund_id to set
	 */
	public void setFund_id(int fund_id) {
		this.fund_id = fund_id;
	}
	



}
