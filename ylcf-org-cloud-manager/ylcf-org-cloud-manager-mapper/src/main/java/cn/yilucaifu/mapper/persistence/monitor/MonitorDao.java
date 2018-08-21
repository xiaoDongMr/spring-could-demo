package cn.yilucaifu.mapper.persistence.monitor;

import java.util.Map;


/**
 * @author zhangpeng
 *
 */
public interface MonitorDao {
	public int getMonitorIptableByParam(Map<String, Object> map);
}
