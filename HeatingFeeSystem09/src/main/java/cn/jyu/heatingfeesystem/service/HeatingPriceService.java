package cn.jyu.heatingfeesystem.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.jyu.heatingfeesystem.model.ComplainTypeModel;
import cn.jyu.heatingfeesystem.model.HeatingPriceModel;
import cn.jyu.heatingfeesystem.model.PaymentTypeModel;

/**
 * 供热年度价格的Service层接口：方法包括增加一种供热年度价格、删除指定的供热年度价格、修改供热年度价格、
 * 查询所有的供热年度价格、通过编号查询供热年度价格
 * 
 * @author 陈武杰
 *
 */
public interface HeatingPriceService {
	// 增加一种供热年度价格
	public void insert(HeatingPriceModel heatingPrice);

	// 删除一种供热年度价格
	public void delete(HeatingPriceModel heatingPrice);

	// 修改供热年度价格
	public void update(HeatingPriceModel heatingPrice);

	// 查询所有的供热年度价格
	public List<HeatingPriceModel> selectAll();

	// 通过编号查询供热年度价格
	public HeatingPriceModel selectByHeatingYear(String heatingYear);

	// 查询所有年度供热价格的总数
	public int selectCountByAll() throws Exception;
	//取得年度供热价格页数
	public int getPageCountByAll(int rows) throws Exception;

	// 取得所有年度供热价格列表,分页模式
	public List<HeatingPriceModel> selectListByAllWithPage(int rows, int page)
			throws Exception;
	
}
