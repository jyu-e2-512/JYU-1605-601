package cn.jyu.heatingfeesystem.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

/*
 *      住宅投诉记录表
 *     属性包括：投诉序号、居民序编号、投诉类型编号、投诉标题、投诉内容、投诉要求、
 *     			投诉日期、投诉人姓名、电话、手机、邮箱、QQ、开始维修时间、维修结束时间、
 *     			维修内容、维修人姓名、回访时间、客户意见、保险出险时间、保险金额、
 *     			保险理赔时间、投诉状态。
 *     
 *  	@author 程利坚
 * 
 */
@Alias("HomeComplain")
@Data
public class HomeComplainModel implements Serializable{


	//投诉序号，主键
	private int complainNo;
	//一对一，居民序作为外键对应居民户型表HomeModel
	private HomeModel homeModel;
	//一对一,投诉类型编号作为外键对应投诉类型表ComplainTypeModel
	private ComplainTypeModel complainTypeModel;
	//投诉标题
	private String complainTitle;
	//投诉内容
	private String complainContent;
	//投诉要求
	private String requestContent;
	//投诉日期
	private Date complainDate;
	//投诉人姓名
	private String contactPerson;
	//电话
	private String tel;
	//手机
	private String mobile;
	//邮箱
	private String mail;
	//QQ
	private String qq;
	//开始维修时间
	private Date serviceStartDate;
	//维修结束时间
	private Date serviceEndDate;
	//维修内容
	private String  serviceContent;
	//维修人姓名
	private String servicePerson;
	//回访时间
	private Date feedBackDate;
	//客户意见
	private String homeComment;
	//保险出险时间
	private Date assuranceDate;
	//保险金额
	private double assuranceFee;
	//保险理赔时间
	private Date assurancePayDate;
	//投诉状态
	private String  complainStatus;
	
	
	
	
}