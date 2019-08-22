package cn.jyu.heatingfeesystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.jyu.heatingfeesystem.mapper.HomeMapper;
import cn.jyu.heatingfeesystem.model.HomeModel;
import cn.jyu.heatingfeesystem.service.HomeService;
import lombok.Data;

/**
 * HomeService接口的实现类
 * @author 程利坚
 *
 */
@Service("homeService")
@Data
public class HomeServiceImpl implements HomeService{
	@Autowired
	private HomeMapper homeMapper;
	@Override
	public void insert(HomeModel home) {
		
		homeMapper.insert(home);
	}

	@Override
	public void update(HomeModel home) {
		
		homeMapper.update(home);
	}

	@Override
	public void delete(HomeModel home) {
		
		homeMapper.delete(home);
	}

	@Override
	public List<HomeModel> selectAll() {
		List<HomeModel> list=homeMapper.selectAll();
		return list;
	}

	@Override
	public HomeModel selectByHomeNo(int homeNo) {
		HomeModel home=homeMapper.selectByHomeNo(homeNo);
		return home;
	}
	
	
}
