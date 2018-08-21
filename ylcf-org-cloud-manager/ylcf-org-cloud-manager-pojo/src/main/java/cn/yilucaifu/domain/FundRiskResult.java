package cn.yilucaifu.domain;

public class FundRiskResult {
    private Integer id;

    private Integer userId;

    private Integer testClass;

    private String riskContent;

    private Integer riskLevel;

    private Double companyinfoScore;

    private Double financialScore;

    private Double knowledgeScore;

    private Double investTargetScore;

    private Double ristPreferenceScore;

    private Double totalScore;

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

    public Integer getTestClass() {
        return testClass;
    }

    public void setTestClass(Integer testClass) {
        this.testClass = testClass;
    }

    public String getRiskContent() {
        return riskContent;
    }

    public void setRiskContent(String riskContent) {
        this.riskContent = riskContent == null ? null : riskContent.trim();
    }

    public Integer getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
    }

    public Double getCompanyinfoScore() {
        return companyinfoScore;
    }

    public void setCompanyinfoScore(Double companyinfoScore) {
        this.companyinfoScore = companyinfoScore;
    }

    public Double getFinancialScore() {
        return financialScore;
    }

    public void setFinancialScore(Double financialScore) {
        this.financialScore = financialScore;
    }

    public Double getKnowledgeScore() {
        return knowledgeScore;
    }

    public void setKnowledgeScore(Double knowledgeScore) {
        this.knowledgeScore = knowledgeScore;
    }

    public Double getInvestTargetScore() {
        return investTargetScore;
    }

    public void setInvestTargetScore(Double investTargetScore) {
        this.investTargetScore = investTargetScore;
    }

    public Double getRistPreferenceScore() {
        return ristPreferenceScore;
    }

    public void setRistPreferenceScore(Double ristPreferenceScore) {
        this.ristPreferenceScore = ristPreferenceScore;
    }

    public Double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Double totalScore) {
        this.totalScore = totalScore;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

}