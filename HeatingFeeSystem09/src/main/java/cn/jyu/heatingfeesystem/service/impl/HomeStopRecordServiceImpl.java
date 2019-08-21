package cn.jyu.heatingfeesystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.jyu.heatingfeesystem.mapper.FunctionMapper;
import cn.jyu.heatingfeesystem.mapper.HomeStopRecordMapper;
import cn.jyu.heatingfeesystem.model.HomeStopRecordModel;
import cn.jyu.heatingfeesystem.service.HomeStopRecordService;
import lombok.Data;


/**
 * HomeStopRecordService接口的实现类
 * @author 许建华
 *
 */

@Service("homeStopRecordService")
@Data
public class HomeStopRecordServiceImpl implements HomeStopRecordService {
	
	private HomeStopRecordMapper homeStopRecordMapper;
	@Override
	public void insert(HomeStopRecordModel homeStopRecord) {
		
		homeStopRecordMapper.insert(homeStopRecord);
		
	}

	@Override
	public void delete(HomeStopRecordModel homeStopRecord) {
		
		homeStopRecordMapper.delete(homeStopRecord);
	}

	@Override
	public void update(HomeStopRecordModel homeStopRecord) {
		
		homeStopRecordMapper.update(homeStopRecord);
	}

	@Override
	public List<HomeStopRecordModel> selectAll() {
		List<HomeStopRecordModel> list=homeStopRecordMapper.selectAll();
		return list;
	}

	@Override
	public HomeStopRecordModel selectByRecordNo(int recordNo) {
		HomeStopRecordModel homeStopRecord=homeStopRecordMapper.selectByRecordNo(recordNo);
		return homeStopRecord;
	}

}
