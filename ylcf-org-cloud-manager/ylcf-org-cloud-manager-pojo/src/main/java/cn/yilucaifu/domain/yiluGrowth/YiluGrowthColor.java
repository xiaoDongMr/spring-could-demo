package cn.yilucaifu.domain.yiluGrowth;

import java.io.Serializable;

/**
 * 
 * @author {dongxiaobing}
 * 一路成长类型实体类
 */
public class YiluGrowthColor implements Serializable {
	private static final long serialVersionUID = -7317572133834328088L;
	
	private int id;
	private String type;    //一路成长类型
	private String typeColor;   //一路成长类型对应的颜色值
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
