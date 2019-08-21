package cn.jyu.heatingfeesystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.jyu.heatingfeesystem.mapper.HomeFeeReturnRecordMapper;
import cn.jyu.heatingfeesystem.model.HomeFeeReturnRecordModel;
import cn.jyu.heatingfeesystem.service.HomeFeeReturnRecordService;
import lombok.Data;
@Data
@Service("homeFeeReturnRecordService")
public class HomeFeeReturnRecordServiceImpl implements HomeFeeReturnRecordService {
	
	//@Autowired
	private HomeFeeReturnRecordMapper homeFeeReturnRecordMapper;
	@Override
	public void insert(HomeFeeReturnRecordModel homeFeeReturnRecord) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(HomeFeeReturnRecordModel homeFeeReturnRecord) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(HomeFeeReturnRecordModel homeFeeReturnRecord) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<HomeFeeReturnRecordModel> selectAll() {
		
		return homeFeeReturnRecordMapper.selectAll();
	}

	@Override
	public HomeFeeReturnRecordModel selectByRecordNo(int recordNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
