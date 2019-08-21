package cn.jyu.heatingfeesystem.mapper;

import java.util.List;

import cn.jyu.heatingfeesystem.model.PublicHouseFeePayRecordModel;

/**
 *  公共缴费记录表接口：接口方法包括增加一条缴费记录、删除缴费记录、修改缴费记录、
 *  查询所有的缴费记录、通过编号查询缴费记录。
* @author 王得志
*
*/

public interface PublicHouseFeePayRecordMapper {
	
			//增加一条缴费记录
			public void insert(PublicHouseFeePayRecordModel publicHouseFeePayRecord);
			//删除缴费记录
			public void delete(int recordNo);
			//修改缴费记录
			public void update(PublicHouseFeePayRecordModel publicHouseFeePayRecord);
			//查询所有的缴费记录
			public List<PublicHouseFeePayRecordModel> selectAll();
			//通过编号查询缴费记录
			public PublicHouseFeePayRecordModel selectByTypeNo(int recordNo);
}
