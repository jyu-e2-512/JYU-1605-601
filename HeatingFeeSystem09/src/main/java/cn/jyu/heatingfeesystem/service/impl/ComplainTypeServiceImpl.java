package cn.jyu.heatingfeesystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jyu.heatingfeesystem.mapper.ComplainTypeMapper;
import cn.jyu.heatingfeesystem.mapper.PaymentTypeMapper;
import cn.jyu.heatingfeesystem.model.ComplainTypeModel;
import cn.jyu.heatingfeesystem.service.ComplainTypeService;
import lombok.Data;
@Service("complainTypeService")
@Data
public class ComplainTypeServiceImpl implements ComplainTypeService {
	//@Autowired
	private ComplainTypeMapper complainTypeMapper;
	public void insert(ComplainTypeModel complainType) {
		

	}

	@Override
	public void delete(ComplainTypeModel complainType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(ComplainTypeModel complainType) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ComplainTypeModel> selectAll() {
		//System.out.println("AAA");
		System.out.println(complainTypeMapper.toString());
		return complainTypeMapper.selectAll();
	}

	@Override
	public ComplainTypeModel selectByTypeNo(int typeNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
