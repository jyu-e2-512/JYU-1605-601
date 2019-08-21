package cn.jyu.heatingfeesystem.model;

import java.io.Serializable;
import java.math.BigDecimal;

import org.apache.ibatis.type.Alias;

import lombok.Data;
/*
*     公建供热收费表
*     属性包括：公建供热序号、公建编号、年份（年度价格表）、供热面积、应缴费、
*     		   实缴费、欠缴费、备注、缴费状态（供热/报停）、实际供热天数
*     
*     @author 陈武杰
* 
*/
@Alias("PublicHouseFee")
@Data
public class PublicHouseFeeModel implements Serializable {
	private Integer feeNo = 0;//公建供热序号
	private BigDecimal heatingArea;//供热面积
	private BigDecimal agreeFee;//应缴费
	private BigDecimal actualFee;//实缴费
	private BigDecimal debtFee;//欠缴费
	private String feeDesc = null;//备注
	private String feeStatus = null;//缴费状态
	private Integer heatingdays = 0;//实际供热天数
	
	
	private PublicHouseModel publicHouseModel = null;//公建编号作为外键对应公建表PublicHouseModel,一对一
	private HeatingPriceModel heatingPriceModel = null;//年份作为外键对应年度供热价格表HeatingPriceModel，一对一
	private PublicHouseFeePayRecordModel publicHouseFeePayRecordModel = null;//feeNo作为公建供热缴费记录表PublicHouseFeePayRecordModel的参考外键，一对一
}
