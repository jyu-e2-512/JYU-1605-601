package cn.jyu.heatingfeesystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jyu.heatingfeesystem.mapper.NeighbourhoodMapper;
import cn.jyu.heatingfeesystem.model.NeighbourhoodModel;
import cn.jyu.heatingfeesystem.service.NeighbourhoodService;
import lombok.Data;


@Service("neighbourhoodService")
@Data
public class NeighbourhoodServiceImpl implements NeighbourhoodService{
	@Autowired
	private NeighbourhoodMapper neighbourhoodMapper;
	
	@Override
	public void insert(NeighbourhoodModel neighbourhood) {
		neighbourhoodMapper.insert(neighbourhood);
		
	}

	@Override
	public void delete(int hooddNo) {
		neighbourhoodMapper.delete(hooddNo);
		
	}

	@Override
	public void update(NeighbourhoodModel neighbourhood) {
		neighbourhoodMapper.update(neighbourhood);
	}

	@Override
	public List<NeighbourhoodModel> selectAll() {
		List<NeighbourhoodModel> neighbourhoods=neighbourhoodMapper.selectAll();
		return neighbourhoods;
	}

	@Override
	public NeighbourhoodModel selectByTypeNo(int hooddNo) {
		NeighbourhoodModel neighbourhood=neighbourhoodMapper.selectByTypeNo(hooddNo);
		return neighbourhood;
	}

}
