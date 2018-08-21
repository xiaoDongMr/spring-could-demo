package cn.yilucaifu.utils.hs;

import java.util.*;

/**
 * 平安接口报文公共常量
 * 
 * @author zhangyong
 * 
 */
public class HsConstants {


	/**
	 * 基金类型
	 */
	public static final Map<String, String> fundtypeMap = new HashMap<String, String>();
	static {
		fundtypeMap.put("0", "普通型");
		fundtypeMap.put("1", "股票型");
		fundtypeMap.put("2", "货币型");
		fundtypeMap.put("3", "股票型");
		fundtypeMap.put("4", "股债平衡型");
		fundtypeMap.put("5", "偏债型");
		fundtypeMap.put("6", "债券型");
		fundtypeMap.put("7", "保本型");
		fundtypeMap.put("8", "指数型");
		fundtypeMap.put("9", "短债型");
		fundtypeMap.put("a", "QDII型");
		fundtypeMap.put("b", "混合型");
		fundtypeMap.put("c", "券商理财型");
		fundtypeMap.put("d", "牛熊宝");
		fundtypeMap.put("e", "现金产品");
		fundtypeMap.put("f", "一对多产品");
		fundtypeMap.put("g", "短期理财产品");
		fundtypeMap.put("h", "封闭式T+0");
		fundtypeMap.put("i", "保证金理财");
		fundtypeMap.put("j", "现金产品");
		fundtypeMap.put("k", "一对多产品");
		fundtypeMap.put("l", "短期理财产品");
		fundtypeMap.put("m", "ETF");
		fundtypeMap.put("n", "专户产品");
		fundtypeMap.put("o", "LOF");
	}

	/**
	 * 投资人风险承受能力
	 */
	public static final Map<String, String> risklevelMap = new HashMap<String, String>();
	static {
		risklevelMap.put("0", "保守型");
		risklevelMap.put("1", "保守型");
		risklevelMap.put("2", "稳健型");
		risklevelMap.put("3", "平衡型");
		risklevelMap.put("4", "成长型");
		risklevelMap.put("5", "积极型");
	}


	/**
	 * 银行总行行号列表
	 */
	public static final Map<String, String> bktypeNameMap = new HashMap<String, String>();
	// 工商银行、农业银行、中国银行、建设银行、招商银行、平安银行、邮政储蓄银行、广发银行、光大银行、民生银行、徽商银行；
	static {
		bktypeNameMap.put("307", "平安银行");
		bktypeNameMap.put("102", "中国工商银行");
		bktypeNameMap.put("103", "中国农业银行");
		bktypeNameMap.put("104", "中国银行");
		bktypeNameMap.put("105", "中国建设银行");
		bktypeNameMap.put("308", "招商银行");
		bktypeNameMap.put("100", "中国邮政储蓄银行");// 邮政与徽商编码保持一致
		bktypeNameMap.put("303", "中国光大银行");
		bktypeNameMap.put("305", "中国民生银行");
		bktypeNameMap.put("302", "中信银行");
		bktypeNameMap.put("9999", "中信银行");
		bktypeNameMap.put("309", "兴业银行");
		bktypeNameMap.put("310", "浦发银行");
		bktypeNameMap.put("306", "广发银行");
		bktypeNameMap.put("304", "华夏银行");
		bktypeNameMap.put("313", "上海银行");//旧版
		bktypeNameMap.put("401", "上海银行");//上海与徽商编码保持一致
		bktypeNameMap.put("922", "北京银行");//旧版
		bktypeNameMap.put("403", "北京银行");//北京与徽商编码保持一致
		bktypeNameMap.put("301", "交通银行");
		bktypeNameMap.put("319", "徽商银行");//旧版
		bktypeNameMap.put("440", "徽商银行");//北京与徽商编码保持一致
		bktypeNameMap.put("1401", "上海农村商业银行");//上海农村商业银行与徽商编码保持一致
	}


}
