package cn.jyu.heatingfeesystem.mapper;

import java.util.List;

import cn.jyu.heatingfeesystem.model.HomeFeeModel;
import cn.jyu.heatingfeesystem.model.HomeFeeReturnRecordModel;

/**
 * 住宅供热退费接口：接口方法包括增加一条住宅供热退费记录、删除住宅供热退费记录、修改住宅供热退费记录、
 * 查询所有的住宅供热退费记录、通过编号查询住宅供热退费记录
 * 
 * @author 陈武杰
 *
 */
public interface HomeFeeReturnRecordMapper {
	// 增加一条住宅供热退费记录
	public void insert(HomeFeeReturnRecordModel	homeFeeReturnRecord);
	// 删除住宅供热退费记录
	public void delete(HomeFeeReturnRecordModel	homeFeeReturnRecord);
	// 修改住宅供热退费记录
	public void update(HomeFeeReturnRecordModel	homeFeeReturnRecord);
	// 查询所有的住宅供热退费记录
	public List<HomeFeeReturnRecordModel> selectAll();
	// 通过编号查询住宅供热退费记录
	public HomeFeeReturnRecordModel selectByRecordNo(int recordNo);
}
