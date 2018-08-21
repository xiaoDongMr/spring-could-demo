package cn.yilucaifu.domain.yiluGrowth;

import java.io.Serializable;

/**
 * 
 * @author {dongxiaobing}
 * 一路成长实体类
 */
public class YiluGrowth implements Serializable {

	private static final long serialVersionUID = -2294794449903783385L;
	
	private int id;   //主键id
	private String title;			//标题
	private String mediaFrom;		//媒体来源
	private String briefIntro;		//简述
	private String article;		//文章全文
	private String createDate;		//发生时间
	private int typeId;      //对应的color中的id
	private String occuryear;
//	private String typeName;
	private String dateForShow;
	private String type;    //一路成长类型
	private String typeColor;   //一路成长类型对应的颜色值
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMediaFrom() {
		return mediaFrom;
	}
	public void setMediaFrom(String mediaFrom) {
		this.mediaFrom = mediaFrom;
	}
	public String getBriefIntro() {
		return briefIntro;
	}
	public void setBriefIntro(String briefIntro) {
		this.briefIntro = briefIntro;
	}
	public String getArticle() {
		return article;
	}
	public void setArticle(String article) {
		this.article = article;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getOccuryear() {
		return occuryear;
	}
	public void setOccuryear(String occuryear) {
		this.occuryear = occuryear;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
//		public String getTypeName() {
//		if(type != null){
//			typeName = YLCFConstants.YLGrowthTypeNanmeMap.get(type);
//		}
//		return typeName;
//	}
//	public void setTypeName(String typeName) {
//		this.typeName = typeName;
//	}
	public String getDateForShow() {
		if(createDate != null && createDate.length() >= 10){
			dateForShow = createDate.substring(5, 10);
//          dateForShow = dateForShow.replace("-", "月")+"日";
		}else if(createDate != null && createDate.length() == 7){
			dateForShow = createDate.substring(5, 7);
//			dateForShow = dateForShow +"月";
		}
		return dateForShow;
	}
	public void setDateForShow(String dateForShow) {
		this.dateForShow = dateForShow;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTypeColor() {
		return typeColor;
	}
	public void setTypeColor(String typeColor) {
		this.typeColor = typeColor;
	}
	
}