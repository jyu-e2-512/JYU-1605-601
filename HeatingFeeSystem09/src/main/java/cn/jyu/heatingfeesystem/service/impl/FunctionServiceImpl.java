package cn.jyu.heatingfeesystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.jyu.heatingfeesystem.mapper.FunctionMapper;
import cn.jyu.heatingfeesystem.model.FunctionModel;
import cn.jyu.heatingfeesystem.service.FunctionService;
import lombok.Data;
/**
 * FunctionService接口的实现类
 * @author 刁为进
 *
 */
@Service("functionService")
@Data
public class FunctionServiceImpl implements FunctionService
{
	private FunctionMapper functionMapper;
	@Override
	public void insert(FunctionModel function) 
	{
		functionMapper.insert(function);
	}

	@Override
	public void delete(FunctionModel function) 
	{
		functionMapper.delete(function);
	}

	@Override
	public void update(FunctionModel function) 
	{
		functionMapper.update(function);
	}

	@Override
	public List<FunctionModel> selectAll()
	{
		List<FunctionModel> list = functionMapper.selectAll();
		return list;
	}

	@Override
	public FunctionModel selectByFunno(int funNo) 
	{
		FunctionModel function = functionMapper.selectByFunno(funNo);
		return function;
	}
	
}
