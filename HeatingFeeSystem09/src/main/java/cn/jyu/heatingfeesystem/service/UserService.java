package cn.jyu.heatingfeesystem.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.jyu.heatingfeesystem.model.UserModel;
/**
 * 操作员信息Service层接口：方法包括增加一条操作员信息、删除指定的操作员信息、修改操作员信息、
 *  查询所有的操作员信息、通过账号查询系操作员信息
 * @author 陈武杰
 *
 */
public interface UserService 
{
	//增加一条操作员信息
	public void insert(UserModel user);
	//删除指定的操作员信息
	public void delete(UserModel user);
	//修改操作员信息
	public void update(UserModel user);
	//查询所有的操作员信息
	public List<UserModel> selectAll();
	//通过账号查询操作员信息
	public UserModel selectById(@Param("uuserid")String uuserid);
}
