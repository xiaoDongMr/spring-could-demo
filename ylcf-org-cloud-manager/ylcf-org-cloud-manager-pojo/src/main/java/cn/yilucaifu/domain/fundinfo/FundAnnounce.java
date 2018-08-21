/**
 * 
 */
package cn.yilucaifu.domain.fundinfo;

import java.io.Serializable;

/** 
 * @author zhangpeng
 * @version 创建时间：2013-9-3 下午4:00:50 
 * 基金公告 
 */


public class FundAnnounce implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3740958902440593377L;
	/**
	 * 公告标识
	 */
	private String disc_id;
	/**
	 * 标题
	 */
	private String title;
	/**
	 * 来源
	 */
	private String source;
	/**
	 * 公告日期
	 */
	private String declaredate;
	/**
	 * @return the disc_id
	 */
	public String getDisc_id() {
		return disc_id;
	}
	/**
	 * @param disc_id the disc_id to set
	 */
	public void setDisc_id(String disc_id) {
		this.disc_id = disc_id;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}
	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}
	/**
	 * @return the declaredate
	 */
	public String getDeclaredate() {
		return declaredate;
	}
	/**
	 * @param declaredate the declaredate to set
	 */
	public void setDeclaredate(String declaredate) {
		this.declaredate = declaredate;
	}

	
	


}
