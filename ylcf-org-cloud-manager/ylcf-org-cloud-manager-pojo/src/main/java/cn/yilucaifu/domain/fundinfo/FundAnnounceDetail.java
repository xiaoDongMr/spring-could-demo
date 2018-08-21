/**
 * 
 */
package cn.yilucaifu.domain.fundinfo;

import java.io.Serializable;

/** 
 * @author zhangpeng
 * @version 创建时间：2013-9-4 上午10:06:48 
 * 基金公告详细信息
 */
public class FundAnnounceDetail implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7880985196923173952L;
	/**
	 * 公告正文
	 */
	private String txt_content;
	/**
	 * 公告标识
	 */
	private String disc_id;
	/**
	 * 附件序号
	 */
	private float acce_order;
	/**
	 * 附件路径
	 */
	private String acce_route;
	/**
	 * 附件类型
	 */
	private String acce_type;
	/**
	 * 附件标题
	 */
	private String acce_title;
	/**
	 * 公告标题
	 */
	private String title;
	/**
	 * 公告来源
	 */
	private String source;
	/**
	 * 公告时间
	 */
	private String declaredate;
	
	/**
	 * @return the txt_content
	 */
	public String getTxt_content() {
		return txt_content;
	}
	/**
	 * @param txt_content the txt_content to set
	 */
	public void setTxt_content(String txt_content) {
		this.txt_content = txt_content;
	}
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
	 * @return the acce_order
	 */
	public float getAcce_order() {
		return acce_order;
	}
	/**
	 * @param acce_order the acce_order to set
	 */
	public void setAcce_order(float acce_order) {
		this.acce_order = acce_order;
	}
	/**
	 * @return the acce_route
	 */
	public String getAcce_route() {
		return acce_route;
	}
	/**
	 * @param acce_route the acce_route to set
	 */
	public void setAcce_route(String acce_route) {
		this.acce_route = acce_route;
	}
	/**
	 * @return the acce_type
	 */
	public String getAcce_type() {
		return acce_type;
	}
	/**
	 * @param acce_type the acce_type to set
	 */
	public void setAcce_type(String acce_type) {
		this.acce_type = acce_type;
	}
	/**
	 * @return the acce_title
	 */
	public String getAcce_title() {
		return acce_title;
	}
	/**
	 * @param acce_title the acce_title to set
	 */
	public void setAcce_title(String acce_title) {
		this.acce_title = acce_title;
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
