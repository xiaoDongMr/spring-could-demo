package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.fundinfo.PinganFundinfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * filename：com.PinganFundinfoDao.java
 * 
 * @author: zhangyong
 * @time: 2013-10-19下午2:52:12
 */

public interface PinganFundinfoDao {

	/**
	 * 根据基金代码查询基金信息
	 * 
	 * @param fundcode
	 * @return
	 */
	public PinganFundinfo findFundinfoByFundcode(
            @Param("fundcode") String fundcode,
            @Param("distributorcode") String distributorcode);

	/**
	 * 根据用户持有基金查询基金基本信息
	 * @param list
	 * @return
	 */
	public List<Map<String,Object>> getHoldFundInfo(List<String> list);
}
