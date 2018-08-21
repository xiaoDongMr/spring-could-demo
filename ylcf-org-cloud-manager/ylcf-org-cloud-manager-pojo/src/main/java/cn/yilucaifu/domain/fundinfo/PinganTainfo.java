package cn.yilucaifu.domain.fundinfo;

import java.io.Serializable;

/**
 * filename：cn.yilucaifu.domain.pingan.PinganTainfo.java
 * 
 * @author: zhangyong
 * @time: 2013-10-19下午4:14:25
 */

public class PinganTainfo implements Serializable {
	private static final long serialVersionUID = -8696572867698071442L;
	private Integer id;
	private String filetime;
	private String createtime;
	private String distributorcode;
	private String tano;
	private String taname;
	private String tel;
	private String txrxmd;
	private String tast;
	private String tatp;
	private String recvdirectory;
	private String senddirectory;
	private String importflag;
	private String ta_ver;
	private String registeraddress;
	private String officeaddress;
	private String linkman;
	private String principal;

	// 新增字段
	private String managercode;
	private String business_flag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFiletime() {
		return filetime;
	}

	public void setFiletime(String filetime) {
		this.filetime = filetime;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getDistributorcode() {
		return distributorcode;
	}

	public void setDistributorcode(String distributorcode) {
		this.distributorcode = distributorcode;
	}

	public String getTano() {
		return tano;
	}

	public void setTano(String tano) {
		this.tano = tano;
	}

	public String getTaname() {
		return taname;
	}

	public void setTaname(String taname) {
		this.taname = taname;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getTxrxmd() {
		return txrxmd;
	}

	public void setTxrxmd(String txrxmd) {
		this.txrxmd = txrxmd;
	}

	public String getTast() {
		return tast;
	}

	public void setTast(String tast) {
		this.tast = tast;
	}

	public String getTatp() {
		return tatp;
	}

	public void setTatp(String tatp) {
		this.tatp = tatp;
	}

	public String getRecvdirectory() {
		return recvdirectory;
	}

	public void setRecvdirectory(String recvdirectory) {
		this.recvdirectory = recvdirectory;
	}

	public String getSenddirectory() {
		return senddirectory;
	}

	public void setSenddirectory(String senddirectory) {
		this.senddirectory = senddirectory;
	}

	public String getImportflag() {
		return importflag;
	}

	public void setImportflag(String importflag) {
		this.importflag = importflag;
	}

	public String getTa_ver() {
		return ta_ver;
	}

	public void setTa_ver(String ta_ver) {
		this.ta_ver = ta_ver;
	}

	public String getRegisteraddress() {
		return registeraddress;
	}

	public void setRegisteraddress(String registeraddress) {
		this.registeraddress = registeraddress;
	}

	public String getOfficeaddress() {
		return officeaddress;
	}

	public void setOfficeaddress(String officeaddress) {
		this.officeaddress = officeaddress;
	}

	public String getLinkman() {
		return linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getManagercode() {
		return managercode;
	}

	public void setManagercode(String managercode) {
		this.managercode = managercode;
	}

	public String getBusiness_flag() {
		return business_flag;
	}

	public void setBusiness_flag(String business_flag) {
		this.business_flag = business_flag;
	}

}
