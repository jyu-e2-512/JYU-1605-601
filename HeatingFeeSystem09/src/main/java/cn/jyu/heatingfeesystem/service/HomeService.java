package cn.jyu.heatingfeesystem.service;

import java.util.List;

import cn.jyu.heatingfeesystem.model.HomeModel;

/**
 *  居民信息的Service层接口：接口方法包括增加家庭信息、修改家庭信息、删除家庭信息、
 *  查询所有家庭信息、通过家庭序号查询家庭信息
 * 	@author 程利坚
 *
*/

public interface HomeService {
	
	//增加家庭信息
	public void insert(HomeModel home);
	//修改家庭信息
	public void update(HomeModel home);
	//删除家庭信息
	public void delete(HomeModel home);
	//查询所有家庭信息
	public List<HomeModel>selectAll();
	//通过家庭序号查询家庭信息
	public HomeModel selectByHomeNo(int homeNo);
}
