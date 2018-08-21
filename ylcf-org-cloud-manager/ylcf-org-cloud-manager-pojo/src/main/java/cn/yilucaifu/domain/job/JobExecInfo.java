package cn.yilucaifu.domain.job;

public class JobExecInfo {
    private String name;
    private String exec_method;
    private String exec_time;
    private String job_msg;

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

    public String getExec_time() {
        return exec_time;
    }

    public void setExec_time(String exec_time) {
        this.exec_time = exec_time;
    }

    public String getJob_msg() {
        return job_msg;
    }

    public void setJob_msg(String job_msg) {
        this.job_msg = job_msg;
    }

    @Override
    public String toString() {
        return "JobExecInfo{" +
                "name='" + name + '\'' +
                ", exec_method='" + exec_method + '\'' +
                ", exec_time='" + exec_time + '\'' +
                ", job_msg='" + job_msg + '\'' +
                '}';
    }
}
