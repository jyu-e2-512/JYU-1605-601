package cn.jyu.heatingfeesystem.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.jyu.heatingfeesystem.model.PublicHouseFeeReturnRecordModel;

/**
 *  公建供热退费记录Service接口：接口方法包括增加一条公建供热退费记录、删除指定的公建供热退费记录、
 *  修改指定的公建供热退费记录、查询所有的公建供热退费记录、通过编号查询公建供热退费记录
 *  @author 刁为进
*
*/
public interface PublicHouseFeeReturnRecordService 
{
	//增加一条公建供热退费记录
	public void insert(PublicHouseFeeReturnRecordModel publicHouseFeeReturnRecord);
	//删除指定的公建供热退费记录
	public void delete(PublicHouseFeeReturnRecordModel publicHouseFeeReturnRecord);
	//修改指定的公建供热退费记录
	public void update(PublicHouseFeeReturnRecordModel publicHouseFeeReturnRecord);
	//查询所有的公建供热退费记录
	public List<PublicHouseFeeReturnRecordModel> selectAll();
	//<-该方法未测试->通过编号查询公建供热退费记录
	public PublicHouseFeeReturnRecordModel selectByrecordNo(@Param("recordNo")int recordNo);
}
