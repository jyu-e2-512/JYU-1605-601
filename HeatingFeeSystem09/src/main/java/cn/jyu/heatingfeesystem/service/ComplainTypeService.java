package cn.jyu.heatingfeesystem.service;

import java.util.List;

import cn.jyu.heatingfeesystem.model.ComplainTypeModel;
import cn.jyu.heatingfeesystem.model.PaymentTypeModel;
/**
 * 投诉类型的Service层接口：方法包括增加一种投诉类型、删除指定的投诉类型、修改投诉类型、
 *  查询所有的投诉类型、通过编号查询投诉类型
 * @author 陈武杰
 *
 */
public interface ComplainTypeService {
	// 增加一种投诉类型
	public void insert(ComplainTypeModel complainType);
	// 删除一种投诉类型
	public void delete(ComplainTypeModel complainType);
	// 修改投诉类型
	public void update(ComplainTypeModel complainType);
	// 查询所有的投诉类型
	public List<ComplainTypeModel> selectAll();
	// 通过编号查询投诉类型
	public ComplainTypeModel selectByTypeNo(int typeNo);
}
