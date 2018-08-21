package cn.yilucaifu.mapper.persistence_xuanji;

import java.util.List;
import java.util.Map;

/**
 * @author: huzhong
 * @time: 2018/7/18
 */
public interface TradeTransDetailDao {
    //交易记录每日日终同步
    public List<Map<String,Object>> synTrade(Map<String, Object> map);
}
