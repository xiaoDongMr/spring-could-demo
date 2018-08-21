package cn.yilucaifu.domain;

public class P2pAccount {
    private Integer id;

    private Integer userId;

    private String identityCode;

    private Integer investType;

    private String cardId;

    private String cardHolder;

    private String mediaId;

    private String colaccprov;

    private String colacccity;

    private String colaccarea;

    private String bankbrhname;

    private String bankno;

    private String netlineno;

    private String issign;

    private String retMsg;

    private Integer riskLevel;

    private String createtime;

    private String eAccount;

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

    public String getIdentityCode() {
        return identityCode;
    }

    public void setIdentityCode(String identityCode) {
        this.identityCode = identityCode == null ? null : identityCode.trim();
    }

    public Integer getInvestType() {
        return investType;
    }

    public void setInvestType(Integer investType) {
        this.investType = investType;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder == null ? null : cardHolder.trim();
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId == null ? null : mediaId.trim();
    }

    public String getColaccprov() {
        return colaccprov;
    }

    public void setColaccprov(String colaccprov) {
        this.colaccprov = colaccprov == null ? null : colaccprov.trim();
    }

    public String getColacccity() {
        return colacccity;
    }

    public void setColacccity(String colacccity) {
        this.colacccity = colacccity == null ? null : colacccity.trim();
    }

    public String getColaccarea() {
        return colaccarea;
    }

    public void setColaccarea(String colaccarea) {
        this.colaccarea = colaccarea == null ? null : colaccarea.trim();
    }

    public String getBankbrhname() {
        return bankbrhname;
    }

    public void setBankbrhname(String bankbrhname) {
        this.bankbrhname = bankbrhname == null ? null : bankbrhname.trim();
    }

    public String getBankno() {
        return bankno;
    }

    public void setBankno(String bankno) {
        this.bankno = bankno == null ? null : bankno.trim();
    }

    public String getNetlineno() {
        return netlineno;
    }

    public void setNetlineno(String netlineno) {
        this.netlineno = netlineno == null ? null : netlineno.trim();
    }

    public String getIssign() {
        return issign;
    }

    public void setIssign(String issign) {
        this.issign = issign == null ? null : issign.trim();
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg == null ? null : retMsg.trim();
    }

    public Integer getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String geteAccount() {
        return eAccount;
    }

    public void seteAccount(String eAccount) {
        this.eAccount = eAccount == null ? null : eAccount.trim();
    }

}