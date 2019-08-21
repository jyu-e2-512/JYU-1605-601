package cn.jyu.heatingfeesystem.mapper;

import java.util.List;

import cn.jyu.heatingfeesystem.model.HomeFeePayRecordModel;

/**
 *  居民缴费记录表接口：接口方法包括增加一条缴费记录、删除缴费记录、修改缴费记录、
 *  查询所有的缴费记录、通过编号查询缴费记录。
* @author 王得志
*
*/

public interface HomeFeePayRecordMapper {
		//增加一条缴费记录
		public void insert(HomeFeePayRecordModel homeFeePayRecord);
		//删除缴费记录
		public void delete(int recordNo);
		//修改缴费记录
		public void update(HomeFeePayRecordModel homeFeePayRecord);
		//查询所有的缴费记录
		public List<HomeFeePayRecordModel> selectAll();
		//通过编号查询缴费记录
		public HomeFeePayRecordModel selectByTypeNo(int recordNo);
}
