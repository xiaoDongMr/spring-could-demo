package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.Parameter;
import cn.yilucaifu.domain.ParameterExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ParameterDao {
    long countByExample(ParameterExample example);

    int deleteByExample(ParameterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Parameter record);

    int insertSelective(Parameter record);

    List<Parameter> selectByExample(ParameterExample example);

    Parameter selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Parameter record, @Param("example") ParameterExample example);

    int updateByExample(@Param("record") Parameter record, @Param("example") ParameterExample example);

    int updateByPrimaryKeySelective(Parameter record);

    int updateByPrimaryKey(Parameter record);


    /*myMapper*/

    List<Parameter> getParameterByAll();

    //获取注册验证码
    Parameter getParameterByValueDate(
            @Param("paramName") String paramName,
            @Param("paramValue") String paramValue,
            @Param("paramFlag") String paramFlag,
            @Param("paramDate") String paramDate);

    int updateVailCount(@Param("paramName") String paramName,
                        @Param("paramFlag") String paramFlag,
                        @Param("paramDate") String paramDate);

    /**
     * 将验证码置为失效
     * @param paramName
     * @param paramFlag
     */
    int deleteParameter(@Param("paramName") String paramName,
                        @Param("paramFlag") String paramFlag);


    int findParamCount(@Param("paramName") String paramName,
                       @Param("paramFlag") String paramFlag,
                       @Param("paramDate") String paramDate);


    /**
     * 添加
     *
     * @param parameter
     */
    int saveParameter(Parameter parameter);


    int findParamCountByFromip(@Param("fromip") String fromip,
                               @Param("paramDate") String paramDate);


}