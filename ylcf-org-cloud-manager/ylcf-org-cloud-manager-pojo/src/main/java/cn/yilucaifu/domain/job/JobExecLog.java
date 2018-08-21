package cn.yilucaifu.domain.job;

public class JobExecLog {
    private Integer id;
    private String exec_method;
    private String exec_time;
    private String exec_end_time;
    private Integer isauto;
    private String job_msg;
    private Integer job_info;
    private String remark;
    private Integer issuccess;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExec_method() {
        return exec_method;
    }

    public void setExec_method(String exec_method) {
        this.exec_method = exec_method;
    }

    public String getExec_time() {
        return exec_time;
    }

    public void setExec_time(String exec_time) {
        this.exec_time = exec_time;
    }

    public Integer getIsauto() {
        return isauto;
    }

    public void setIsauto(Integer isauto) {
        this.isauto = isauto;
    }

    public String getJob_msg() {
        return job_msg;
    }

    public void setJob_msg(String job_msg) {
        this.job_msg = job_msg;
    }

    public Integer getJob_info() {
        return job_info;
    }

    public void setJob_info(Integer job_info) {
        this.job_info = job_info;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getExec_end_time() {
        return exec_end_time;
    }

    public void setExec_end_time(String exec_end_time) {
        this.exec_end_time = exec_end_time;
    }

    public Integer getIssuccess() {
        return issuccess;
    }

    public void setIssuccess(Integer issuccess) {
        this.issuccess = issuccess;
    }

    @Override
    public String toString() {
        return "JobExecLog{" +
                "id=" + id +
                ", exec_method='" + exec_method + '\'' +
                ", exec_time='" + exec_time + '\'' +
                ", isauto=" + isauto +
                ", job_msg='" + job_msg + '\'' +
                ", job_info=" + job_info +
                ", remark='" + remark + '\'' +
                '}';
    }
}
