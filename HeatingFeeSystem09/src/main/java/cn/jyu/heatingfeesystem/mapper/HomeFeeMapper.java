package cn.jyu.heatingfeesystem.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.jyu.heatingfeesystem.model.HeatingPriceModel;
import cn.jyu.heatingfeesystem.model.HomeFeeModel;

/**
 * 居民供热收费接口：接口方法包括增加一种居民供热收费方式、删除居民供热收费方式、修改居民供热收费方式、
 * 查询所有的居民供热收费方式、通过编号查询居民供热收费方式
 * 
 * @author 陈武杰
 *
 */
@Mapper
public interface HomeFeeMapper {
	// 增加一种居民供热收费方式
	public void insert(HomeFeeModel homeFee);
	// 删除居民供热收费方式
	public void delete(HomeFeeModel homeFee);
	// 修改居民供热收费方式
	public void update(HomeFeeModel homeFee);
	// 查询所有的居民供热收费方式
	public List<HomeFeeModel> selectAll();
	// 通过编号查询居民供热收费方式
	public HomeFeeModel selectByFeeNo(int feeNo);
}
