package cn.jyu.heatingfeesystem.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;
/*
 * 	   投诉类型表
 *     属性包括：类型编号、类型名称
 *     
 *     @author 陈武杰
 * 
 */
@Alias("ComplainType")
@Data
public class ComplainTypeModel implements Serializable {
	
	private Integer typeNo = 0;//类型编号
	private String typeName = null;//类型名称
	
}
