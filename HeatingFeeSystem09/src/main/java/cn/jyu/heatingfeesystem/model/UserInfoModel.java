package cn.jyu.heatingfeesystem.model;

import java.sql.Blob;

import org.apache.ibatis.type.Alias;

import lombok.Data;

/**
 *  系统管理员辅助信息，属性包括登录账号、性别、年龄、照片、照片文件名、照片文件类型
 * 
 * @author 刁为进
 *
 */
@Data
@Alias("UserInfo")
public class UserInfoModel 
{
	//登录账号、与管理员表HT_SYSTEMUser构成一对一关系
	private UserModel user;
	//性别
	private String sex;
	//年龄
	private int age;
	//照片
	private byte[] photo;
	//照片文件名
	private String photoFileName;
	//照片文件类型
	private String photoContentType;
	//电话号码
	private String tel;
	//手机号码
	private String mobile;
}
