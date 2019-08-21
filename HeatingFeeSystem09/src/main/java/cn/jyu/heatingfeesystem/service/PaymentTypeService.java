package cn.jyu.heatingfeesystem.service;

import java.util.List;

import cn.jyu.heatingfeesystem.model.HeatingPriceModel;
import cn.jyu.heatingfeesystem.model.PaymentTypeModel;

/**
 * 缴费方式Service层接口：方法包括增加一种缴费方式、删除缴费方式、修改缴费方式、查询所有的缴费方式、通过编号查询缴费方式
 * @author 刁为进
 *
 */
public interface PaymentTypeService 
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
		public PaymentTypeModel selectByTypeNo(int typeNo);
		//分页查询
		public List<PaymentTypeModel> selectListByAllWithPage(int rows, int page);
		// 查询所有年度供热价格的总数
		public int selectCountByAll() throws Exception;
		//取得年度供热价格页数
		public int getPageCountByAll(int rows) throws Exception;
}
