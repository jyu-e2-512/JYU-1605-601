package cn.jyu.heatingfeesystem.mapper;

import java.util.List;

import cn.jyu.heatingfeesystem.model.PublicHouseComplainModel;

/**
 *  公建投诉记录表接口：接口方法包括增加一条投诉记录、删除投诉记录、修改投诉记录、
 *  查询所有的投诉记录、通过编号查询投诉记录。
* @author 王得志
*
*/

public interface PublicHouseComplainMapper {
	
			//增加一条投诉记录
			public void insert(PublicHouseComplainModel publicHouseComplain);
			//删除投诉记录
			public void delete(int complainNo);
			//修改投诉记录
			public void update(PublicHouseComplainModel publicHouseComplain);
			//查询所有的投诉记录
			public List<PublicHouseComplainModel> selectAll();
			//通过编号查询投诉记录
			public PublicHouseComplainModel selectByTypeNo(int complainNo);
}
