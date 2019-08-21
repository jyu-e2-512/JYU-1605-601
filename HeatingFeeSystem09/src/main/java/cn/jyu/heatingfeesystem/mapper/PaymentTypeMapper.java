package cn.jyu.heatingfeesystem.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import cn.jyu.heatingfeesystem.model.PaymentTypeModel;

/**
  *  缴费方式接口：接口方法包括增加一种缴费方式、删除缴费方式、修改缴费方式、
  *  查询所有的缴费方式、通过编号查询缴费方式
  *  @author 刁为进
 *
 */
@Mapper
public interface PaymentTypeMapper 
{
	//增加一种缴费方式
	public void insert(PaymentTypeModel paymentType);
	//删除缴费方式
	public void delete(PaymentTypeModel paymentType);
	//修改缴费方式
	public void update(PaymentTypeModel paymentType);
	//查询所有的缴费方式
	public List<PaymentTypeModel> selectAll();
	//通过编号查询缴费方式
	public PaymentTypeModel selectByTypeNo(@Param("typeNo")int typeNo);
	//分页查询
	public List<PaymentTypeModel> selectListByAllWithPage(@Param("start")int start,@Param("rows") int page);
	// 查询所有年度供热价格的总数
	public int selectCountByAll() throws Exception;
}
