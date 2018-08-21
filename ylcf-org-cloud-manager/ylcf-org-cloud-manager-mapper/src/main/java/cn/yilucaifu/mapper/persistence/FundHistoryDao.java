package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.fundinfo.FundHistory;
import cn.yilucaifu.domain.fundinfo.FundPosition;
import cn.yilucaifu.domain.fundinfo.FundRoll;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface FundHistoryDao {

    // 根据交易账号查找只有一笔未确认订单的公募基金/一路钱包的信息
    public List<Map<String,Object>> getFirstBuySuccessHistoryList(Map<String, Object> param);

    // 保存基金交易信息
    public void saveFundHistory(FundHistory fundHistory);

    // 根据基金代码获取清算天数
    public Integer getFundCalDayByFundcode(@Param("fundcode") String fundcode);


    //根据交易账号查询每个人的持仓信息
    public List<Map<String,Object>> getFundHoldByUi(Map<String, Object> map);

    // 根据订单号和用户id查找交易记录
    public List<FundHistory> findFundHistoryByAppsheetserialno(
            @Param("appsheetserialno") String appsheetserialno,
            @Param("userid") int userid);

    // 定时任务查询-----------------------------
    // 查询每天的交易，并定时查询确认信息，更新确认状态
    public List<FundHistory> findEverydayTrades();

    // 更新基金交易信息
    public void updateFundHistory(FundHistory fundHistory);

    // 查找未确认订单
    public List<Map<String,Object>> findHistoryNoConfirm();

    // 定时更新 申购申请的交易状态
    public void updateApplystname(@Param("appsheetserialno") String appsheetserialno, @Param("applystname") String applystname);

    // 基金申认购、普通赎回确认短信
    public List<Map<String,Object>> getFundConfirmMsg();

    // 查询近三天是否有赎回、分红
    public List<FundHistory> getTradeConfirms();

    // 查询当天机构发起的交易(时间节点：下午16:00),单卡模式
    public List<FundHistory> getTodayTradeList(@Param("endTime") String endTime);

    // 基金持仓信息-----------------------------
    // 根据userid查找投资者在途总金额
    public String findTotalMoneyInTransit(@Param("userid") int userid,
                                          @Param("fundcode") String fundcode);

    // 根据交易账号、交易流水号、基金代码、业务种类、交易状态查找基金历史信息
    public List<FundHistory> getHistoryListOfParams(@Param("appsheetserialno") String appsheetserialno,
                                                    @Param("transactionaccountid") String transactionaccountid,
                                                    @Param("fundcode") String fundcode,
                                                    @Param("businesscode") String businesscode,
                                                    @Param("applystname") String applystname);
    // 获取单个基金的持仓信息
    public FundPosition getSingleFundHoldInfo(Map<String, Object> map);

    // 获取单个基金的资产变化（折线图）
    public List<Map<String,Object>> getSingleFundPropertyHis(Map<String, Object> map);

    // 获取单个基金的收益变化（折线图）
    public List<Map<String,Object>> getSingleFundYestDprofitHis(Map<String, Object> map);

    // 获取单个基金的收益列表(非货基)
    public List<Map<String,Object>> getSingleFundProfitList(Map<String, Object> map);

    // 获取单个基金的收益列表(货基)
    public List<Map<String,Object>> getSingleCoinProfitList(Map<String, Object> map);

    // 获取单个基金的交易记录
    public List<Map<String,Object>> getSingleFundTransactionHis(Map<String, Object> map);

    // 获取单个基金的资产列表
    public List<Map<String, Object>> getSingleFundPropertyList(Map<String, Object> map);

    // 增加用户基金买入卖出记录
    public int saveUserRollhis(FundRoll roll);

    // 查询fund_roll_history的记录
    public FundRoll findUniqueRoll(FundRoll roll);


    // 查询用户买入卖出记录（自2018-01-01开始）
    public List<FundRoll> getFundRollList(@Param("transactionaccountid") String transactionaccountid,
                                          @Param("transactioncfmdate") String transactioncfmdate);
    // 查询交易列表中的 交易账号(我的资产列表数据拉取)
    public List<String> getAllBuyUi(@Param("transactioncfmdate") String transactioncfmdate);

    // 净值变化（折线图红点显示）1：买入情况
    public List<Map<String,Object>> getRollInPoint(Map<String, Object> map);

    // 净值变化（折线图红点显示）1：卖出情况
    public List<Map<String,Object>> getRollOutPoint(Map<String, Object> map);

    // 净值变化（折线图红点显示）1：转出情况
    public List<Map<String,Object>> getVolOutPoint(Map<String, Object> map);

    // 净值变化（折线图红点显示）合并
    public List<Map<String,Object>> getAllRollPoint(Map<String, Object> map);

    // 我的单个基金的累计投资
    public String getFundAccInvestSum(@Param("transactionaccountid") String transactionaccountid,
                                      @Param("fundcode") String fundcode);
    // 我的单个基金的累计收益
    public String getFundAccYestDprofit(@Param("transactionaccountid") String transactionaccountid,
                                        @Param("fundcode") String fundcode);
    // 获取基金的交易记录
    public List<Map<String,Object>> getFundHistoryList(@Param("userid") int userid, @Param("start") int start,
                                                       @Param("pageSize") int pageSize);
    // 获取基金的交易记录含分红
    public List<Map<String,Object>> getOrgFundHistoryList(@Param("userid") int userid,
                                                          @Param("array") String[] businessCode,
                                                          @Param("start") int start,
                                                          @Param("pageSize") int pageSize);

}