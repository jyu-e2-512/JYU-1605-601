package cn.jyu.heatingfeesystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.jyu.heatingfeesystem.mapper.HomeFeeMapper;
import cn.jyu.heatingfeesystem.model.HomeFeeModel;
import cn.jyu.heatingfeesystem.service.HomeFeeService;
import lombok.Data;
@Service("homeFeeService")
@Data
public class HomeFeeServiceImpl implements HomeFeeService {
	//@Autowired
	private HomeFeeMapper homeFeeMapper;

	@Override
	public void insert(HomeFeeModel homeFee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(HomeFeeModel homeFee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(HomeFeeModel homeFee) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<HomeFeeModel> selectAll() {
		
		return homeFeeMapper.selectAll();
	}

	@Override
	public HomeFeeModel selectByFeeNo(int feeNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
