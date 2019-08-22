package cn.jyu.heatingfeesystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jyu.heatingfeesystem.mapper.PublicHouseStopRecordMapper;
import cn.jyu.heatingfeesystem.model.PublicHouseStopRecordModel;
import cn.jyu.heatingfeesystem.service.PublicHouseStopRecordService;
import lombok.Data;


/**
 * publicHouseStopRecordService接口的实现类
 * @author 许建华
 *
 */

@Service("publicHouseStopRecordService")
@Data
public class PublicHouseStopRecordServiceImpl implements PublicHouseStopRecordService {
	@Autowired
	private PublicHouseStopRecordMapper publicHouseStopRecordMapper;

	@Override
	public void insert(PublicHouseStopRecordModel publicHouseStopRecord) {
		publicHouseStopRecordMapper.insert(publicHouseStopRecord);
		
	}

	@Override
	public void delete(PublicHouseStopRecordModel publicHouseStopRecord) {
		publicHouseStopRecordMapper.delete(publicHouseStopRecord);
		
	}

	@Override
	public void update(PublicHouseStopRecordModel publicHouseStopRecord) {
		publicHouseStopRecordMapper.update(publicHouseStopRecord);
		
	}

	@Override
	public List<PublicHouseStopRecordModel> selectAll() {
		List<PublicHouseStopRecordModel> publicHouseStopRecordModel=publicHouseStopRecordMapper.selectAll();
		return publicHouseStopRecordModel;
	}

	@Override
	public PublicHouseStopRecordModel selectByRecordNo(int recordNo) {
		PublicHouseStopRecordModel publicHouseStopRecordModel=publicHouseStopRecordMapper.selectByRecordNo(recordNo);
		return publicHouseStopRecordModel;
	}
	

}
