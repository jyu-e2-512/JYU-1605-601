package cn.jyu.heatingfeesystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.jyu.heatingfeesystem.mapper.PublicHouseComplainMapper;
import cn.jyu.heatingfeesystem.model.PublicHouseComplainModel;
import cn.jyu.heatingfeesystem.service.PublicHouseComplainService;
import lombok.Data;


@Service("publicHouseComplainService")
@Data	
public class PublicHouseComplainServiceImpl implements PublicHouseComplainService{
	private PublicHouseComplainMapper publicHouseComplainMapper;
	
	@Override
	public void insert(PublicHouseComplainModel publicHouseComplain) {
		publicHouseComplainMapper.insert(publicHouseComplain);
		
	}

	@Override
	public void delete(int complainNo) {
		publicHouseComplainMapper.delete(complainNo);
		
	}

	@Override
	public void update(PublicHouseComplainModel publicHouseComplain) {
		publicHouseComplainMapper.update(publicHouseComplain);
		
	}

	@Override
	public List<PublicHouseComplainModel> selectAll() {
		List<PublicHouseComplainModel> publicHouseComplain=publicHouseComplainMapper.selectAll();
		return publicHouseComplain;
	}

	@Override
	public PublicHouseComplainModel selectByTypeNo(int complainNo) {
		PublicHouseComplainModel publicHouseComplain=publicHouseComplainMapper.selectByTypeNo(complainNo);
		return publicHouseComplain;
	}

	
}
