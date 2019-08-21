package cn.jyu.heatingfeesystem.service;

import java.util.List;
import cn.jyu.heatingfeesystem.model.HomeStopRecordModel;

/**
 *  功能接口：接口方法包括增加报停编号、删除报停编号、修改报停编号、
 *  查询所有的报停编号功能、通过编号查询报停编号
 *  @author 许建华
 *
 */

public interface HomeStopRecordService {
	
	//增加报停编号
	public void insert(HomeStopRecordModel homeStopRecord);
	//删除报停编号
	public void delete(HomeStopRecordModel homeStopRecord);
	//修改报停编号
	public void update(HomeStopRecordModel homeStopRecord);
	//查询所有的报停编号
	public List<HomeStopRecordModel> selectAll();
	//通过编号查询报停编号
	public HomeStopRecordModel selectByRecordNo(int recordNo);
}
