package cn.jyu.heatingfeesystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.jyu.heatingfeesystem.mapper.HomeFeePayRecordMapper;
import cn.jyu.heatingfeesystem.model.HomeFeePayRecordModel;
import cn.jyu.heatingfeesystem.service.HomeFeePayRecordService;
import lombok.Data;

/**
 *  居民缴费记录类的Service层接口：接口方法包括增加一条缴费记录、删除缴费记录、修改缴费记录、
 *  查询所有的缴费记录、通过编号查询缴费记录。
 * @author 王得志
 *
 */

@Service("homeFeePayRecordService")
@Data
public class HomeFeePayRecordServiceImpl implements HomeFeePayRecordService{
	
	private HomeFeePayRecordMapper homeFeePayRecordMapper;
	@Override
	public void insert(HomeFeePayRecordModel homeFeePayRecord) {
		homeFeePayRecordMapper.insert(homeFeePayRecord);
		
	}

	@Override
	public void delete(int recordNo) {
		homeFeePayRecordMapper.delete(recordNo);
		
	}

	@Override
	public void update(HomeFeePayRecordModel homeFeePayRecord) {
		homeFeePayRecordMapper.update(homeFeePayRecord);
		
	}

	@Override
	public List<HomeFeePayRecordModel> selectAll() {
		List<HomeFeePayRecordModel> homeFeePayRecord = homeFeePayRecordMapper.selectAll();
		return homeFeePayRecord;
	}

	@Override
	public HomeFeePayRecordModel selectByTypeNo(int recordNo) {
		HomeFeePayRecordModel homeFeePayRecordModel=homeFeePayRecordMapper.selectByTypeNo(recordNo);
		return homeFeePayRecordModel;
	}
	
}