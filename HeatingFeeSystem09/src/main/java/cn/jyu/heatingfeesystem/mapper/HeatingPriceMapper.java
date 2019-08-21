package cn.jyu.heatingfeesystem.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;



import cn.jyu.heatingfeesystem.model.ComplainTypeModel;
import cn.jyu.heatingfeesystem.model.HeatingPriceModel;

/**
  * 年度供热价格接口：接口方法包括增加一种年度供热价格、删除年度供热价格、修改年度供热价格、 查询所有的年度供热价格、通过供热年份查询年度供热价格
 * 
 * @author 陈武杰
 *
 */
@Mapper
public interface HeatingPriceMapper {
	// 增加一种年度供热价格
	public void insert(HeatingPriceModel heatingPrice);
	// 删除年度供热价格
	public void delete(HeatingPriceModel heatingPrice);
	// 修改年度供热价格
	public void update(HeatingPriceModel heatingPrice);
	// 查询所有的年度供热价格
	public List<HeatingPriceModel> selectAll();
	// 通过供热年份查询年度供热价格
	public HeatingPriceModel selectByHeatingYear(String heatingYear);
	// 查询所有年度供热价格的总数
	public int selectCountByAll() throws Exception;
	//取得所有部门列表,分页模式
	public List<HeatingPriceModel> selectListByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
}
