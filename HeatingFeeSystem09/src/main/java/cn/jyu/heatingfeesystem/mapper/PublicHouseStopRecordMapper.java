package cn.jyu.heatingfeesystem.mapper;

import java.util.List;

import cn.jyu.heatingfeesystem.model.PublicHouseStopRecordModel;

/**
 *  功能接口：接口方法包括增加报停编号、删除报停编号、修改报停编号、
 *  查询所有的报停编号功能、通过编号查询报停编号
 *  @author 许建华
 *
 */
public interface PublicHouseStopRecordMapper {
	
	
			//增加报停编号
			public void insert(PublicHouseStopRecordModel publicHouseStopRecord);
			//删除报停编号
			public void delete(PublicHouseStopRecordModel publicHouseStopRecord);
			//修改报停编号
			public void update(PublicHouseStopRecordModel publicHouseStopRecord);
			//查询所有的报停编号
			public List<PublicHouseStopRecordModel> selectAll();
			//通过编号查询报停编号
			public PublicHouseStopRecordModel selectByRecordNo(int recordNo);
	
}
