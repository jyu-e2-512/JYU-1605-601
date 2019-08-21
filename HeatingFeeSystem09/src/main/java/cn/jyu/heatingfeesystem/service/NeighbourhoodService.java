package cn.jyu.heatingfeesystem.service;

import java.util.List;

import cn.jyu.heatingfeesystem.model.NeighbourhoodModel;

/**
 * 小区类型的Service层接口：方法包括增加一种小区类型、删除指定的小区类型、修改小区类型、
 *  查询所有的小区类型、通过编号查询小区类型
 * @author 王得志
 *
 */

public interface NeighbourhoodService {
	
	//增加一条小区信息
	public void insert(NeighbourhoodModel neighbourhood);
	//删除小区信息
	public void delete(int hooddNo);
	//修改小区信息
	public void update(NeighbourhoodModel neighbourhood);
	//查询所有的小区信息
	public List<NeighbourhoodModel> selectAll();
	//通过编号查询小区信息
	public NeighbourhoodModel selectByTypeNo(int hooddNo);
	
}
