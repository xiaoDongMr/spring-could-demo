/**
 * 
 */
package cn.yilucaifu.domain.fundinfo;

import java.io.Serializable;

/**
 * @author zhangpeng
 * @version 创建时间：2013-8-29 下午1:06:15 基金行业配置
 */

public class FundIndu implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4592220917882269434L;
	/**
	 * 基金名称
	 */
	private String fundsname;
	/**
	 * 截止日期
	 */
	private String enddate;
	/**
	 * 行业简称
	 */
	private String indu_sname;
	/**
	 * 行业市值（占比）
	 */
	private String sect_val;
	/**
	 * 行业市值（万元）
	 */
	private String mark_val;
	/**
	 * 行业内部代码
	 */
	private int indu_inner_code;
	/**
	 * 基金代码
	 */
	private int fund_id;

	/**
	 * @return the fundsname
	 */
	public String getFundsname() {
		return fundsname;
	}

	/**
	 * @param fundsname
	 *            the fundsname to set
	 */
	public void setFundsname(String fundsname) {
		this.fundsname = fundsname;
	}

	/**
	 * @return the enddate
	 */
	public String getEnddate() {
		return enddate;
	}

	/**
	 * @param enddate
	 *            the enddate to set
	 */
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	/**
	 * @return the indu_sname
	 */
	public String getIndu_sname() {
		return indu_sname;
	}

	/**
	 * @param indu_sname
	 *            the indu_sname to set
	 */
	public void setIndu_sname(String indu_sname) {
		this.indu_sname = indu_sname;
	}

	/**
	 * @return the sect_val
	 */
	public String getSect_val() {
		return sect_val;
	}

	/**
	 * @param sect_val
	 *            the sect_val to set
	 */
	public void setSect_val(String sect_val) {
		this.sect_val = sect_val;
	}

	/**
	 * @return the indu_inner_code
	 */
	public int getIndu_inner_code() {
		return indu_inner_code;
	}

	/**
	 * @param indu_inner_code
	 *            the indu_inner_code to set
	 */
	public void setIndu_inner_code(int indu_inner_code) {
		this.indu_inner_code = indu_inner_code;
	}

	/**
	 * @return the fund_id
	 */
	public int getFund_id() {
		return fund_id;
	}

	/**
	 * @param fund_id
	 *            the fund_id to set
	 */
	public void setFund_id(int fund_id) {
		this.fund_id = fund_id;
	}

	public String getMark_val() {
		return mark_val;
	}

	public void setMark_val(String mark_val) {
		this.mark_val = mark_val;
	}
}
