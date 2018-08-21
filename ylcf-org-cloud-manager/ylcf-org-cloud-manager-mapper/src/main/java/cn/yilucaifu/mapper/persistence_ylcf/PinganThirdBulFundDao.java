package cn.yilucaifu.mapper.persistence_ylcf;

import cn.yilucaifu.domain.fundinfo.PinganThirdBulFund;
import org.apache.ibatis.annotations.Param;


/**
 * * <一句话功能简述> <功能详细描述>
 * 
 * @author ylcf-yxm
 * @version [版本号, 2015-10-12]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public interface PinganThirdBulFundDao {

	/***
	 * 获取投资者持有基金最新的信息
	 * @param transactionaccountid
	 * @param fundcode
     * @return
     */
	public PinganThirdBulFund getLastedThirdBulFundByFundcode(@Param("transactionaccountid") String transactionaccountid,
                                                              @Param("fundcode") String fundcode);

}
