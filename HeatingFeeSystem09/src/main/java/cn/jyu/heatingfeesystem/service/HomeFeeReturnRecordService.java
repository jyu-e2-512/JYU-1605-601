package cn.jyu.heatingfeesystem.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.jyu.heatingfeesystem.model.HomeFeeReturnRecordModel;

/**
 *  居民供热退费记录Service接口：接口方法包括增加一条居民供热退费记录、删除指定的居民供热退费记录、
 *  修改指定的居民供热退费记录、查询所有的居民供热退费记录、通过编号查询居民供热退费记录
 *  @author 陈武杰
*
*/
public interface HomeFeeReturnRecordService 
{
	//增加一条居民供热退费记录
	public void insert(HomeFeeReturnRecordModel homeFeeReturnRecord);
	//删除指定的居民供热退费记录
	public void delete(HomeFeeReturnRecordModel homeFeeReturnRecord);
	//修改指定的居民供热退费记录
	public void update(HomeFeeReturnRecordModel homeFeeReturnRecord);
	//查询所有的居民供热退费记录
	public List<HomeFeeReturnRecordModel> selectAll();
	//<-该方法未测试->通过编号查询居民供热退费记录
	public HomeFeeReturnRecordModel selectByRecordNo(@Param("recordNo")int recordNo);
}
