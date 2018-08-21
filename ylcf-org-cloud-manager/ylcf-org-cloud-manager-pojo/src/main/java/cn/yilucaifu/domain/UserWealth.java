package cn.yilucaifu.domain;

public class UserWealth {
    private Integer id;

    private Integer userId;

    private String p2pDeposit;

    private String p2pnavDeposit;

    private String fundDeposit;

    private String p2pEarnings;

    private String p2pnavEarnings;

    private String fundEarnings;

    private String createtime;

    private String filedate;

    private String p2pNewEarnings;

    private String p2pnavNewEarnings;

    private String fundNewEarnings;

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

    public String getP2pDeposit() {
        return p2pDeposit;
    }

    public void setP2pDeposit(String p2pDeposit) {
        this.p2pDeposit = p2pDeposit == null ? null : p2pDeposit.trim();
    }

    public String getP2pnavDeposit() {
        return p2pnavDeposit;
    }

    public void setP2pnavDeposit(String p2pnavDeposit) {
        this.p2pnavDeposit = p2pnavDeposit == null ? null : p2pnavDeposit.trim();
    }

    public String getFundDeposit() {
        return fundDeposit;
    }

    public void setFundDeposit(String fundDeposit) {
        this.fundDeposit = fundDeposit == null ? null : fundDeposit.trim();
    }

    public String getP2pEarnings() {
        return p2pEarnings;
    }

    public void setP2pEarnings(String p2pEarnings) {
        this.p2pEarnings = p2pEarnings == null ? null : p2pEarnings.trim();
    }

    public String getP2pnavEarnings() {
        return p2pnavEarnings;
    }

    public void setP2pnavEarnings(String p2pnavEarnings) {
        this.p2pnavEarnings = p2pnavEarnings == null ? null : p2pnavEarnings.trim();
    }

    public String getFundEarnings() {
        return fundEarnings;
    }

    public void setFundEarnings(String fundEarnings) {
        this.fundEarnings = fundEarnings == null ? null : fundEarnings.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getFiledate() {
        return filedate;
    }

    public void setFiledate(String filedate) {
        this.filedate = filedate == null ? null : filedate.trim();
    }

    public String getP2pNewEarnings() {
        return p2pNewEarnings;
    }

    public void setP2pNewEarnings(String p2pNewEarnings) {
        this.p2pNewEarnings = p2pNewEarnings == null ? null : p2pNewEarnings.trim();
    }

    public String getP2pnavNewEarnings() {
        return p2pnavNewEarnings;
    }

    public void setP2pnavNewEarnings(String p2pnavNewEarnings) {
        this.p2pnavNewEarnings = p2pnavNewEarnings == null ? null : p2pnavNewEarnings.trim();
    }

    public String getFundNewEarnings() {
        return fundNewEarnings;
    }

    public void setFundNewEarnings(String fundNewEarnings) {
        this.fundNewEarnings = fundNewEarnings == null ? null : fundNewEarnings.trim();
    }
}