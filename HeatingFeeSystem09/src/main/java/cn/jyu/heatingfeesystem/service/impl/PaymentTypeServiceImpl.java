package cn.jyu.heatingfeesystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jyu.heatingfeesystem.mapper.PaymentTypeMapper;
import cn.jyu.heatingfeesystem.model.PaymentTypeModel;
import cn.jyu.heatingfeesystem.service.PaymentTypeService;
import lombok.Data;

/**
 * PaymentTypeService接口的实现类
 * @author 刁为进
 *
 */
@Service("paymentTypeService")
@Data
public class PaymentTypeServiceImpl implements PaymentTypeService
{
	@Autowired
	private PaymentTypeMapper paymentTypeMapper;
	@Override
	public void insert(PaymentTypeModel paymentType) 
	{
		paymentTypeMapper.insert(paymentType);
	}

	@Override
	public void delete(PaymentTypeModel paymentType) 
	{
		paymentTypeMapper.delete(paymentType);
	}

	@Override
	public void update(PaymentTypeModel paymentType) 
	{
		paymentTypeMapper.update(paymentType);
	}

	@Override
	public List<PaymentTypeModel> selectAll() 
	{
		List<PaymentTypeModel> list = paymentTypeMapper.selectAll();
		return list;
	}

	@Override
	public PaymentTypeModel selectByTypeNo(int typeNo) 
	{
		PaymentTypeModel paymentType = paymentTypeMapper.selectByTypeNo(typeNo);
		return paymentType;
	}

	@Override
	public List<PaymentTypeModel> selectListByAllWithPage(int rows, int page)
	{
		List<PaymentTypeModel> list = paymentTypeMapper.selectListByAllWithPage(rows*(page-1), rows);
		return list;
	}

	@Override
	public int selectCountByAll() throws Exception 
	{
		return paymentTypeMapper.selectCountByAll();
	}

	@Override
	public int getPageCountByAll(int rows) throws Exception {
		int pageCount=0;
		int count=this.selectCountByAll();
		if(count%rows==0) {
			pageCount=count/rows;
		}
		else {
			pageCount=count/rows+1;
		}
		return pageCount;
	}

}
