package cn.yilucaifu.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class YlcfResult {

    // 定义jackson对象
    private static final ObjectMapper MAPPER = new ObjectMapper();

    // 响应业务状态
    private Integer stat;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;

    public static YlcfResult build(Integer stat, String msg, Object data) {
        return new YlcfResult(stat, msg, data);
    }

    public static YlcfResult ok(Object data) {
        return new YlcfResult(data);
    }
    public static YlcfResult ok(String msg, Object data) {
        return new YlcfResult(1, msg, data);
    }

    public static YlcfResult ok() {
        return new YlcfResult(null);
    }

    public YlcfResult() {

    }

    public static YlcfResult build(Integer stat, String msg) {
        return new YlcfResult(stat, msg, null);
    }

    public YlcfResult(Integer stat, String msg, Object data) {
        this.stat = stat;
        this.msg = msg;
        this.data = data;
    }

    public YlcfResult(Object data) {
        this.stat = 1;
        this.msg = "OK";
        this.data = data;
    }

    public static YlcfResult fail(String msg) {
        return new YlcfResult(0, msg, null);
    }

    public static YlcfResult fail(String msg, Object data) {
        return new YlcfResult(0, msg, data);
    }

//    public Boolean isOK() {
//        return this.stat == 200;
//    }


    public Integer getStat() {
        return stat;
    }

    public void setStat(Integer stat) {
        this.stat = stat;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 将json结果集转化为YlcfResult对象
     *
     * @param jsonData json数据
     * @param clazz    YlcfResult中的object类型
     * @return
     */
    public static YlcfResult formatToPojo(String jsonData, Class<?> clazz) {
        try {
            if (clazz == null) {
                return MAPPER.readValue(jsonData, YlcfResult.class);
            }
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (clazz != null) {
                if (data.isObject()) {
                    obj = MAPPER.readValue(data.traverse(), clazz);
                } else if (data.isTextual()) {
                    obj = MAPPER.readValue(data.asText(), clazz);
                }
            }
            return build(jsonNode.get("stat").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 没有object对象的转化
     *
     * @param json
     * @return
     */
    public static YlcfResult format(String json) {
        try {
            return MAPPER.readValue(json, YlcfResult.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Object是集合转化
     *
     * @param jsonData json数据
     * @param clazz    集合中的类型
     * @return
     */
    public static YlcfResult formatToList(String jsonData, Class<?> clazz) {
        try {
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (data.isArray() && data.size() > 0) {
                obj = MAPPER.readValue(data.traverse(),
                        MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
            }
            return build(jsonNode.get("stat").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }

}
