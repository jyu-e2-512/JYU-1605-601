package cn.jyu.heatingfeesystem.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

/*
 *     房屋类型类，属性包括类型编号、类型名字
 *     
 *     @author 程利坚
 * 
 */
@Alias("HouseType")
@Data
public class HouseTypeModel implements Serializable{
	
	//房屋类型编号
	private int typeNo;
	//房屋类型名字
	private String typeName;

	
	

}