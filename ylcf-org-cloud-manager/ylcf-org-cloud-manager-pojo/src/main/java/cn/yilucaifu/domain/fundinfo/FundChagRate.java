/**
 * 
 */
package cn.yilucaifu.domain.fundinfo;

import java.io.Serializable;

/** 
 * @author zhangpeng
 * @version 创建时间：2013-9-2 下午7:46:55 
 * 基金费率
 */

public class FundChagRate implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8615176192573283105L;
	/**
	 * 内部代码
	 */
	private int inner_code;
	/**
	 * 执行日期（在执行日期和截至日期时间内 按照这个费率计算）
	 */
	private String executedate;
	/**
	 * 折扣
	 */
	private String fund_rate;
	
	public String getFund_rate() {
		return fund_rate;
	}
	public void setFund_rate(String fund_rate) {
		this.fund_rate = fund_rate;
	}
	/**
	 * --截止日期
	 */
	private String enddate;
	/**
	 * 乘以折扣后的费率
	 */
	private String CUR_FUND_RATE;
	private String chng_min_term_mark;//费率详细名称
	public String getCUR_FUND_RATE() {
		return CUR_FUND_RATE;
	}
	public void setCUR_FUND_RATE(String cUR_FUND_RATE) {
		CUR_FUND_RATE = cUR_FUND_RATE;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * 费率名称
	 */
	private String max_term_name;
	/**
	 * --费率费用单位：-元/笔, 4-万元, 6-万份等
	 */
	private String rate_unit_name;
	/**
	 * 费率
	 */
	private float chag_rate_up_lim;
	/**
	 * 适用金额单位名称
	 */
	private String val_unit_name;
	/**
	 * 适用金额下限
	 */
	private float pert_val_low_lim;
	/**
	 * 适用金额上下限条件关系
	 */
	private String cond_rela_name;
	/**
	 * 适用金额上限
	 */
	private float pert_val_up_lim;
	/**
	 * 持有期限单位
	 */
	private String hld_term_unit_mark;
	/**
	 * 持有期限下限
	 */
	private float hld_term_low_lim;
	/**
	 * 期限条件关系
	 */
	private String term_rela_name;
	/**
	 * 持有期限上限
	 */
	private float hld_term_up_lim;
	
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
	 * @return the executedate
	 */
	public String getExecutedate() {
		return executedate;
	}
	/**
	 * @param executedate the executedate to set
	 */
	public void setExecutedate(String executedate) {
		this.executedate = executedate;
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
	 * @return the max_term_name
	 */
	public String getMax_term_name() {
		return max_term_name;
	}
	/**
	 * @param max_term_name the max_term_name to set
	 */
	public void setMax_term_name(String max_term_name) {
		this.max_term_name = max_term_name;
	}
	/**
	 * @return the rate_unit_name
	 */
	public String getRate_unit_name() {
		return rate_unit_name;
	}
	/**
	 * @param rate_unit_name the rate_unit_name to set
	 */
	public void setRate_unit_name(String rate_unit_name) {
		this.rate_unit_name = rate_unit_name;
	}
	/**
	 * @return the chag_rate_up_lim
	 */
	public float getChag_rate_up_lim() {
		return chag_rate_up_lim;
	}
	/**
	 * @param chag_rate_up_lim the chag_rate_up_lim to set
	 */
	public void setChag_rate_up_lim(float chag_rate_up_lim) {
		this.chag_rate_up_lim = chag_rate_up_lim;
	}
	/**
	 * @return the val_unit_name
	 */
	public String getVal_unit_name() {
		return val_unit_name;
	}
	/**
	 * @param val_unit_name the val_unit_name to set
	 */
	public void setVal_unit_name(String val_unit_name) {
		this.val_unit_name = val_unit_name;
	}
	/**
	 * @return the pert_val_low_lim
	 */
	public float getPert_val_low_lim() {
		return pert_val_low_lim;
	}
	/**
	 * @param pert_val_low_lim the pert_val_low_lim to set
	 */
	public void setPert_val_low_lim(float pert_val_low_lim) {
		this.pert_val_low_lim = pert_val_low_lim;
	}
	/**
	 * @return the cond_rela_name
	 */
	public String getCond_rela_name() {
		return cond_rela_name;
	}
	/**
	 * @param cond_rela_name the cond_rela_name to set
	 */
	public void setCond_rela_name(String cond_rela_name) {
		this.cond_rela_name = cond_rela_name;
	}
	/**
	 * @return the pert_val_up_lim
	 */
	public float getPert_val_up_lim() {
		return pert_val_up_lim;
	}
	/**
	 * @param pert_val_up_lim the pert_val_up_lim to set
	 */
	public void setPert_val_up_lim(float pert_val_up_lim) {
		this.pert_val_up_lim = pert_val_up_lim;
	}
	/**
	 * @return the hld_term_unit_mark
	 */
	public String getHld_term_unit_mark() {
		return hld_term_unit_mark;
	}
	/**
	 * @param hld_term_unit_mark the hld_term_unit_mark to set
	 */
	public void setHld_term_unit_mark(String hld_term_unit_mark) {
		this.hld_term_unit_mark = hld_term_unit_mark;
	}
	/**
	 * @return the hld_term_low_lim
	 */
	public float getHld_term_low_lim() {
		return hld_term_low_lim;
	}
	/**
	 * @param hld_term_low_lim the hld_term_low_lim to set
	 */
	public void setHld_term_low_lim(float hld_term_low_lim) {
		this.hld_term_low_lim = hld_term_low_lim;
	}
	/**
	 * @return the term_rela_name
	 */
	public String getTerm_rela_name() {
		return term_rela_name;
	}
	/**
	 * @param term_rela_name the term_rela_name to set
	 */
	public void setTerm_rela_name(String term_rela_name) {
		this.term_rela_name = term_rela_name;
	}
	/**
	 * @return the hld_term_up_lim
	 */
	public float getHld_term_up_lim() {
		return hld_term_up_lim;
	}
	/**
	 * @param hld_term_up_lim the hld_term_up_lim to set
	 */
	public void setHld_term_up_lim(float hld_term_up_lim) {
		this.hld_term_up_lim = hld_term_up_lim;
	}
	/**
	 * @return the chng_min_term_mark
	 */
	public String getChng_min_term_mark() {
		return chng_min_term_mark;
	}
	/**
	 * @param chng_min_term_mark the chng_min_term_mark to set
	 */
	public void setChng_min_term_mark(String chng_min_term_mark) {
		this.chng_min_term_mark = chng_min_term_mark;
	}
	
	



}
