package cn.yilucaifu.domain;

public class UserVipInfo {
    private Integer id;

    private Integer userId;

    private String birthday;

    private Long wealthvalue;

    private String viplevel;

    private Integer advisorid;

    private String investmentanalysis;

    private String commentary;

    private String revenuebroadcast;

    private String createtime;

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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public Long getWealthvalue() {
        return wealthvalue;
    }

    public void setWealthvalue(Long wealthvalue) {
        this.wealthvalue = wealthvalue;
    }

    public String getViplevel() {
        return viplevel;
    }

    public void setViplevel(String viplevel) {
        this.viplevel = viplevel == null ? null : viplevel.trim();
    }

    public Integer getAdvisorid() {
        return advisorid;
    }

    public void setAdvisorid(Integer advisorid) {
        this.advisorid = advisorid;
    }

    public String getInvestmentanalysis() {
        return investmentanalysis;
    }

    public void setInvestmentanalysis(String investmentanalysis) {
        this.investmentanalysis = investmentanalysis == null ? null : investmentanalysis.trim();
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary == null ? null : commentary.trim();
    }

    public String getRevenuebroadcast() {
        return revenuebroadcast;
    }

    public void setRevenuebroadcast(String revenuebroadcast) {
        this.revenuebroadcast = revenuebroadcast == null ? null : revenuebroadcast.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }
}