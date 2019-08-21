package cn.jyu.heatingfeesystem.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

/*
 *     小区信息类，属性包括小区编号、小区名字
 *     
 *  @author 王得志
 * 
 */

@Alias("Neighbourhood")
@Data
public class NeighbourhoodModel implements Serializable
{
	
	//小区编号
	private int hoodNo;
	//小区名字
	private String hoodName;
	//小区地址
	private String address;
}
