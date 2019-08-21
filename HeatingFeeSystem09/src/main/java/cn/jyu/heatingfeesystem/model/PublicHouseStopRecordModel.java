package cn.jyu.heatingfeesystem.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

/*
 *     公建供热报停表
 *     属性包括：报停编号、公建供热记录编号、报停面积、报停日期、报停原因、报停人、报停备注、报停处理状态
 *     
 *     @author 许建华
 * 
 */

@Alias("PublicHouseStopRecord")
@Data
public class PublicHouseStopRecordModel implements Serializable
{	
	//报停编号
	private int recordNo;
	//公建供热记录编号编号(1:1)
	private PublicHouseFeeModel publicHouseFeeModel;
	//报停面积
	private BigDecimal stopArea;
	//报停日期
	private Date stopDate;
	//报停原因
	private String stopReason;
	//报停人
	private String stopPerson;
	//报停备注
	private String stopDesc;
	//报停处理状态
	private String stopStatus;
}