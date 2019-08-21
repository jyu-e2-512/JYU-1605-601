package cn.jyu.heatingfeesystem.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.jyu.heatingfeesystem.model.ComplainTypeModel;
import cn.jyu.heatingfeesystem.model.PublicHouseFeeModel;

/**
  * 公建供热收费接口：接口方法包括增加一种公建供热收费方式、删除公建供热收费方式、修改公建供热收费方式、 查询所有的公建供热收费方式、通过编号查询公建供热收费方式
 * 
 * @author 陈武杰
 *
 */
@Mapper
public interface PublicHouseFeeMapper {
	// 增加一种公建供热收费方式
	public void insert(PublicHouseFeeModel publicHouseFee);
	// 删除公建供热收费方式
	public void delete(PublicHouseFeeModel publicHouseFee);
	// 修改公建供热收费方式
	public void update(PublicHouseFeeModel publicHouseFee);
	// 查询所有的公建供热收费方式
	public List<PublicHouseFeeModel> selectAll();
	// 通过编号查询公建供热收费方式
	public PublicHouseFeeModel selectByFeeNo(int feeNo);
}
