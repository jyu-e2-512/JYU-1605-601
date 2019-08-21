package cn.jyu.heatingfeesystem.model;

import java.io.Serializable;
import java.math.BigDecimal;

import org.apache.ibatis.type.Alias;

import lombok.Data;
/*
*
*     居民供热收费表
*     属性包括：缴费序号、居民编号（居民表）、年份（年度价格表）、供热面积、应缴费、
*     		   实缴费、欠缴费、缴费状态（供热/报停）、实际供热天数、备注
*     
*     @author 陈武杰
* 
*/
@Alias("HomeFee")
@Data
public class HomeFeeModel implements Serializable {
	private Integer feeNo = 0;//缴费序号，主键
	private BigDecimal heatingArea;//供热面积
	private BigDecimal agreeFee;//应缴费
	private BigDecimal actualFee;//实缴费
	private BigDecimal debtFee;//欠缴费
	private String feeStatus = null;//缴费状态
	private Integer heatingdays = 0;//实际供热天数
	private String feeDesc = null;//备注														
	
	private HomeModel homeModel = null;//居民编号作为外键对应居民表HomeModel,一对一
	private HeatingPriceModel heatingPriceModel = null;//年份作为外键对应年度供热价格表HeatingPriceModel,一对多	
	private HomeFeePayRecordModel homeFeePayRecordModel = null;//feeNo作为住宅供热缴费记录表HomeFeePayRecordModel的参考外键，一对一
}
