package cn.jyu.heatingfeesystem.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.jyu.heatingfeesystem.model.FunctionModel;

/**
 * 功能的Service层接口：方法包括增加一种功能、删除指定的功能、修改功能、
 *  查询所有的功能、通过编号查询功能
 * @author 刁为进
 *
 */
public interface FunctionService
{
	//增加一个功能
	public void insert(FunctionModel function);
	//删除指定的功能
	public void delete(FunctionModel function);
	//修改功能
	public void update(FunctionModel function);
	//查询所有的功能
	public List<FunctionModel> selectAll();
	//通过编号查询功能缴费方式
	public FunctionModel selectByFunno(int funNo);
}
