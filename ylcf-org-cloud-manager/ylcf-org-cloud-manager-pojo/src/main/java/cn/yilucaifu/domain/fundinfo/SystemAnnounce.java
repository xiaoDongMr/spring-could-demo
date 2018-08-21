/**
 * 
 */
package cn.yilucaifu.domain.fundinfo;

import java.io.Serializable;

/** 
 * @author zhangpeng
 * @version 创建时间：2014-4-15 上午10:01:54 
 * 类说明 
 */

public class SystemAnnounce implements Serializable {
	private static final long serialVersionUID = -6661981913767784304L;
	
	private int id;
	private String page;
	private String context;
	private int enabled;  
	private String title;
	private String createtime;
	
	private int contextType; //内容分类 0.其他 1.平台公告	2.产品公告 3。活动公告 4调研公告……'
	private String titleImg;//标题图片
	private String contextImg;//内容图片
	private String contextImgWidth;//内容图片宽度
	private String contextImgHeight;//内容图片高度
	private String link;//链接
	
	private String show_position;//显示客户端
	private String start_time;//开始生效时间
	private String end_time;//开始结束时间
	
	/**
	 * @return the page
	 */
	public String getPage() {
		return page;
	}
	/**
	 * @param page the page to set
	 */
	public void setPage(String page) {
		this.page = page;
	}
	/**
	 * @return the context
	 */
	public String getContext() {
		return context;
	}
	/**
	 * @param context the context to set
	 */
	public void setContext(String context) {
		this.context = context;
	}
	/**
	 * @return the enabled
	 */
	public int getEnabled() {
		return enabled;
	}
	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public int getContextType() {
		return contextType;
	}
	public void setContextType(int contextType) {
		this.contextType = contextType;
	}
	public String getTitleImg() {
		return titleImg;
	}
	public void setTitleImg(String titleImg) {
		this.titleImg = titleImg;
	}
	public String getContextImg() {
		return contextImg;
	}
	public void setContextImg(String contextImg) {
		this.contextImg = contextImg;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getContextImgWidth() {
		return contextImgWidth;
	}
	public void setContextImgWidth(String contextImgWidth) {
		this.contextImgWidth = contextImgWidth;
	}
	public String getContextImgHeight() {
		return contextImgHeight;
	}
	public void setContextImgHeight(String contextImgHeight) {
		this.contextImgHeight = contextImgHeight;
	}
	public String getShow_position() {
		return show_position;
	}
	public void setShow_position(String show_position) {
		this.show_position = show_position;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

}
