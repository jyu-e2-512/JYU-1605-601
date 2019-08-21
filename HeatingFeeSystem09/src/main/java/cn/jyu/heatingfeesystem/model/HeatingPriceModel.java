package cn.jyu.heatingfeesystem.model;

import java.io.Serializable;
import java.math.BigDecimal;

import org.apache.ibatis.type.Alias;

import lombok.Data;

/*
 *     供热年度价格表
 *     属性包括：供热年份、居民价格、公建价格、供热天数、备注、价格文件、文件名、文件类型
 *     
 *     @author 陈武杰
 * 
 */
@Alias("HeatingPrice")
@Data
public class HeatingPriceModel implements Serializable {
	private String heatingYear = null;//供热年份
	private BigDecimal homePrice;//居民价格
	private BigDecimal publicHousePrice;//公建价格
	private Integer heatingdays = 0;//供热天数
	private String heatingMemo = null;//备注
	private byte[] priceFile = null;//价格文件
	private String priceFileName = null;//文件名
	private String priceFileContentType = null;//文件类型
}
