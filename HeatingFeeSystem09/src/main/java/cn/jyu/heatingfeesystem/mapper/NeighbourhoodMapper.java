package cn.jyu.heatingfeesystem.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.jyu.heatingfeesystem.model.HeatingPriceModel;
import cn.jyu.heatingfeesystem.model.NeighbourhoodModel;

/**
 * 小区信息表接口：接口方法包括增加一条小区信息、删除小区信息、修改小区信息、 查询所有的小区信息、通过编号查询小区信息。
 * 
 * @author 王得志
 *
 */

public interface NeighbourhoodMapper {
	// 增加一条小区信息
	public void insert(NeighbourhoodModel neighbourhood);

	// 删除小区信息
	public void delete(int hooddNo);

	// 修改小区信息
	public void update(NeighbourhoodModel neighbourhood);

	// 查询所有的小区信息
	public List<NeighbourhoodModel> selectAll();

	// 通过编号查询小区信息
	public NeighbourhoodModel selectByHoodNo(int hoodNo);

	// 查询所有小区的总数
	public int selectCountByAll() throws Exception;

	// 取得所有小区列表,分页模式
	public List<NeighbourhoodModel> selectListByAllWithPage(@Param("start") int start, @Param("rows") int rows)
			throws Exception;
}
