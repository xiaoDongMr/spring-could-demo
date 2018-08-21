/**
 * 
 */
package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.fundinfo.RecommandProduct;

/**
 *
 * @author: linan
 * @time: 2015-4-29 下午7:01:44
 */
public interface RecommandProductDao {

	 public RecommandProduct selectRecommandByFundcode(String fundCode);

}
