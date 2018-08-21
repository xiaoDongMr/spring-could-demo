package cn.yilucaifu.utils.hs;

import cn.yilucaifu.utils.ConfigUtil;
import cn.yilucaifu.utils.StringUtil;

import java.util.*;

/**
 * 平安接口报文公共常量
 * 
 * @author zhangyong
 * 
 */
public class PinganConstants {


    // 分红方式
    public static final Map<String, String> optypeMap = new HashMap<String, String>();
    static {
        optypeMap.put("1", "现金分红");
        optypeMap.put("0", "红利转投");
    }

}
