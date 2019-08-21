package cn.jyu.heatingfeesystem.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import org.apache.ibatis.type.Alias;
import lombok.Data;

/*
 *     公建供热缴费记录类，属性包括缴费序号、供热序号、缴费方式编号、缴费日期、
 *                 缴费金额、缴费人、收据编号、缴费备注、记录状态、公建供热序号。
 *     
 *  @author 王得志
 * 
 */

@Alias("PublicHouseFeePayRecord")
@Data
public class PublicHouseFeePayRecordModel implements Serializable
{
		//缴费序号
		private int recordNo;
		//缴费序号(1:1)
		private PublicHouseFeeModel homeFee;
		//缴费方式编号(1:1)
		private PaymentTypeModel paymentType;
		//缴费金额
		private BigDecimal payAmount;
		//缴费日期
		private Date payDate;
		//缴费人
		private String payPerson;
		//校验码
		private String checkCode;
		//收据编号
		private String invoiceCode;
		//缴费备注
		private String payDesc;
		//记录状态
		private String recordStatus;
}
