/**
 * 
 */
package cn.yilucaifu.domain.fundinfo;

import java.io.Serializable;

/** 
 * @author zhangpeng
 * @version 创建时间：2013-8-21 下午7:55:02 
 * 类说明 
 * 
 * 基金资产配置
 */

public class FundAsset implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3902379024069331698L;
	/**
	 * 发布时间
	 */
	private String enddate;
	/**
	 * 股票持有量（万元）
	 */
	private String stk_val;
	/**
	 * 股票在总资产中所占比例%
	 */
	private String stk_val_asset_prop;
	/**
	 * 股票在总净资产中所占比例%
	 */
	private String stk_val_na_prop;

	/**
	 * 债券（万元）
	 */
	private String bnd_val;
	/**
	 * 债券百分比
	 */
	private String bnd_val_asset_prop;
	/**
	 * 债券在总净资产中所占比例%
	 */
	private String bnd_val_na_prop;
	/**
	 * 现金（万元）
	 */
	private String dep_reck_up;
	/**
	 * 现金百分比
	 */
	private String dep_reck_up_asset_up;
	/**
	 * 现金在总净资产中所占比例%
	 */
	private String dep_val_na_prop;
	/**
	 * 其余（万元）
	 */
	private String oth_asset_val;
	/**
	 * 其他资产百分比
	 */
	private String oth_asset_val_tot_prop;
	/**
	 * 其他在总净资产中所占比例%
	 */
	private String oth_val_na_prop;
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
	 * @return the stk_val
	 */
	public String getStk_val() {
		return stk_val;
	}
	/**
	 * @param stk_val the stk_val to set
	 */
	public void setStk_val(String stk_val) {
		this.stk_val = stk_val;
	}
	/**
	 * @return the stk_val_asset_prop
	 */
	public String getStk_val_asset_prop() {
		return stk_val_asset_prop;
	}
	/**
	 * @param stk_val_asset_prop the stk_val_asset_prop to set
	 */
	public void setStk_val_asset_prop(String stk_val_asset_prop) {
		this.stk_val_asset_prop = stk_val_asset_prop;
	}
	/**
	 * @return the bnd_val
	 */
	public String getBnd_val() {
		return bnd_val;
	}
	/**
	 * @param bnd_val the bnd_val to set
	 */
	public void setBnd_val(String bnd_val) {
		this.bnd_val = bnd_val;
	}
	/**
	 * @return the bnd_val_asset_prop
	 */
	public String getBnd_val_asset_prop() {
		return bnd_val_asset_prop;
	}
	/**
	 * @param bnd_val_asset_prop the bnd_val_asset_prop to set
	 */
	public void setBnd_val_asset_prop(String bnd_val_asset_prop) {
		this.bnd_val_asset_prop = bnd_val_asset_prop;
	}
	/**
	 * @return the dep_reck_up
	 */
	public String getDep_reck_up() {
		return dep_reck_up;
	}
	/**
	 * @param dep_reck_up the dep_reck_up to set
	 */
	public void setDep_reck_up(String dep_reck_up) {
		this.dep_reck_up = dep_reck_up;
	}
	/**
	 * @return the dep_reck_up_asset_up
	 */
	public String getDep_reck_up_asset_up() {
		return dep_reck_up_asset_up;
	}
	/**
	 * @param dep_reck_up_asset_up the dep_reck_up_asset_up to set
	 */
	public void setDep_reck_up_asset_up(String dep_reck_up_asset_up) {
		this.dep_reck_up_asset_up = dep_reck_up_asset_up;
	}
	/**
	 * @return the oth_asset_val
	 */
	public String getOth_asset_val() {
		return oth_asset_val;
	}
	/**
	 * @param oth_asset_val the oth_asset_val to set
	 */
	public void setOth_asset_val(String oth_asset_val) {
		this.oth_asset_val = oth_asset_val;
	}
	/**
	 * @return the oth_asset_val_tot_prop
	 */
	public String getOth_asset_val_tot_prop() {
		return oth_asset_val_tot_prop;
	}
	/**
	 * @param oth_asset_val_tot_prop the oth_asset_val_tot_prop to set
	 */
	public void setOth_asset_val_tot_prop(String oth_asset_val_tot_prop) {
		this.oth_asset_val_tot_prop = oth_asset_val_tot_prop;
	}

	public String getStk_val_na_prop() {
		return stk_val_na_prop;
	}

	public void setStk_val_na_prop(String stk_val_na_prop) {
		this.stk_val_na_prop = stk_val_na_prop;
	}

	public String getBnd_val_na_prop() {
		return bnd_val_na_prop;
	}

	public void setBnd_val_na_prop(String bnd_val_na_prop) {
		this.bnd_val_na_prop = bnd_val_na_prop;
	}

	public String getDep_val_na_prop() {
		return dep_val_na_prop;
	}

	public void setDep_val_na_prop(String dep_val_na_prop) {
		this.dep_val_na_prop = dep_val_na_prop;
	}

	public String getOth_val_na_prop() {
		return oth_val_na_prop;
	}

	public void setOth_val_na_prop(String oth_val_na_prop) {
		this.oth_val_na_prop = oth_val_na_prop;
	}
}
