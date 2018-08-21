package cn.yilucaifu.domain;

import java.util.Date;

public class UserInfo {
    private Integer id;

    private Integer userId;

    private String businessLicenseFront;

    private String businessLicenseVerso;

    private String companyAccountCard;

    private String identityCard;

    private String companyEntrustBook;

    private String manIdentity;

    private String elseAccountCard;

    private String qfiiCard;

    private String egalperson;

    private String egalpersoncertno;

    private String socialcreditcode;

    private String expiresend;

    private String certorganization;

    private String contactoraddress;

    private String taxregisterno;

    private String businesslicenseno;

    private Integer auditstatus;

    private Integer auditqfii;

    private String audittime;

    private String auditqfiitime;

    private String auditstatusfailreason;

    private String auditqfiifailreason;

    private Byte merchantRegister;

    private Date merchantRegisterTime;

    private Byte merchantAuth;

    private Date merchantAuthTime;

    private Byte merchantOpening;

    private Date merchantOpeningTime;

    private Byte fundOpening;

    private Date fundOpeningTime;

    private String merchantFailReason;

    private String createtime;

    private String hsApiData;

    private String fundApiData;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getBusinessLicenseFront() {
        return businessLicenseFront;
    }

    public void setBusinessLicenseFront(String businessLicenseFront) {
        this.businessLicenseFront = businessLicenseFront == null ? null : businessLicenseFront.trim();
    }

    public String getBusinessLicenseVerso() {
        return businessLicenseVerso;
    }

    public void setBusinessLicenseVerso(String businessLicenseVerso) {
        this.businessLicenseVerso = businessLicenseVerso == null ? null : businessLicenseVerso.trim();
    }

    public String getCompanyAccountCard() {
        return companyAccountCard;
    }

    public void setCompanyAccountCard(String companyAccountCard) {
        this.companyAccountCard = companyAccountCard == null ? null : companyAccountCard.trim();
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard == null ? null : identityCard.trim();
    }

    public String getCompanyEntrustBook() {
        return companyEntrustBook;
    }

    public void setCompanyEntrustBook(String companyEntrustBook) {
        this.companyEntrustBook = companyEntrustBook == null ? null : companyEntrustBook.trim();
    }

    public String getManIdentity() {
        return manIdentity;
    }

    public void setManIdentity(String manIdentity) {
        this.manIdentity = manIdentity == null ? null : manIdentity.trim();
    }

    public String getElseAccountCard() {
        return elseAccountCard;
    }

    public void setElseAccountCard(String elseAccountCard) {
        this.elseAccountCard = elseAccountCard == null ? null : elseAccountCard.trim();
    }

    public String getQfiiCard() {
        return qfiiCard;
    }

    public void setQfiiCard(String qfiiCard) {
        this.qfiiCard = qfiiCard == null ? null : qfiiCard.trim();
    }

    public String getEgalperson() {
        return egalperson;
    }

    public void setEgalperson(String egalperson) {
        this.egalperson = egalperson == null ? null : egalperson.trim();
    }

    public String getEgalpersoncertno() {
        return egalpersoncertno;
    }

    public void setEgalpersoncertno(String egalpersoncertno) {
        this.egalpersoncertno = egalpersoncertno == null ? null : egalpersoncertno.trim();
    }

    public String getSocialcreditcode() {
        return socialcreditcode;
    }

    public void setSocialcreditcode(String socialcreditcode) {
        this.socialcreditcode = socialcreditcode == null ? null : socialcreditcode.trim();
    }

    public String getExpiresend() {
        return expiresend;
    }

    public void setExpiresend(String expiresend) {
        this.expiresend = expiresend == null ? null : expiresend.trim();
    }

    public String getCertorganization() {
        return certorganization;
    }

    public void setCertorganization(String certorganization) {
        this.certorganization = certorganization == null ? null : certorganization.trim();
    }

    public String getContactoraddress() {
        return contactoraddress;
    }

    public void setContactoraddress(String contactoraddress) {
        this.contactoraddress = contactoraddress == null ? null : contactoraddress.trim();
    }

    public String getTaxregisterno() {
        return taxregisterno;
    }

    public void setTaxregisterno(String taxregisterno) {
        this.taxregisterno = taxregisterno == null ? null : taxregisterno.trim();
    }

    public String getBusinesslicenseno() {
        return businesslicenseno;
    }

    public void setBusinesslicenseno(String businesslicenseno) {
        this.businesslicenseno = businesslicenseno == null ? null : businesslicenseno.trim();
    }

    public Integer getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(Integer auditstatus) {
        this.auditstatus = auditstatus;
    }

    public Integer getAuditqfii() {
        return auditqfii;
    }

    public void setAuditqfii(Integer auditqfii) {
        this.auditqfii = auditqfii;
    }

    public String getAudittime() {
        return audittime;
    }

    public void setAudittime(String audittime) {
        this.audittime = audittime == null ? null : audittime.trim();
    }

    public String getAuditqfiitime() {
        return auditqfiitime;
    }

    public void setAuditqfiitime(String auditqfiitime) {
        this.auditqfiitime = auditqfiitime == null ? null : auditqfiitime.trim();
    }

    public String getAuditstatusfailreason() {
        return auditstatusfailreason;
    }

    public void setAuditstatusfailreason(String auditstatusfailreason) {
        this.auditstatusfailreason = auditstatusfailreason == null ? null : auditstatusfailreason.trim();
    }

    public String getAuditqfiifailreason() {
        return auditqfiifailreason;
    }

    public void setAuditqfiifailreason(String auditqfiifailreason) {
        this.auditqfiifailreason = auditqfiifailreason == null ? null : auditqfiifailreason.trim();
    }

    public Byte getMerchantRegister() {
        return merchantRegister;
    }

    public void setMerchantRegister(Byte merchantRegister) {
        this.merchantRegister = merchantRegister;
    }

    public Date getMerchantRegisterTime() {
        return merchantRegisterTime;
    }

    public void setMerchantRegisterTime(Date merchantRegisterTime) {
        this.merchantRegisterTime = merchantRegisterTime;
    }

    public Byte getMerchantAuth() {
        return merchantAuth;
    }

    public void setMerchantAuth(Byte merchantAuth) {
        this.merchantAuth = merchantAuth;
    }

    public Date getMerchantAuthTime() {
        return merchantAuthTime;
    }

    public void setMerchantAuthTime(Date merchantAuthTime) {
        this.merchantAuthTime = merchantAuthTime;
    }

    public Byte getMerchantOpening() {
        return merchantOpening;
    }

    public void setMerchantOpening(Byte merchantOpening) {
        this.merchantOpening = merchantOpening;
    }

    public Date getMerchantOpeningTime() {
        return merchantOpeningTime;
    }

    public void setMerchantOpeningTime(Date merchantOpeningTime) {
        this.merchantOpeningTime = merchantOpeningTime;
    }

    public Byte getFundOpening() {
        return fundOpening;
    }

    public void setFundOpening(Byte fundOpening) {
        this.fundOpening = fundOpening;
    }

    public Date getFundOpeningTime() {
        return fundOpeningTime;
    }

    public void setFundOpeningTime(Date fundOpeningTime) {
        this.fundOpeningTime = fundOpeningTime;
    }

    public String getMerchantFailReason() {
        return merchantFailReason;
    }

    public void setMerchantFailReason(String merchantFailReason) {
        this.merchantFailReason = merchantFailReason == null ? null : merchantFailReason.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getHsApiData() {
        return hsApiData;
    }

    public void setHsApiData(String hsApiData) {
        this.hsApiData = hsApiData == null ? null : hsApiData.trim();
    }

    public String getFundApiData() {
        return fundApiData;
    }

    public void setFundApiData(String fundApiData) {
        this.fundApiData = fundApiData == null ? null : fundApiData.trim();
    }
}