package cn.yilucaifu.mapper.persistence_ylcf.job;

import cn.yilucaifu.domain.job.JobExecInfo;
import cn.yilucaifu.domain.job.JobExecLog;
import cn.yilucaifu.domain.job.JobInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JobExecLogDao {
    int insert(@Param("pojo") JobExecLog pojo);

    int updateExceptionMsg(@Param("pojo") JobExecLog pojo);

    /**
     * 查询一天一次的任务
     * @param date
     * @return
     */
    JobExecInfo selectByDate(@Param("date") String date);

    /**
     * 查询一天一次的任务记录(排除每周一次的)
     * @param date
     * @return
     */
    List<JobExecLog> selectLogByDateMethod(@Param("date") String date, @Param("exec_method") String exec_method);

    Integer selectTimes(Integer times);

    int updateInfoByMethod(@Param("modifytime") String modifytime, @Param("exec_method") String exec_method);

    List<JobInfo> selectNotExecOne(@Param("date") String date);

    JobInfo selectInfoByMethod(@Param("exec_method") String exec_method);

    List<JobInfo> selectJobOne(@Param("predate") String predate, @Param("date") String date);

    List<JobInfo> selectJobTwo(@Param("date") String date);

    List<JobInfo> selectJobThree(@Param("date") String date);

}
