package cn.yilucaifu.mapper.persistence_xuanji;

import java.util.List;
import java.util.Map;

/**
 * @author: huzhong
 * @time: 2018/7/17
 * 用户账户信息
 */
public interface UserInfoXuanjiDao {
    //交易账号每日日终同步
    public List<Map<String,Object>> synAccount(Map<String, Object> map);
}
