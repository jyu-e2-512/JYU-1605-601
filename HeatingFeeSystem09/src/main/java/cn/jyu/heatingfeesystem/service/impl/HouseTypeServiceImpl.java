package cn.jyu.heatingfeesystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.jyu.heatingfeesystem.mapper.HouseTypeMapper;
import cn.jyu.heatingfeesystem.model.HouseTypeModel;
import cn.jyu.heatingfeesystem.service.HouseTypeService;
import lombok.Data;

/**
 * HouseTypeService接口的实现类
 * @author 程利坚
 *
 */

@Data
@Service("houseTypeService")
public class HouseTypeServiceImpl implements HouseTypeService {
	@Autowired
	private HouseTypeMapper houseTypeMapper;
	
	@Override
	public void insert(HouseTypeModel houseType) {
		
		houseTypeMapper.insert(houseType);
	}

	@Override
	public void update(HouseTypeModel houseType) {
		
		houseTypeMapper.update(houseType);
	}

	@Override
	public void delete(HouseTypeModel houseType) {
		
		houseTypeMapper.delete(houseType);
		
	}

	@Override
	public List<HouseTypeModel> selectAll() {
		List<HouseTypeModel> list=houseTypeMapper.selectAll();
		return list;
	}

	@Override
	public HouseTypeModel selectByTypeNo(int typeNo) {
		HouseTypeModel houseType=houseTypeMapper.selectByTypeNo(typeNo);
		return houseType;
	}

	@Override
	public int selectCountByAll() throws Exception {
		
		return houseTypeMapper.selectCountByAll();
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
	public List<HouseTypeModel> selectListByAllWithPage(int rows, int page) throws Exception {
		
		return houseTypeMapper.selectListByAllWithPage(rows*(page-1), rows);
	}
	

}
