package cn.yilucaifu.mapper.persistence;


import cn.yilucaifu.domain.fundinfo.YiluBao;

import java.util.List;

public interface YiluBaoDao {

	public List<YiluBao> selectYiluBaoList();
	
	public YiluBao selectYiluBaoById(int id);
	
	public void addYiluBao(YiluBao yiluBao);
	
	public void updateYiluBao(YiluBao yiluBao);
	
	public void deleteYiluBaoById(int id);
	
	public String selectFundNameByFundCode(String fundCode);
	
	public YiluBao findYiluBaoByFundCode(String fundCode);
	
	public String findSupportAppointmentFund();
	
	public List<YiluBao> findYilubaoList();
}
