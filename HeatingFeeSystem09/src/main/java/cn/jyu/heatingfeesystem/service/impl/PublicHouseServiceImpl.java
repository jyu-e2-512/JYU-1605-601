package cn.jyu.heatingfeesystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.jyu.heatingfeesystem.mapper.PublicHouseMapper;
import cn.jyu.heatingfeesystem.model.PublicHouseModel;
import cn.jyu.heatingfeesystem.service.PublicHouseService;
import lombok.Data;

/**
 * PublicHouseService接口的实现类
 * @author 程利坚
 *
 */

@Data
@Service("publicHouseService")
public class PublicHouseServiceImpl implements PublicHouseService{

	private PublicHouseMapper publicHouseMapper;
	
	@Override
	public void insert(PublicHouseModel publicHouse) {
		
		publicHouseMapper.insert(publicHouse);
	}

	@Override
	public void update(PublicHouseModel publicHouse) {
		
		publicHouseMapper.update(publicHouse);
	}

	@Override
	public void delete(PublicHouseModel publicHouse) {
		
		publicHouseMapper.delete(publicHouse);
	}

	@Override
	public List<PublicHouseModel> selectAll() {
		List<PublicHouseModel> list=publicHouseMapper.selectAll();
		return list;
	}

	@Override
	public PublicHouseModel selectByHouseNo(int houseNo) {
		PublicHouseModel publicHouse=publicHouseMapper.selectByHouseNo(houseNo);
		return publicHouse;
	}

}
