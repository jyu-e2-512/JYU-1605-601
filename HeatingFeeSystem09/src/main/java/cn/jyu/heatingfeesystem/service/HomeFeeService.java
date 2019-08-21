package cn.jyu.heatingfeesystem.service;

import java.util.List;

import cn.jyu.heatingfeesystem.model.HomeFeeModel;
/**
 * 居民供热收费的Service层接口：方法包括增加一种居民供热收费方式、删除指定的居民供热收费方式、修改居民供热收费方式、
 *  查询所有的居民供热收费方式、通过编号查询居民供热收费方式
 * @author 陈武杰
 *
 */
public interface HomeFeeService {
	// 增加一种居民供热收费方式
	public void insert(HomeFeeModel homeFee);
	// 删除一种居民供热收费方式
	public void delete(HomeFeeModel homeFee);
	// 修改居民供热收费方式
	public void update(HomeFeeModel homeFee);
	// 查询所有的居民供热收费方式
	public List<HomeFeeModel> selectAll();
	// 通过编号查询居民供热收费方式
	public HomeFeeModel selectByFeeNo(int feeNo);
}
