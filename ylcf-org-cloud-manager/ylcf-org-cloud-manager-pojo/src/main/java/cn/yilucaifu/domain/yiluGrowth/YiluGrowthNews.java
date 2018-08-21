package cn.yilucaifu.domain.yiluGrowth;

import java.io.Serializable;

/**
 * 
 * @author {dongxiaobing}
 * 一路成长新闻实体类
 */
public class YiluGrowthNews implements Serializable {
	private static final long serialVersionUID = -3192650133880504981L;

	private int id;
	private int position;		// 排位
	private String mediaName;	// 媒体名称
	private String articleName;		// 文章名称
	private String contentSummary;	// 内容摘要
	private String url;				// 报道链接
	private String operateTime;		// 操作时间
	private int isEnable;			// 是否启用，0：不启用，1：启用
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public String getMediaName() {
		return mediaName;
	}
	public void setMediaName(String mediaName) {
		this.mediaName = mediaName;
	}
	public String getArticleName() {
		return articleName;
	}
	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}
	public String getContentSummary() {
		return contentSummary;
	}
	public void setContentSummary(String contentSummary) {
		this.contentSummary = contentSummary;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getOperateTime() {
		return operateTime;
	}
	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}
	public int getIsEnable() {
		return isEnable;
	}
	public void setIsEnable(int isEnable) {
		this.isEnable = isEnable;
	}
	
}
