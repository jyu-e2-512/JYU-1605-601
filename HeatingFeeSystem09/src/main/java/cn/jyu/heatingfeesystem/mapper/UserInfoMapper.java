package cn.jyu.heatingfeesystem.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.jyu.heatingfeesystem.model.PaymentTypeModel;
import cn.jyu.heatingfeesystem.model.UserInfoModel;

/**
 *  系统管理员辅助信息接口：接口方法包括增加一条系统管理员辅助信息、删除指定的系统管理员辅助信息、修改系统管理员辅助信息、
 *  查询所有的系统管理员辅助信息、通过账号查询系统管理员辅助信息
 *  @author 刁为进
*
*/
public interface UserInfoMapper 
{
	//增加一条系统管理员辅助信息
	public void insert(UserInfoModel userInfo);
	//删除指定的系统管理员辅助信息
	public void delete(UserInfoModel userInfo);
	//修改系统管理员辅助信息
	public void update(UserInfoModel userInfo);
	//查询所有的系统管理员辅助信息
	public List<UserInfoModel> selectAll();
	//通过账号查询系统管理员辅助信息
	public UserInfoModel selectByUserId(@Param("uuserid")String uuserid);
}
