package cn.jyu.heatingfeesystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.jyu.heatingfeesystem.mapper.HomeComplainMapper;
import cn.jyu.heatingfeesystem.mapper.HouseTypeMapper;
import cn.jyu.heatingfeesystem.model.HomeComplainModel;
import cn.jyu.heatingfeesystem.service.HomeComplainService;
import lombok.Data;

/**
 * HomeComplainService接口的实现类
 * @author 程利坚
 *
 */

@Data
@Service("homeComplainService")
public class HomeComplainServiceImpl implements HomeComplainService{
	
	private HomeComplainMapper homeComplainMapper;
	@Override
	public void insert(HomeComplainModel homeComplain) {
		
		homeComplainMapper.insert(homeComplain);
	}

	@Override
	public void update(HomeComplainModel homeComplain) {
		
		homeComplainMapper.update(homeComplain);
	}

	@Override
	public void delete(HomeComplainModel homeComplain) {
		
		homeComplainMapper.delete(homeComplain);
		
	}

	@Override
	public List<HomeComplainModel> selectAll() {
		List<HomeComplainModel>  list=homeComplainMapper.selectAll();
		return list;
	}

	@Override
	public HomeComplainModel selectByComplainNo(int complainNo) {
		HomeComplainModel homeComplain=homeComplainMapper.selectByComplainNo(complainNo);
		return homeComplain;
	}

}
