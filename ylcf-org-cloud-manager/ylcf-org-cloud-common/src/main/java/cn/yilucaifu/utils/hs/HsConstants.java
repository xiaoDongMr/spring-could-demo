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


}
