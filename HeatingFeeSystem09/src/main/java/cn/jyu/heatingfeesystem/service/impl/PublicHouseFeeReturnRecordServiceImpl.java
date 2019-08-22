package cn.jyu.heatingfeesystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jyu.heatingfeesystem.mapper.PublicHouseFeeReturnRecordMapper;
import cn.jyu.heatingfeesystem.model.PublicHouseFeeReturnRecordModel;
import cn.jyu.heatingfeesystem.service.PublicHouseFeeReturnRecordService;
import lombok.Data;

/**
 * FunctionService接口的实现类
 * @author 刁为进
 *
 */
@Service("publicHouseFeeReturnRecordService")
@Data
public class PublicHouseFeeReturnRecordServiceImpl implements PublicHouseFeeReturnRecordService
{
	@Autowired
	private PublicHouseFeeReturnRecordMapper publicHouseFeeReturnRecordMapper;
	@Override
	public void insert(PublicHouseFeeReturnRecordModel publicHouseFeeReturnRecord) 
	{
		publicHouseFeeReturnRecordMapper.insert(publicHouseFeeReturnRecord);
	}

	@Override
	public void delete(PublicHouseFeeReturnRecordModel publicHouseFeeReturnRecord) 
	{
		publicHouseFeeReturnRecordMapper.delete(publicHouseFeeReturnRecord);
	}

	@Override
	public void update(PublicHouseFeeReturnRecordModel publicHouseFeeReturnRecord) 
	{
		publicHouseFeeReturnRecordMapper.update(publicHouseFeeReturnRecord);
	}

	@Override
	public List<PublicHouseFeeReturnRecordModel> selectAll() 
	{
		List<PublicHouseFeeReturnRecordModel> list = publicHouseFeeReturnRecordMapper.selectAll();
		return list;
	}

	@Override
	public PublicHouseFeeReturnRecordModel selectByrecordNo(int recordNo) 
	{
		PublicHouseFeeReturnRecordModel res = publicHouseFeeReturnRecordMapper.selectByrecordNo(recordNo);
		return res;
	}
	
}
