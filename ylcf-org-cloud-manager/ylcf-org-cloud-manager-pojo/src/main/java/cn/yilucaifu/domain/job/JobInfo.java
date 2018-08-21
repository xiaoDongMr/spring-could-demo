package cn.yilucaifu.domain.job;

public class JobInfo {
    private Integer id;
    private String name;
    private String exec_method;
    private String plan_exec_time;
    private String manual_exec_url;
    private Integer type;//暂时不用g
    private Integer timelen;//暂时不用
    private Integer iscontrol;
    private Integer times;
    private String def1;
    private String def2;
    private String def3;
    private String modifytime;
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExec_method() {
        return exec_method;
    }

    public void setExec_method(String exec_method) {
        this.exec_method = exec_method;
    }

    public String getPlan_exec_time() {
        return plan_exec_time;
    }

    public void setPlan_exec_time(String plan_exec_time) {
        this.plan_exec_time = plan_exec_time;
    }

    public String getManual_exec_url() {
        return manual_exec_url;
    }

    public void setManual_exec_url(String manual_exec_url) {
        this.manual_exec_url = manual_exec_url;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getTimelen() {
        return timelen;
    }

    public void setTimelen(Integer timelen) {
        this.timelen = timelen;
    }

    public Integer getIscontrol() {
        return iscontrol;
    }

    public void setIscontrol(Integer iscontrol) {
        this.iscontrol = iscontrol;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public String getDef1() {
        return def1;
    }

    public void setDef1(String def1) {
        this.def1 = def1;
    }

    public String getDef2() {
        return def2;
    }

    public void setDef2(String def2) {
        this.def2 = def2;
    }

    public String getDef3() {
        return def3;
    }

    public void setDef3(String def3) {
        this.def3 = def3;
    }

    public String getModifytime() {
        return modifytime;
    }

    public void setModifytime(String modifytime) {
        this.modifytime = modifytime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "JobInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", exec_method='" + exec_method + '\'' +
                ", plan_exec_time='" + plan_exec_time + '\'' +
                ", manual_exec_url='" + manual_exec_url + '\'' +
                ", type=" + type +
                ", timelen=" + timelen +
                ", iscontrol=" + iscontrol +
                ", times=" + times +
                ", def1='" + def1 + '\'' +
                ", def2='" + def2 + '\'' +
                ", def3='" + def3 + '\'' +
                '}';
    }
}
