package cn.jyu.heatingfeesystem.service;

import java.util.List;

import cn.jyu.heatingfeesystem.model.HomeComplainModel;

/**
 *  用户投诉的Service层接口：接口方法包括增加用户投诉、修改用户投诉、删除用户投诉、
 *  查询所有用户投诉、通过投诉序号查询投诉内容
 * 	@author 程利坚
 *
*/
public interface HomeComplainService {
	
		//增加用户投诉
		public void insert(HomeComplainModel homeComplain);
		//修改用户投诉
		public void update(HomeComplainModel homeComplain);
		//删除用户投诉
		public void delete(HomeComplainModel homeComplain);
		//查询所有用户投诉
		public List<HomeComplainModel>selectAll();
		//通过投诉序号查询投诉内容
		public HomeComplainModel selectByComplainNo(int complainNo);
}
