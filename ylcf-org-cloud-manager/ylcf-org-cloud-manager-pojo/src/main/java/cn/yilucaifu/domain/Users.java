package cn.yilucaifu.domain;

import java.io.Serializable;
import java.util.Date;

public class Users implements Serializable{
    private Integer userId;

    private String username;

    private String password;

    private Byte enabled;

    private String mobiletelno;

    private String email;

    private String companyName;

    private Integer companyBusiness;

    private Integer companyNum;

    private Integer companyType;

    private String companyProv;

    private String companyCity;

    private String companyArea;

    private String companyAdress;

    private Integer operator;

    private String linkman;

    private String sex;

    private String manJob;

    private String manPhone;

    private String manFax;

    private String manQq;

    private Date lastLogin;

    private Byte hsIsOpening;

    private Byte isopening;

    private String transpasswd;

    private String fundTranspasswd;

    private Boolean issetHsTranspasswd;

    private Integer operationStep;

    private Byte auditQfii;

    private Integer registfrom;

    private String ipadress;

    private Integer isbuyer;

    private Date firstbuydate;

    private String createtime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Byte getEnabled() {
        return enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    public String getMobiletelno() {
        return mobiletelno;
    }

    public void setMobiletelno(String mobiletelno) {
        this.mobiletelno = mobiletelno == null ? null : mobiletelno.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public Integer getCompanyBusiness() {
        return companyBusiness;
    }

    public void setCompanyBusiness(Integer companyBusiness) {
        this.companyBusiness = companyBusiness;
    }

    public Integer getCompanyNum() {
        return companyNum;
    }

    public void setCompanyNum(Integer companyNum) {
        this.companyNum = companyNum;
    }

    public Integer getCompanyType() {
        return companyType;
    }

    public void setCompanyType(Integer companyType) {
        this.companyType = companyType;
    }

    public String getCompanyProv() {
        return companyProv;
    }

    public void setCompanyProv(String companyProv) {
        this.companyProv = companyProv == null ? null : companyProv.trim();
    }

    public String getCompanyCity() {
        return companyCity;
    }

    public void setCompanyCity(String companyCity) {
        this.companyCity = companyCity == null ? null : companyCity.trim();
    }

    public String getCompanyArea() {
        return companyArea;
    }

    public void setCompanyArea(String companyArea) {
        this.companyArea = companyArea == null ? null : companyArea.trim();
    }

    public String getCompanyAdress() {
        return companyAdress;
    }

    public void setCompanyAdress(String companyAdress) {
        this.companyAdress = companyAdress == null ? null : companyAdress.trim();
    }

    public Integer getOperator() {
        return operator;
    }

    public void setOperator(Integer operator) {
        this.operator = operator;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getManJob() {
        return manJob;
    }

    public void setManJob(String manJob) {
        this.manJob = manJob == null ? null : manJob.trim();
    }

    public String getManPhone() {
        return manPhone;
    }

    public void setManPhone(String manPhone) {
        this.manPhone = manPhone == null ? null : manPhone.trim();
    }

    public String getManFax() {
        return manFax;
    }

    public void setManFax(String manFax) {
        this.manFax = manFax == null ? null : manFax.trim();
    }

    public String getManQq() {
        return manQq;
    }

    public void setManQq(String manQq) {
        this.manQq = manQq == null ? null : manQq.trim();
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Byte getHsIsOpening() {
        return hsIsOpening;
    }

    public void setHsIsOpening(Byte hsIsOpening) {
        this.hsIsOpening = hsIsOpening;
    }

    public Byte getIsopening() {
        return isopening;
    }

    public void setIsopening(Byte isopening) {
        this.isopening = isopening;
    }

    public String getTranspasswd() {
        return transpasswd;
    }

    public void setTranspasswd(String transpasswd) {
        this.transpasswd = transpasswd == null ? null : transpasswd.trim();
    }

    public String getFundTranspasswd() {
        return fundTranspasswd;
    }

    public void setFundTranspasswd(String fundTranspasswd) {
        this.fundTranspasswd = fundTranspasswd == null ? null : fundTranspasswd.trim();
    }

    public Boolean getIssetHsTranspasswd() {
        return issetHsTranspasswd;
    }

    public void setIssetHsTranspasswd(Boolean issetHsTranspasswd) {
        this.issetHsTranspasswd = issetHsTranspasswd;
    }

    public Integer getOperationStep() {
        return operationStep;
    }

    public void setOperationStep(Integer operationStep) {
        this.operationStep = operationStep;
    }

    public Byte getAuditQfii() {
        return auditQfii;
    }

    public void setAuditQfii(Byte auditQfii) {
        this.auditQfii = auditQfii;
    }

    public Integer getRegistfrom() {
        return registfrom;
    }

    public void setRegistfrom(Integer registfrom) {
        this.registfrom = registfrom;
    }

    public String getIpadress() {
        return ipadress;
    }

    public void setIpadress(String ipadress) {
        this.ipadress = ipadress == null ? null : ipadress.trim();
    }

    public Integer getIsbuyer() {
        return isbuyer;
    }

    public void setIsbuyer(Integer isbuyer) {
        this.isbuyer = isbuyer;
    }

    public Date getFirstbuydate() {
        return firstbuydate;
    }

    public void setFirstbuydate(Date firstbuydate) {
        this.firstbuydate = firstbuydate;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }
}