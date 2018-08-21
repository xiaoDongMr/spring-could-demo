/**
 * 
 */
package cn.yilucaifu.domain.fundinfo.queryParam;

import cn.yilucaifu.utils.StringUtil;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/** 
 * @author zhangpeng
 * @version 创建时间：2013-9-26 上午10:42:49 
 * 基金查询参数类
 */

public class FundQueryParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4807975236727732472L;
	private String all;//全部
	private String stock;//股票型
	private String bond;//债券型
	private String ETF;
	private String indexFund;//指数型
	private String mix;//混合型
	private String QDII;
	private String currency;//货币型
	private String financial;//理财型
	private String other;//其他
	private String safe;//保本
	private String orderBy;//排序  1mon, 3mon,6mon,1year
	private int start;//开始
	private int limit;//截至
	private String unitNet;//净值 0-1,1-2,2-3,3-5,gt5
	private String key;
	private String asc;//排序
	private List<String> foudCodeList ;  //基金代码集
	private String fundRate;
	
	public String cacheKey(){
		String cacheKey = getvalue(all)+getvalue(stock)+getvalue(bond)+getvalue(ETF)+getvalue(indexFund)+getvalue(mix)+getvalue(QDII)+getvalue(currency)
				+getvalue(financial)+getvalue(other)+getvalue(safe)+getvalue(orderBy)+start+limit+getvalue(unitNet)+key+getvalue(asc);
		return cacheKey;		
	}
	
	private String getvalue(String v){
		if(StringUtil.isEmpty(v)){
			return "0";
		}
		return v;
	}
	
	public String getFundRate() {
		return fundRate;
	}
	public void setFundRate(String fundRate) {
		this.fundRate = fundRate;
	}
	public List<String> getFoudCodeList() {
		return foudCodeList;
	}
	public void setFoudCodeList(String ...strings) {
		if(foudCodeList == null){
		 foudCodeList = new ArrayList<String>();
		}else{
			foudCodeList.clear();
		}
		for(String id : strings){
			foudCodeList.add(id) ;
		}
	}
	/**
	 * @return the all
	 */
	public String getAll() {
		return all;
	}
	/**
	 * @param all the all to set
	 */
	public void setAll(String all) {
		this.all = all;
	}
	/**
	 * @return the stock
	 */
	public String getStock() {
		return stock;
	}
	/**
	 * @param stock the stock to set
	 */
	public void setStock(String stock) {
		this.stock = stock;
	}
	/**
	 * @return the bond
	 */
	public String getBond() {
		return bond;
	}
	/**
	 * @param bond the bond to set
	 */
	public void setBond(String bond) {
		this.bond = bond;
	}

	/**
	 * @return the eTF
	 */
	public String getETF() {
		return ETF;
	}
	/**
	 * @param eTF the eTF to set
	 */
	public void setETF(String eTF) {
		ETF = eTF;
	}
	/**
	 * @return the indexFund
	 */
	public String getIndexFund() {
		return indexFund;
	}
	/**
	 * @param indexFund the indexFund to set
	 */
	public void setIndexFund(String indexFund) {
		this.indexFund = indexFund;
	}
	/**
	 * @return the mix
	 */
	public String getMix() {
		return mix;
	}
	/**
	 * @param mix the mix to set
	 */
	public void setMix(String mix) {
		this.mix = mix;
	}


	/**
	 * @return the qDII
	 */
	public String getQDII() {
		return QDII;
	}
	/**
	 * @param qDII the qDII to set
	 */
	public void setQDII(String qDII) {
		QDII = qDII;
	}
	/**
	 * @return the other
	 */
	public String getOther() {
		return other;
	}
	/**
	 * @param other the other to set
	 */
	public void setOther(String other) {
		this.other = other;
	}
	/**
	 * @return the safe
	 */
	public String getSafe() {
		return safe;
	}
	/**
	 * @param safe the safe to set
	 */
	public void setSafe(String safe) {
		this.safe = safe;
	}
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**
	 * @return the financial
	 */
	public String getFinancial() {
		return financial;
	}
	/**
	 * @param financial the financial to set
	 */
	public void setFinancial(String financial) {
		this.financial = financial;
	}
	/**
	 * @return the orderBy
	 */
	public String getOrderBy() {
		return orderBy;
	}
	/**
	 * @param orderBy the orderBy to set
	 */
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	/**
	 * @return the start
	 */
	public int getStart() {
		return start;
	}
	/**
	 * @param start the start to set
	 */
	public void setStart(int start) {
		this.start = start;
	}
	/**
	 * @return the limit
	 */
	public int getLimit() {
		return limit;
	}
	/**
	 * @param limit the limit to set
	 */
	public void setLimit(int limit) {
		this.limit = limit;
	}
	/**
	 * @return the unitNet
	 */
	public String getUnitNet() {
		return unitNet;
	}
	/**
	 * @param unitNet the unitNet to set
	 */
	public void setUnitNet(String unitNet) {
		this.unitNet = unitNet;
	}
	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}
	public String getAsc() {
		return asc;
	}
	public void setAsc(String asc) {
		this.asc = asc;
	}

}
