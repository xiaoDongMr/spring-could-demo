package cn.yilucaifu.utils;


import java.util.HashMap;
import java.util.Map;

public final class YLCFConstants {

	public static final Map<String, String> fundTypeNanmeMap = new HashMap<String, String>();
	static {
		fundTypeNanmeMap.put("1", "封闭式基金");
		fundTypeNanmeMap.put("2", "股票型");
		fundTypeNanmeMap.put("3", "混合型");
		fundTypeNanmeMap.put("4", "ETF");
		fundTypeNanmeMap.put("5", "债券型");
		fundTypeNanmeMap.put("6", "货币型");
		fundTypeNanmeMap.put("7", "QDII");
		fundTypeNanmeMap.put("8", "其他");
		fundTypeNanmeMap.put("9", "指数型");
		fundTypeNanmeMap.put("10", "保本基金");
		fundTypeNanmeMap.put("11", "理财基金");
	}
}
