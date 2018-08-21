package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.fundinfo.PinganFundlimit;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author: zhangyong
 * @time: 2013-10-21上午9:53:15
 */

public interface PinganFundlimitDao {

	/**
	 *
	 * @param fundcode
	 * @return
	 */

	public PinganFundlimit findFundlimitByFundcode(String fundcode);

	/**
	 *
	 * @param fundcode
	 * @param businessname
	 * @return
     */
	public PinganFundlimit findFundlimitByFundcodeBuss(@Param("fundcode") String fundcode, @Param("businessname") String businessname);

}
