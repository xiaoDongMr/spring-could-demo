package cn.yilucaifu.domain.fundinfo;

import java.io.Serializable;

//首页推荐便签实体
public class FundRecomendLabel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8630005108787955994L;
	private	int	id;	//
	private	String	label_name;	//标签名
	private	int	is_show;	//是否显示 0不显示  1显示
	private	int	show_position;	//
	private	int	fund_type;	//
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLabel_name() {
		return label_name;
	}
	public void setLabel_name(String label_name) {
		this.label_name = label_name;
	}
	public int getIs_show() {
		return is_show;
	}
	public void setIs_show(int is_show) {
		this.is_show = is_show;
	}
	public int getShow_position() {
		return show_position;
	}
	public void setShow_position(int show_postion) {
		this.show_position = show_postion;
	}
	public int getFund_type() {
		return fund_type;
	}
	public void setFund_type(int fund_type) {
		this.fund_type = fund_type;
	}
	
	
}
