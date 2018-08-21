/**
 * 
 */
package cn.yilucaifu.domain.fundinfo;

import java.io.Serializable;

/** 
 * @author zhangpeng
 * @version 创建时间：2013-8-21 下午3:28:34 
 * 类说明 
 */

public class FundManager implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2859355451185504386L;
	private int INNER_CODE;//内部代码
	private String INDI_NAME;//高管姓名
	private int INDI_ID;//高管ID
	private String POST_STATUS_MARK;//在职状态
	private String POST_MARK;//职位
	private String LEAVE_RSN_MARK;
	private String POST_DATE;//到职日期
	private String RESUME;//个人简历
	private int GENDER;//性别
	private String manger_pic="public/fund/images/default.jpg";//照片
	private String MANA_CODE;//机构代码
	
	
	/**
	 * @return the iNNER_CODE
	 */
	public int getINNER_CODE() {
		return INNER_CODE;
	}
	/**
	 * @param iNNER_CODE the iNNER_CODE to set
	 */
	public void setINNER_CODE(int iNNER_CODE) {
		INNER_CODE = iNNER_CODE;
	}
	/**
	 * @return the iNDI_NAME
	 */
	public String getINDI_NAME() {
		return INDI_NAME;
	}
	/**
	 * @param iNDI_NAME the iNDI_NAME to set
	 */
	public void setINDI_NAME(String iNDI_NAME) {
		INDI_NAME = iNDI_NAME;
	}
	/**
	 * @return the iNDI_ID
	 */
	public int getINDI_ID() {
		return INDI_ID;
	}
	/**
	 * @param iNDI_ID the iNDI_ID to set
	 */
	public void setINDI_ID(int iNDI_ID) {
		INDI_ID = iNDI_ID;
	}
	/**
	 * @return the pOST_STATUS_MARK
	 */
	public String getPOST_STATUS_MARK() {
		return POST_STATUS_MARK;
	}
	/**
	 * @param pOST_STATUS_MARK the pOST_STATUS_MARK to set
	 */
	public void setPOST_STATUS_MARK(String pOST_STATUS_MARK) {
		POST_STATUS_MARK = pOST_STATUS_MARK;
	}
	/**
	 * @return the pOST_MARK
	 */
	public String getPOST_MARK() {
		return POST_MARK;
	}
	/**
	 * @param pOST_MARK the pOST_MARK to set
	 */
	public void setPOST_MARK(String pOST_MARK) {
		POST_MARK = pOST_MARK;
	}
	/**
	 * @return the lEAVE_RSN_MARK
	 */
	public String getLEAVE_RSN_MARK() {
		return LEAVE_RSN_MARK;
	}
	/**
	 * @param lEAVE_RSN_MARK the lEAVE_RSN_MARK to set
	 */
	public void setLEAVE_RSN_MARK(String lEAVE_RSN_MARK) {
		LEAVE_RSN_MARK = lEAVE_RSN_MARK;
	}
	/**
	 * @return the pOST_DATE
	 */
	public String getPOST_DATE() {
		return POST_DATE;
	}
	/**
	 * @param pOST_DATE the pOST_DATE to set
	 */
	public void setPOST_DATE(String pOST_DATE) {
		POST_DATE = pOST_DATE;
	}
	/**
	 * @return the rESUME
	 */
	public String getRESUME() {
		return RESUME;
	}
	/**
	 * @param rESUME the rESUME to set
	 */
	public void setRESUME(String rESUME) {
		RESUME = rESUME;
	}
	/**
	 * @return the gENDER
	 */
	public int getGENDER() {
		return GENDER;
	}
	/**
	 * @param gENDER the gENDER to set
	 */
	public void setGENDER(int gENDER) {
		GENDER = gENDER;
	}
	/**
	 * @return the manger_pic
	 */
	public String getManger_pic() {
		return manger_pic;
	}
	/**
	 * @param manger_pic the manger_pic to set
	 */
	public void setManger_pic(String manger_pic) {
		this.manger_pic = manger_pic;
	}
	public String getMANA_CODE() {
		return MANA_CODE;
	}
	public void setMANA_CODE(String mANA_CODE) {
		MANA_CODE = mANA_CODE;
	}

	
	

}
