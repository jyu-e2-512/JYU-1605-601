package cn.jyu.heatingfeesystem.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.sql.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

/**
 * 公建供热退费记录表
 * 属性包括：退费序号、公建供热费记录、付款方式、退费金额、退费日期、
			    收款人、验证码、退费单编号、退费备注、退费状态
 * 
 * @author 刁为进
 *
 */
@Data
@Alias("PublicHouseFeeReturnRecord")
public class PublicHouseFeeReturnRecordModel implements Serializable
{
	//退费序号
	private int recordNo;
	//公建供热费记录,一对一,一条公建供热退费记录对应一条公建供热费记录
	private PublicHouseFeeModel publicHouse;
	//付款方式,一对一,一条退费记录对应一种付款方式
	private PaymentTypeModel paymentType;
	//退费金额
	private BigDecimal amount; 
	//退费日期
	private Date returnDate;
	//收款人
	private String person;
	//验证码
	private String checkCode;
	//退费单编号
	private String invoiceCode;
	//退费备注
	private String recordDesc;
	//退费状态
	private String recordStatus;	
}
