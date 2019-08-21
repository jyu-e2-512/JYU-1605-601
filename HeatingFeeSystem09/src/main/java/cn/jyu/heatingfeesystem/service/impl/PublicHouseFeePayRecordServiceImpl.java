package cn.jyu.heatingfeesystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.jyu.heatingfeesystem.mapper.HomeFeePayRecordMapper;
import cn.jyu.heatingfeesystem.mapper.PublicHouseFeePayRecordMapper;
import cn.jyu.heatingfeesystem.model.HomeFeePayRecordModel;
import cn.jyu.heatingfeesystem.model.PublicHouseFeePayRecordModel;
import cn.jyu.heatingfeesystem.service.HomeFeePayRecordService;
import cn.jyu.heatingfeesystem.service.PublicHouseFeePayRecordService;
import lombok.Data;

/**
 *  公建缴费记录类的Service层接口：接口方法包括增加一条缴费记录、删除缴费记录、修改缴费记录、
 *  查询所有的缴费记录、通过编号查询缴费记录。
 * @author 王得志
 *
 */
@Service("PublicHouseFeePayRecordService")
@Data
public class PublicHouseFeePayRecordServiceImpl implements PublicHouseFeePayRecordService{
	
	private PublicHouseFeePayRecordMapper publicHouseFeePayRecordMapper;
	@Override
	public void insert(PublicHouseFeePayRecordModel publicHouseFeePayRecord) {
		publicHouseFeePayRecordMapper.insert(publicHouseFeePayRecord);
		
	}

	@Override
	public void delete(int recordNo) {
		publicHouseFeePayRecordMapper.delete(recordNo);
		
	}

	@Override
	public void update(PublicHouseFeePayRecordModel publicHouseFeePayRecord) {
		publicHouseFeePayRecordMapper.update(publicHouseFeePayRecord);
		
	}

	@Override
	public List<PublicHouseFeePayRecordModel> selectAll() {
		List<PublicHouseFeePayRecordModel> publicHouseFeePayRecord =publicHouseFeePayRecordMapper.selectAll();
		return publicHouseFeePayRecord;
	}

	@Override
	public PublicHouseFeePayRecordModel selectByTypeNo(int recordNo) {
		PublicHouseFeePayRecordModel publicHouseFeePayRecord =publicHouseFeePayRecordMapper.selectByTypeNo(recordNo);
		return publicHouseFeePayRecord;
	}
	
	
	
}