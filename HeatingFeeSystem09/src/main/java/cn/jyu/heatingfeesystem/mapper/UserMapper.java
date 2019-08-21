package cn.jyu.heatingfeesystem.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.jyu.heatingfeesystem.model.PublicHouseFeeModel;
import cn.jyu.heatingfeesystem.model.UserModel;

/**
 * 操作员接口：接口方法包括增加一个操作员、删除操作员、修改操作员信息、 查询所有的操作员、通过编号查询操作员
 * 
 * @author 陈武杰
 *
 */
@Mapper
public interface UserMapper {
	// 增加一个操作员
	public void insert(UserModel user);
	// 删除操作员
	public void delete(UserModel user);
	// 修改操作员信息
	public void update(UserModel user);
	// 查询所有的操作员
	public List<UserModel> selectAll();
	// 通过编号查询操作员
	public UserModel selectById(String userid);
}
