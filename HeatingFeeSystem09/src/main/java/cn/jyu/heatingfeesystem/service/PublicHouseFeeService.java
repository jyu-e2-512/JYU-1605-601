package cn.jyu.heatingfeesystem.service;

import java.util.List;

import cn.jyu.heatingfeesystem.model.HomeFeeModel;
import cn.jyu.heatingfeesystem.model.PublicHouseFeeModel;
/**
 * 公建供热收费的Service层接口：方法包括增加一种公建供热收费方式、删除指定的公建供热收费方式、修改公建供热收费方式、
 *  查询所有的公建供热收费方式、通过编号查询公建供热收费方式
 * @author 陈武杰
 *
 */
public interface PublicHouseFeeService {
	// 增加一种公建供热收费方式
	public void insert(PublicHouseFeeModel publicHouseFee);
	// 删除一种公建供热收费方式
	public void delete(PublicHouseFeeModel publicHouseFee);
	// 修改公建供热收费方式
	public void update(PublicHouseFeeModel publicHouseFee);
	// 查询所有的公建供热收费方式
	public List<PublicHouseFeeModel> selectAll();
	// 通过编号查询公建供热收费方式
	public PublicHouseFeeModel selectByFeeNo(int feeNo);
}
