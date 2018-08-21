package cn.yilucaifu.mapper.persistence;

import cn.yilucaifu.domain.fundinfo.PinganBankInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * filename：cn.yilucaifu.mapper.persistence.pingan.PinganBankInfoDao.java
 * 
 * @author: zhangyong
 * @time: 2014-12-11下午2:59:46
 */

public interface PinganBankInfoDao {
	public List<PinganBankInfo> findBankInfoList();

	public List<PinganBankInfo> findBankInfoListByPaytype(
            @Param("paytype") int paytype);

	public PinganBankInfo findBankInfoByBankno(@Param("bankno") String bankno);

	public PinganBankInfo findBankInfoByBankname(
            @Param("bankname") String bankname);

	public PinganBankInfo findBankInfoByBanknameReg(
            @Param("bankname") String bankname);
	
	public int updatePinganBankById(PinganBankInfo pinganBankInfo);
	
}
