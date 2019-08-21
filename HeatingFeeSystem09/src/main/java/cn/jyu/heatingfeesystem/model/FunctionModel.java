package cn.jyu.heatingfeesystem.model;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.Data;

/**
 * 系统功能表，属性包括功能编号、功能名称、URL地址、功能级别号、关联的用户列表
 * 
 * @author 刁为进
 *
 */
@Data
@Alias("Function")
public class FunctionModel implements Serializable
{
	//功能编号
	private int funNo;
	//功能名称
	private String funName;
	//URL地址
	private String funUrl;
	//功能级别号
	private int levelNo;
	
}
