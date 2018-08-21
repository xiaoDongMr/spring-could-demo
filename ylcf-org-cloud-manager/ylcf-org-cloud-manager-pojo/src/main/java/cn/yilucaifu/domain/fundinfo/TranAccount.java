package cn.yilucaifu.domain.fundinfo;

import cn.yilucaifu.utils.hs.HsConstants;
import org.apache.commons.lang.xwork.StringUtils;

import java.io.Serializable;
import java.util.Date;

/**
 * filename：cn.yilucaifu.domain.pingan.TranAccount.java
 *
 * @author: zhangyong
 * @time: 2013-10-9下午2:51:22 基金账户
 */

public class TranAccount implements Serializable {
	private static final long serialVersionUID = -4817793918970419442L;

	private String allot_no;// allot_no 申请编号

	private String client_id;// client_id 客户编号

	private String apply_date;// apply_date 申请日期

	private int investor_type = 0;// investor_type 投资者类型

	private int is_convertible = 0;// is_convertible 普通投资者是否可转换专业投资者 1-可转换 // 2-不可转换

	private String email;//邮箱

	private String profession;//职业

	private  String tax_resident_identity_type;// 税收居民身份类型：1-仅为中国税收居民；2-仅为非居民；3-即是中国税收居民又是其他国家（地区）税收居民

	private String xjbao_ui; // 现金宝对应的长交易账号

	/**
	 * 主键
	 */
	private Integer account_id;

	private int user_id;
	/**
	 * 投资人姓名
	 */
	private String investorname;
	/**
	 * 身份证号
	 */
	private String identity;
	/**
	 *
	 * 银行卡号
	 */
	private String depositacct;
	/**
	 * 银行账号
	 */
	private String bankbook;
	/**
	 * 手机号码
	 */
	private String mobiletelno;
	/**
	 * 邮政编码
	 */
	private String postcode;
	/**
	 * 通讯地址
	 */
	private String address;

	/**
	 * 性别
	 */
	private Integer sex;

	/**
	 * 开卡网点
	 */
	private String bankno;

	/**
	 * 41 客户联网行号 NETLINENO 12 右补空格 记录数据库
	 */
	public String netlineno;

	/**
	 * 签约成功后获得的基金账号
	 */
	/**
	 * 23 新客户姓名 NEW_INVESTORNAME 60 右补空格 修改重要信息时为必填项
	 */
	private String new_investorname;

	/**
	 * 25 新证件号码 NEW_BK_IDENTITY_NO/NEW_CERTIFICATENO 30 右补空格 修改重要信息时为必填项
	 */
	private String new_bk_identity_no;
	/**
	 * 重要资料修改标志 IMPORTANTFLAG 1 右补空格 必输 0：普通资料，1：重要资料
	 */
	private Integer importantflag;

	/**
	 * 扣款金额
	 */
	private String amount;
	/**
	 * 开户行名称
	 */
	private String bankname;
	// private String taaccountid;

	/**
	 * 43 UI UI 12 右补空格 记录数据库
	 */
	public String ui;
	/**
	 * 风险等级 RISKLEVEL 1 右补空格 1、2、3、4、5五个等级 // 1-保守型 // 2-稳健型 // 3-平衡型 // 4-成长型
	 * // 5-进取型
	 */
	public int risklevel = 0;
	/**
	 * 监督系统客户号 查
	 */
	public String ci;

	/**
	 * 卡片是否已激活1 激活 0未激活
	 */
	public int isactive = 0;
	/**
	 * 是否签约成功 1 成功 0未成功
	 */
	public int isSign = 0;
	/**
	 * 卡片是否已验卡1 验卡 0未验卡
	 */
	public int isVailcard = 0;

	private String createtime;

	/**
	 * 开户验卡时间
	 */
	private String valiCardDate;
	/**
	 * 开户时间
	 */
	private String signtime;

	private int valiCount = 0;// 银行卡验证次数

	private String provincecode;// 省份代码

	private String citycode;// 城市代码

	private int valiType;// 0,小额扣款验证;1,快捷支付验证,2银联方式

	private int openAccountType;//当前账户对应的银行卡支持哪种方式 0,小额扣款,1,短信验证方式,2，两种都支持

	public Date lastRiskTime;

	public String showvailtype; // 用户是否弹推荐大额升级框 1：提示 0 ：不提示

	private int isUnion;// 1,为银联,0,为其他

	private String xuanji_ui;//璇玑智投交易账号

	public String getXuanji_ui() {
		return xuanji_ui;
	}

	public void setXuanji_ui(String xuanji_ui) {
		this.xuanji_ui = xuanji_ui;
	}

	public String getShowvailtype() {
		return showvailtype;
	}

	public void setShowvailtype(String showvailtype) {
		this.showvailtype = showvailtype;
	}

	/**
	 * 监督系统客户号 查
	 *
	 * @return
	 */
	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public Integer getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Integer account_id) {
		this.account_id = account_id;
	}

	public int getUser_id() {

		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	/**
	 * 投资人姓名
	 *
	 * @return
	 */
	public String getInvestorname() {
		return investorname;
	}

	/**
	 * 投资人姓名
	 *
	 * @param investorname
	 */
	public void setInvestorname(String investorname) {
		this.investorname = investorname;
	}

	/**
	 * 身份证号
	 *
	 * @return
	 */
	public String getIdentity() {

		return identity;
	}

	/**
	 * 身份证号
	 *
	 * @param identity
	 */
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	/**
	 * 银行卡号
	 *
	 * @return
	 */
	public String getDepositacct() {

		return depositacct;
	}

	/**
	 * 银行卡号
	 *
	 * @param depositacct
	 */
	public void setDepositacct(String depositacct) {
		this.depositacct = depositacct;
	}

	/**
	 * 返回银行账号
	 *
	 * @return
	 */
	public String getBankbook() {

		return bankbook;
	}

	/**
	 * 银行账号
	 *
	 * @param bankbook
	 */
	public void setBankbook(String bankbook) {
		this.bankbook = bankbook;
	}

	/**
	 * 手机号
	 *
	 * @return
	 */

	public String getMobiletelno() {

		return mobiletelno;
	}

	/**
	 * 手机号
	 *
	 * @param mobiletelno
	 */
	public void setMobiletelno(String mobiletelno) {
		this.mobiletelno = mobiletelno;
	}

	/**
	 * 邮政编码
	 *
	 * @return
	 */
	public String getPostcode() {

		return postcode;
	}

	/**
	 * 邮政编码
	 *
	 * @param postcode
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	/**
	 * 通讯地址
	 *
	 * @return
	 */
	public String getAddress() {
		if(StringUtils.isEmpty(address)){
			return "";
		}
		return address;
	}

	/**
	 * 通讯地址
	 *
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 *
	 * @return
	 */
	public Integer getSex() {
		return sex;
	}

	/**
	 *
	 * @param sex
	 */

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	/**
	 * 开卡网点
	 *
	 * @return
	 */
	public String getBankno() {
		return bankno;
	}

	/**
	 * 开卡网点
	 *
	 * @param bankno
	 */
	public void setBankno(String bankno) {
		this.bankno = bankno;
	}

	/**
	 * 41 客户联网行号 NETLINENO 12 右补空格 记录数据库
	 *
	 * @return
	 */
	public String getNetlineno() {
		return netlineno;
	}

	/**
	 * 41 客户联网行号 NETLINENO 12 右补空格 记录数据库
	 *
	 * @param netlineno
	 */
	public void setNetlineno(String netlineno) {
		this.netlineno = netlineno;
	}

	// /**
	// * 签约成功后获得的基金账号
	// *
	// * @return
	// */

	// public String getTaaccountid() {
	// return taaccountid;
	// }
	//
	// public void setTaaccountid(String taaccountid) {
	// this.taaccountid = taaccountid;
	// }

	/**
	 * 23 新客户姓名 NEW_INVESTORNAME 60 右补空格 修改重要信息时为必填项
	 *
	 * @return
	 */
	public String getNew_investorname() {
		return new_investorname;
	}

	public void setNew_investorname(String new_investorname) {
		this.new_investorname = new_investorname;
	}

	/**
	 * 新证件号码 NEW_BK_IDENTITY_NO/NEW_CERTIFICATENO 30 右补空格 修改重要信息时为必填项
	 *
	 * @return
	 */
	public String getNew_bk_identity_no() {
		return new_bk_identity_no;
	}

	public void setNew_bk_identity_no(String new_bk_identity_no) {
		this.new_bk_identity_no = new_bk_identity_no;
	}

	/**
	 * 重要资料修改标志 IMPORTANTFLAG 1 右补空格 必输 0：普通资料，1：重要资料
	 *
	 * @return
	 */
	public Integer getImportantflag() {
		return importantflag;
	}

	public void setImportantflag(Integer importantflag) {
		this.importantflag = importantflag;
	}

	/**
	 * 43 UI UI 12 右补空格 记录数据库
	 *
	 * @return
	 */
	public String getUi() {
		if(StringUtils.isEmpty(ui)){
			return "";
		}
		return ui;
	}

	public void setUi(String ui) {
		this.ui = ui;
	}

	/**
	 * 风险等级
	 *
	 * @return
	 */
	public int getRisklevel() {
		return risklevel;
	}

	public void setRisklevel(int risklevel) {
		this.risklevel = risklevel;
	}

	public int getIsactive() {
		return isactive;
	}

	public void setIsactive(int isactive) {
		this.isactive = isactive;
	}

	public int getIsVailcard() {
		return isVailcard;
	}

	public void setIsVailcard(int isVailcard) {
		this.isVailcard = isVailcard;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getRiskleveldesc() {
		return HsConstants.risklevelMap.get("" + risklevel);
	}

	public void setIsSign(int isSign) {
		this.isSign = isSign;
	}

	public int getIsSign() {
		return isSign;
	}

	public void setValiCardDate(String valiCardDate) {
		this.valiCardDate = valiCardDate;
	}

	public String getValiCardDate() {
		return valiCardDate;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	/**
	 * 获得银行卡名称
	 *
	 * @return
	 */
	public String getBanknoname() {
		return HsConstants.bktypeNameMap.get("" + bankno);
	}

	public String getSigntime() {
		return signtime;
	}

	public void setSigntime(String signtime) {
		this.signtime = signtime;
	}

	public int getValiCount() {
		return valiCount;
	}

	public void setValiCount(int valiCount) {
		this.valiCount = valiCount;
	}

	public String getProvincecode() {
		return provincecode;
	}

	public void setProvincecode(String provincecode) {
		this.provincecode = provincecode;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public int getValiType() {
		return valiType;
	}

	public void setValiType(int valiType) {
		this.valiType = valiType;
	}

	public int getOpenAccountType() {
		return openAccountType;
	}

	public void setOpenAccountType(int openAccountType) {
		this.openAccountType = openAccountType;
	}

	public Date getLastRiskTime() {
		return lastRiskTime;
	}

	public void setLastRiskTime(Date lastRiskTime) {
		this.lastRiskTime = lastRiskTime;
	}

	public int getIsUnion() {
		return isUnion;
	}

	public void setIsUnion(int isUnion) {
		this.isUnion = isUnion;
	}
	public String getAllot_no() {
		return allot_no;
	}

	public void setAllot_no(String allot_no) {
		this.allot_no = allot_no;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public String getApply_date() {
		return apply_date;
	}

	public void setApply_date(String apply_date) {
		this.apply_date = apply_date;
	}


	public String getEmail() {
		if(StringUtils.isEmpty(email)){
			return "";
		}
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfession() {
		if(StringUtils.isEmpty(profession)){
			return "";
		}
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}



	public int getInvestor_type() {
		return investor_type;
	}

	public void setInvestor_type(int investor_type) {
		this.investor_type = investor_type;
	}

	public int getIs_convertible() {
		return is_convertible;
	}

	public void setIs_convertible(int is_convertible) {
		this.is_convertible = is_convertible;
	}

	public String getTax_resident_identity_type() {
		return tax_resident_identity_type;
	}

	public void setTax_resident_identity_type(String tax_resident_identity_type) {
		this.tax_resident_identity_type = tax_resident_identity_type;
	}

	public String getXjbao_ui() {
		return xjbao_ui;
	}

	public void setXjbao_ui(String xjbao_ui) {
		this.xjbao_ui = xjbao_ui;
	}

	@Override
	public String toString() {
		return "TranAccount [account_id=" + account_id + ", user_id=" + user_id
				+ ", investorname=" + investorname + ", identity=" + identity
				+ ", depositacct=" + depositacct + ", bankbook=" + bankbook
				+ ", mobiletelno=" + mobiletelno + ", postcode=" + postcode
				+ ", address=" + address + ", sex=" + sex + ", bankno="
				+ bankno + ", netlineno=" + netlineno + ", new_investorname="
				+ new_investorname + ", new_bk_identity_no="
				+ new_bk_identity_no + ", importantflag=" + importantflag
				+ ", amount=" + amount + ", bankname=" + bankname + ", ui="
				+ ui + ", risklevel=" + risklevel + ", ci=" + ci
				+ ", isactive=" + isactive + ", isSign=" + isSign
				+ ", isVailcard=" + isVailcard + ", createtime=" + createtime
				+ ", valiCardDate=" + valiCardDate + ", signtime=" + signtime
				+ ", valiCount=" + valiCount + ", provincecode=" + provincecode
				+ ", citycode=" + citycode + ", valiType=" + valiType
				+ ", openAccountType=" + openAccountType + ", lastRiskTime="
				+ lastRiskTime + ", showvailtype=" + showvailtype
				+ ", isUnion=" + isUnion + "]";
	}


}