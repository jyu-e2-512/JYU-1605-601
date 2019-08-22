package cn.jyu.heatingfeesystem.service;

import java.util.List;

import cn.jyu.heatingfeesystem.model.HeatingPriceModel;
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
	public void delete(int hoodNo);
	//修改小区信息
	public void update(NeighbourhoodModel neighbourhood);
	//查询所有的小区信息
	public List<NeighbourhoodModel> selectAll();
	//通过编号查询小区信息
	public NeighbourhoodModel selectByTypeNo(int hoodNo);
	// 查询所有小区信息的总数
	public int selectCountByAll() throws Exception;
	//取得小区信息页数
	public int getPageCountByAll(int rows) throws Exception;
	// 取得所有小区信息列表,分页模式
	public List<NeighbourhoodModel> selectListByAllWithPage(int rows, int page)
				throws Exception;
	
}
