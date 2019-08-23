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
	public NeighbourhoodModel selectByTypeNo(int hoodNo) {
		NeighbourhoodModel neighbourhood=neighbourhoodMapper.selectByHoodNo(hoodNo);
		return neighbourhood;
	}

	@Override
	public int selectCountByAll() throws Exception {
		return neighbourhoodMapper.selectCountByAll();
		
	}

	@Override
	public int getPageCountByAll(int rows) throws Exception {
		int pageCount=0;
		int count=this.selectCountByAll();
		if(count%rows==0) {
			pageCount=count/rows;
		}
		else {
			pageCount=count/rows+1;
		}
		return pageCount;
	}

	@Override
	public List<NeighbourhoodModel> selectListByAllWithPage(int rows, int page) throws Exception {
		return neighbourhoodMapper.selectListByAllWithPage(rows*(page-1), rows);
	}

}
