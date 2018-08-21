package cn.yilucaifu.mapper.persistence;


import cn.yilucaifu.domain.fundinfo.PinganFundnav;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * filename：com.PinganFundinfoDao.java
 * 
 * @author: zhangyong
 * @time: 2013-10-19下午2:52:12
 */

public interface PinganFundnavDao {

	public List<PinganFundnav> getNavCal(@Param("fundcode") String fundcode, @Param("distributorcode") String distributorcode, @Param("limit") int limit);

}
