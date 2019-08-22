package cn.jyu.heatingfeesystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jyu.heatingfeesystem.mapper.HeatingPriceMapper;
import cn.jyu.heatingfeesystem.model.HeatingPriceModel;
import cn.jyu.heatingfeesystem.service.HeatingPriceService;
import lombok.Data;
@Service("heatingPriceService")
@Data
public class HeatingPriceServiceImpl implements HeatingPriceService {
	@Autowired
	private HeatingPriceMapper heatingPriceMapper;
	@Override
	public void insert(HeatingPriceModel heatingPrice) {
		heatingPriceMapper.insert(heatingPrice);

	}

	@Override
	public void delete(HeatingPriceModel heatingPrice) {
		heatingPriceMapper.delete(heatingPrice);

	}

	@Override
	public void update(HeatingPriceModel heatingPrice) {
		heatingPriceMapper.update(heatingPrice);

	}

	@Override
	public List<HeatingPriceModel> selectAll() {
		
		return heatingPriceMapper.selectAll();
	}

	@Override
	public HeatingPriceModel selectByHeatingYear(String heatingYear) {
		
		return heatingPriceMapper.selectByHeatingYear(heatingYear);
	}

	@Override
	public int selectCountByAll() throws Exception {
		
		return heatingPriceMapper.selectCountByAll();
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
	public List<HeatingPriceModel> selectListByAllWithPage(int rows, int page) throws Exception {
		
		return heatingPriceMapper.selectListByAllWithPage(rows*(page-1), rows);
	}

	
}
