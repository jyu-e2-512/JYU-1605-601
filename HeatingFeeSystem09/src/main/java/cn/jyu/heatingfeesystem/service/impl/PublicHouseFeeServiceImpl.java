package cn.jyu.heatingfeesystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.jyu.heatingfeesystem.mapper.PublicHouseFeeMapper;
import cn.jyu.heatingfeesystem.model.PublicHouseFeeModel;
import cn.jyu.heatingfeesystem.service.PublicHouseFeeService;
import lombok.Data;
@Service("publicHouseFeeService")
@Data
public class PublicHouseFeeServiceImpl implements PublicHouseFeeService {

	//@Autowired
	private PublicHouseFeeMapper publicHouseFeeMapper;
	@Override
	public void insert(PublicHouseFeeModel publicHouseFee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(PublicHouseFeeModel publicHouseFee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(PublicHouseFeeModel publicHouseFee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PublicHouseFeeModel> selectAll() {
		
		return publicHouseFeeMapper.selectAll();
	}

	@Override
	public PublicHouseFeeModel selectByFeeNo(int feeNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
