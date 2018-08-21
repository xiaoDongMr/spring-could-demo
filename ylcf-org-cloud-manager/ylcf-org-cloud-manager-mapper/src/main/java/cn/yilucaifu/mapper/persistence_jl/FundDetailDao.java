package cn.yilucaifu.mapper.persistence_jl;

import cn.yilucaifu.domain.fundinfo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by yangkang on 2018/2/8 0008.
 */
public interface FundDetailDao {
    // 基金详情页 -----------------------------------
    // 获取基金的日申购金额
    public Map<String,Object> getValLimit(@Param("inner_code") String inner_code);

    // 资产配置
    public List<FundAsset> queryFundAsset(@Param("fund_id") String fund_id);

    // 十大重仓持股
    public List<FundStk> queryFundStkOfTen(@Param("fund_id") String fund_id);

    // 基金公告
    public List<FundAnnounce> queryFundAnnounce(
            @Param("inner_code") String inner_code, @Param("start") int start,
            @Param("pageSize") int pageSize);

    // 根据fund_code获取基金详情信息
    public FundDetail queryFundDetailByFundcode(@Param("fund_code") String fund_code);

    // 获取非货基历史净值和货基的七日年化
    public List<FundDetail> getFundAccumNetHistory(@Param("fund_code") String fund_code,
                                                   @Param("start") int start,
                                                   @Param("pageSize") int pageSize);

    // 获取基金的同类平均（同fund_type，不同阶段对应增长率的平均值）
    public Map<String,Object> getFundKindAvg(@Param("fund_type") String fund_type);

    // 获取货币和理财型基金的不同阶段的同类排名
    public Map<String,Object> getKindRankOfCoin(@Param("fund_code") String fund_code);

    // 获取非货币和非理财型基金的不同阶段的同类排名
    public Map<String,Object> getKindRank(@Param("fund_code") String fund_code);

    // 同类基金排名走势，指标：近3月涨幅
    public List<Map<String,Object>> getKindRankHistoryOf3mon(@Param("fund_code") String fund_code,
                                                             @Param("fund_type") String fund_type,
                                                             @Param("month") String month);
    // 获取货基的收益结转时间
    public Map<String,Object> getCarryTime(@Param("inner_code") String inner_code);

    // 获取基金的风险等级
    public Map<String,Object> getFundriskgradeInfo(@Param("inner_code") String inner_code);

    // 海通证券基金评级
    public Map<String,Object> getHtsecRate(@Param("inner_code") String inner_code);

    // 获取基金评级
    public List<Map<String,Object>> getFundRateList(@Param("inner_code") String inner_code,
                                                    @Param("start") int start,
                                                    @Param("pageSize") int pageSize);
    // 获取基金规模变动
    public List<Map<String,Object>> getFundScaleList(@Param("inner_code") String inner_code);

    // 获取行业资产配置
    public List<FundIndu> getFundInduList(@Param("inner_code") String inner_code);

    // 基金定投的起购金额
    public Map<String,Object> getFundAutoInvestMinVal(@Param("inner_code") String inner_code);

    // 基金费率
    public List<Map<String,Object>> getFundChagRateInfo(@Param("fund_code") String fund_code);

    // 货基和理财型基金的万份收益变化
    public List<FundUnitNet> getUnitListByFundCode(
            @Param("fund_code") String fund_code, @Param("month") String month);
    // 货基和理财型基金的七日年化
    public List<FundUnitNet> getAccumListByFundCode(
            @Param("fund_code") String fund_code, @Param("month") String month);
    // 权益类基金的单位净值变化
    public List<FundUnitNet> getUnitnetListByFundCode(
            @Param("fund_code") String fund_code, @Param("month") String month);
    // 权益类基金收益率变化
    public List<Map<String,Object>> getFundNavCalcList(
            @Param("inner_code") String inner_code, @Param("month") String month);
    // 同类基金排名走势，指标：近3月涨幅,数据导入与维护
    public List<FundRankInfo> getRankHistoryData(@Param("fund_type") String fund_type,
                                                 @Param("start_date") String start_date,
                                                 @Param("end_date") String end_date);
    // 同类基金排名走势，指标：近3月涨幅,数据导入与维护(货基和理财)
    public List<FundRankInfo> getRankHistoryDataOfCoin(@Param("fund_type") String fund_type,
                                                       @Param("start_date") String start_date,
                                                       @Param("end_date") String end_date);
    // 往同类排名表插入信息
    public void addFundRankInfo(FundRankInfo rankInfo);

    // 同类基金推荐
    public List<Map<String,Object>> getKindFundRecommendList(@Param("fund_code") String fund_code,
                                                             @Param("fund_type") String fund_type);
    // 获取基金的净值或者七日年化信息
    public FundPosition getFundNetInfo(@Param("fund_code") String fund_code);

    // 基金持仓详情页------------------------------------
    // 获取持有基金的未支付收益（结转收益）
    public String getCarryProfit(Map<String, Object> map);

    // 查找用户第一次购买指定基金的申请日期
    public String getFirstBuyDate(@Param("transactionaccountid") String transactionaccountid,
                                  @Param("fundcode") String fundcode);

    // 用户持仓基金的净值变化
    public List<Map<String,Object>> getUnitnetListOfUser(
            @Param("inner_code") String inner_code,
            @Param("month") String month,
            @Param("firstBuyDate") String firstBuyDate);
    // 获取基金的主题信息
    public String getFundSubject(@Param("fund_code") String fund_code);

    // 获取基金的日申购累计金额
    public Map<String,Object> getDayAccumMoney(@Param("inner_code") String inner_code);

    // 企业理财首页基金推荐（代销可购买七日年化排序）
    public List<FundDetail> getCurrencyRecommendList(@Param("size") int size);

    // 企业理财首页基金推荐（固定可购买七日年化排序）
    public List<FundDetail> getFixCurrencyRecommendList(@Param("array") String[] moneyFundList, @Param("size") int size);

    // 基金搜索
    public List<FundDetail> getSearchFundList(@Param("key") String key);

    // 获取某一类型七日年化最高的理财型基金
    public FundDetail getMaxFinancialFund(@Param("closetype") String closetype);
}
