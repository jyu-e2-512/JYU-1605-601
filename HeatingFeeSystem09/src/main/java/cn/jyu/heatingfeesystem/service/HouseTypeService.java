package cn.jyu.heatingfeesystem.service;

import java.util.List;

import cn.jyu.heatingfeesystem.model.HeatingPriceModel;
import cn.jyu.heatingfeesystem.model.HouseTypeModel;

/**
 *  房屋类型的Service层接口：接口方法包括增加房屋类型、修改房屋类型、删除房屋类型、
 *  查询所有房屋类型类、通过房屋类型编号查询房屋类型
 * 	@author 程利坚
 *
*/
public interface HouseTypeService {
	
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
	//取得房屋类型
	public int getPageCountByAll(int rows) throws Exception;
	// 取得所有房屋类型,分页模式
	public List<HouseTypeModel> selectListByAllWithPage(int rows, int page)
				throws Exception;
}
