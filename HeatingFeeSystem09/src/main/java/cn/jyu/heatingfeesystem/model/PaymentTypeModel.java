package cn.jyu.heatingfeesystem.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
  *  缴费方式类，属性包括缴费方式编号、缴费方式名称
 *
 * @author 刁为进
 */
@Data
@Alias("PaymentType")
public class PaymentTypeModel implements Serializable
{
	//缴费方式编号
	private int typeNo;
	//缴费方式名称
	private String typeName;  
}
