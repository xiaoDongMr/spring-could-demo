/**
 *
 */
package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.fundinfo.RecommendFund;
import cn.yilucaifu.domain.fundinfo.RecommendFundMap;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author zhangpeng
 * @version 创建时间：2013-8-27 上午10:36:12 类说明
 */

public interface RecommendDao {


	/**
	 * 判断是否是新发基金
	 * @param fundcode
	 * @return
     */
	public List<RecommendFund> findNewFundListByFundcode(@Param("fundcode") String fundcode);

	/**
	 * 判断是否是精选基金
	 * @param fundcode
	 * @return
     */
	public 	List<RecommendFundMap> findChosenFundByFundcode(@Param("fundcode") String fundcode);

	/**
	 * 查找推荐信息
	 * @param fundcode
	 * @return
     */
	public RecommendFund selectMammonRecommandByFundcode(
            @Param("fundcode") String fundcode);

	/**
	 * 获取精选基金
	 * @return
	 */
	public List<Map<String,Object>> getChosenFundList(int length);

	/**
	 * 获取推荐基金列表
	 * @param recommendType
	 * @return
	 */
	public Map<String, Object> findRecommendFundList(@Param("recommendType") String recommendType);

	/**
	 * 更新推荐基金信息
	 * @param recommendType
	 */
	public void updateRecommendFundInfo(@Param("recommendType") String recommendType, @Param("recommendCode") String recommendCode);

	/**
	 * 保存推荐的基金信息
	 * @param map
	 */
	public void saveRecommendFundInfo(Map<String, Object> map);

}
