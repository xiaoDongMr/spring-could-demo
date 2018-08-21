/**
 * 
 */
package cn.yilucaifu.mapper.persistence_jl;


import cn.yilucaifu.domain.fundinfo.*;
import cn.yilucaifu.domain.fundinfo.queryParam.FundQueryParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @author Administrator
 * 
 */
public interface FundDao {


	// 基金经理
	public List<FundManager> queryFundManagerByInnercode(
            @Param("inner_code") String inner_code);

	// 基金分红
	public List<FundDiv> queryFundDivList(@Param("inner_code") String inner_code);

	// 公告详情
	public FundAnnounceDetail getFundAnnounceDetail(
            @Param("disc_id") String disc_id);

	// 根据基金代码查询基金费率
	public List<FundChagRate> queryFundChagRateListByFundcode(
            @Param("fund_code") String fund_code);

	// 快赎标志
	public Integer getFundIsQuickRedeemByFundCode(
            @Param("fundcode") String fundcode);

	// 根据基金内部代码查询基金费率
	public List<FundChagRate> queryFundChagRateList(
            @Param("inner_code") String inner_code);

	// 可购买基金模糊查询
	public List<FuzzyMatchFund> enableBuyMatchFund(@Param("key") String key);

	// 基金精选列表
	public List<FundDetail> getChonseFundList(@Param("length") int length);

	// 查询基金的信息
	public String getInnercodeBuFundCode(@Param("fund_code") String fund_code);

	// 查询基金的信息
	public Fund getFundByInnerCode(@Param("inner_code") String inner_code);

	// 查询基金募集日期
	public String getRaiseEndDate(@Param("inner_code") String inner_code);

	// 查询基金信息
	public MobileFund getMobileFundByInnerCode(
            @Param("inner_code") String inner_code);

	// 基金频道页
	public List<FundDetail> queryFundListByPage(FundQueryParam fundQueryParam);

}
