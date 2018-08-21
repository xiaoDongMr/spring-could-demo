/**
 * 
 */
package cn.yilucaifu.domain.fundinfo;

import java.io.Serializable;

/** 
 * @author zhangpeng
 * @version 创建时间：2013-9-3 上午10:13:32 
 * 基金分红
 */

public class FundDiv implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1071841774881954149L;
	/**
	 * 内部代码
	 */
	private int inner_code;
	/**
	 * 序号：对同一个基金内部代码,同一个截止日期,同一个公告类别,如果出现多条记录的话,从开始生成
	 */
	private String rank;
	/**
	 * 派息年度
	 */
	private String div_year;
	/**
	 * 股权登记日
	 */
	private String record_date;
	/**
	 * 除息日
	 */
	private String ex_div_date;
	/**
	 * 红利发放日
	 */
	private String pay_date;
	/**
	 * 每10份基金份额派发红利(税后)
	 */
	private String div_remv_tax;
	/**
	 * 公告日
	 */
	private String declaredate ;
	public String getDeclaredate() {
		return declaredate;
	}
	public void setDeclaredate(String declaredate) {
		this.declaredate = declaredate;
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
	 * @return the rank
	 */
	public String getRank() {
		return rank;
	}
	/**
	 * @param rank the rank to set
	 */
	public void setRank(String rank) {
		this.rank = rank;
	}
	/**
	 * @return the div_year
	 */
	public String getDiv_year() {
		return div_year;
	}
	/**
	 * @param div_year the div_year to set
	 */
	public void setDiv_year(String div_year) {
		this.div_year = div_year;
	}
	/**
	 * @return the record_date
	 */
	public String getRecord_date() {
		return record_date;
	}
	/**
	 * @param record_date the record_date to set
	 */
	public void setRecord_date(String record_date) {
		this.record_date = record_date;
	}
	/**
	 * @return the ex_div_date
	 */
	public String getEx_div_date() {
		return ex_div_date;
	}
	/**
	 * @param ex_div_date the ex_div_date to set
	 */
	public void setEx_div_date(String ex_div_date) {
		this.ex_div_date = ex_div_date;
	}
	/**
	 * @return the pay_date
	 */
	public String getPay_date() {
		return pay_date;
	}
	/**
	 * @param pay_date the pay_date to set
	 */
	public void setPay_date(String pay_date) {
		this.pay_date = pay_date;
	}
	/**
	 * @return the div_remv_tax
	 */
	public String getDiv_remv_tax() {
		return div_remv_tax;
	}
	/**
	 * @param div_remv_tax the div_remv_tax to set
	 */
	public void setDiv_remv_tax(String div_remv_tax) {
		this.div_remv_tax = div_remv_tax;
	}
	
	


}
