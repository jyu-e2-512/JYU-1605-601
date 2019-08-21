package cn.jyu.heatingfeesystem.service;

import java.util.List;
import cn.jyu.heatingfeesystem.model.PublicHouseModel;

/**
 *  	公建表的Service层接口：接口方法包括增加公建信息、修改公建信息、删除公建信息、
 *  	查询所有公建信息、通过公建序号查询公建信息
 * 		@author 程利坚
 *
*/
public interface PublicHouseService {
		
			//增加公建信息
			public void insert(PublicHouseModel publicHouse);
			//修改公建信息
			public void update(PublicHouseModel publicHouse);
			//删除公建信息
			public void delete(PublicHouseModel publicHouse);
			//查询所有公建信息
			public List<PublicHouseModel> selectAll();
			//通过公建序号查询公建信息
			public PublicHouseModel selectByHouseNo(int houseNo);
}
