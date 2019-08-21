package cn.jyu.heatingfeesystem.model;

import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.Data;

/*
 *     操作员表
 *     属性包括：操作员登录账号、登录密码、姓名、关联的功能权限列表
 *     
 *     @author 陈武杰
 * 
 */
@Alias("User")
@Data
public class UserModel {
	private String uuserid = null;//操作员登录账号
	private String upassword = null;//登录密码
	private String uname = null;//姓名
	private List<FunctionModel> functionModels = null;//关联的功能权限列表
}
