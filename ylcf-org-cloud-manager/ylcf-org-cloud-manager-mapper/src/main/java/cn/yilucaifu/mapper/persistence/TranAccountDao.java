package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.fundinfo.TranAccount;
import org.apache.ibatis.annotations.Param;

/**
 * filename：cn.yilucaifu.mapper.persistence.XuanjiTranAccountDao.java
 *
 * @author: zhangyong
 * @time: 2013-10-10下午2:20:13
 */

public interface TranAccountDao {
	/**
	 * 根据用户id获得基金账户
	 *
	 * @param userid
	 * @return
	 */

	public TranAccount getAccountByUserId(@Param("userid") int userid);

	/**
	 * 新增基金账户
	 *
	 * @param account
	 * @throws Exception
	 */
	public void createAccount(TranAccount account);

	/**
	 * 根据ui查找基金账户信息
	 * @param ui
	 * @return
     */
	public TranAccount getAccountByUi(
            @Param("ui") String ui);


	/**
	 * 修改基金账号信息
	 *
	 * @param account
	 */
	public void updateAccount(TranAccount account);

	//同步璇玑交易账号，根据account_id更新xuanji_ui
	public void updateXuanjiUi(TranAccount tranAccount);
}
