/**
 * 
 */
package cn.yilucaifu.domain.fundinfo;

import java.io.Serializable;

/** 
 * @author zhangpeng
 * @version 创建时间：2013-8-29 下午2:09:28 
 * 基金股票配置
 */

public class FundStk implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7859995715343369212L;
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
	private String stocksname;
	/**
	 * 行业市值（万元）
	 */
	private String hld_stk_val;
	/**
	 * 持股数量
	 */
	private String hld_stk_sum;
	/**
	 * 占净值的比例（%）
	 */
	private String tot_val_prop;
	/**
	 * 股票代码
	 */
	private String stockcode;
	/**
	 * 行业内部代码
	 */
	private int stk_inner_code;
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
	 * @param fundsname the fundsname to set
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
	 * @param enddate the enddate to set
	 */
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	/**
	 * @return the stocksname
	 */
	public String getStocksname() {
		return stocksname;
	}
	/**
	 * @param stocksname the stocksname to set
	 */
	public void setStocksname(String stocksname) {
		this.stocksname = stocksname;
	}
	/**
	 * @return the hld_stk_val
	 */
	public String getHld_stk_val() {
		return hld_stk_val;
	}
	/**
	 * @param hld_stk_val the hld_stk_val to set
	 */
	public void setHld_stk_val(String hld_stk_val) {
		this.hld_stk_val = hld_stk_val;
	}
	/**
	 * @return the stk_inner_code
	 */
	public int getStk_inner_code() {
		return stk_inner_code;
	}
	/**
	 * @param stk_inner_code the stk_inner_code to set
	 */
	public void setStk_inner_code(int stk_inner_code) {
		this.stk_inner_code = stk_inner_code;
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
	/**
	 * @return the hld_stk_sum
	 */
	public String getHld_stk_sum() {
		return hld_stk_sum;
	}
	/**
	 * @param hld_stk_sum the hld_stk_sum to set
	 */
	public void setHld_stk_sum(String hld_stk_sum) {
		this.hld_stk_sum = hld_stk_sum;
	}
	/**
	 * @return the tot_val_prop
	 */
	public String getTot_val_prop() {
		return tot_val_prop;
	}
	/**
	 * @param tot_val_prop the tot_val_prop to set
	 */
	public void setTot_val_prop(String tot_val_prop) {
		this.tot_val_prop = tot_val_prop;
	}
	/**
	 * @return the stockcode
	 */
	public String getStockcode() {
		return stockcode;
	}
	/**
	 * @param stockcode the stockcode to set
	 */
	public void setStockcode(String stockcode) {
		this.stockcode = stockcode;
	}
	
	

}
