package cn.jyu.heatingfeesystem.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

/*
*     居民表
*     属性包括：居民序号、户型编号（户型表）、小区序号（小区信息表）、供热编码、居民姓名、楼号、单元、楼层、房屋编号、建筑面积、朝向、电话
*     		   手机、邮箱、QQ、供热状态、实际供热面积
*     
*     @author 程利坚
* 
*/
@Alias("Home")
@Data
public class HomeModel implements Serializable{
	//居民序号，主键
	private int homeNo;
	//供热编码
	private String heatingCode;
	//一对一,户型编号作为外键对应户型表HouseTypeModel
	private HouseTypeModel houseTypeModel;
	//一对一,小区序号作为外键对应小区信息表NeighbourhoodModel
	private NeighbourhoodModel neighbourhoodModel;
	//居民姓名
	private String homeName;
	//楼号
	private String buildingCode;
	//单元
	private String departmentCode;
	//楼层
	private String floorCode ;
	//房屋编号
	private String houseCode;
	//建筑面积
	private double homeArea;
	//朝向
	private String direction;
	//电话
	private String tel;
	//手机
	private String mobile;
	//邮箱
	private String mail ;
	//QQ
	private String qq;
	//供热状态
	private String heatingStatus;
	//实际供热面积
	private double heatingArea;
	
	
	
	
}
