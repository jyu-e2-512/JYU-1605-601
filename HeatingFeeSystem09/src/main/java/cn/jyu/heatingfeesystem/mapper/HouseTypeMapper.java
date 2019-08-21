package cn.jyu.heatingfeesystem.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;


import cn.jyu.heatingfeesystem.model.HomeComplainModel;
import cn.jyu.heatingfeesystem.model.HomeModel;
import cn.jyu.heatingfeesystem.model.HouseTypeModel;

/**
 *  房屋类型接口：接口方法包括增加房屋类型、修改房屋类型、删除房屋类型、
 *  查询所有房屋类型类、通过房屋类型编号查询房屋类型
 * 	@author 程利坚
 *
*/
public interface HouseTypeMapper {
	
			//增加房屋类型
			public void insert(HouseTypeModel houseType);
			//修改房屋类型
			public void update(HouseTypeModel houseType);
			//删除房屋类型
			public void delete(HouseTypeModel houseType);
			//查询所有房屋类型类
			public List<HouseTypeModel> selectAll();
			//通过房屋类型编号查询房屋类型
			public HouseTypeModel selectByTypeNo(int typeNo);
			// 查询所有房屋类型
			public int selectCountByAll() throws Exception;
			//取得所有部门列表,分页模式
			public List<HouseTypeModel> selectListByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
}
