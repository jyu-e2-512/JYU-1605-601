package cn.jyu.heatingfeesystem.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

/*
*     公建表
*     属性包括：公建序号、供热编码、房屋名字、公建编号、楼号、建筑面积、地址、邮编、
*     		联系人姓名、电话、 手机、邮箱、QQ、供热状态、单元、楼层、实际供热面积
*     
*     @author 程利坚
* 
*/
@Alias("PublicHouse")
@Data
public class PublicHouseModel implements Serializable{
		//公建序号，主键
		private int houseNo;
		//一对一,小区序号作为外键对应小区信息表NeighbourhoodModel
		private NeighbourhoodModel neighbourhoodModel;
		//供热编码
		private String heatingCode;
		//房屋名字
		private String houseName;
		//公建编号
		private String houseCode;
		//楼号
		private String building;
		//建筑面积
		private double houseArea;
		//地址
		private String address;
		//邮编
		private String postCode;
		//联系人姓名
		private String contactName;
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
		//单元
		private double departmentCode;
		//楼层
		private String floorCode;
		//实际供热面积
		private double heatingArea;
		
		
		
		
		

}
