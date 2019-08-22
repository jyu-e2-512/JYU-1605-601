package cn.jyu.heatingfeesystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jyu.heatingfeesystem.mapper.UserInfoMapper;
import cn.jyu.heatingfeesystem.model.UserInfoModel;
import cn.jyu.heatingfeesystem.service.UserInfoService;
import lombok.Data;

/**
 * UserInfoService接口的实现类
 * @author 刁为进
 *
 */
@Service("userInfoService")
@Data
public class UserInfoServiceImpl implements UserInfoService
{
	@Autowired
	private UserInfoMapper userInfoMapper;
	@Override
	public void insert(UserInfoModel userInfo) 
	{
		userInfoMapper.insert(userInfo);
	}

	@Override
	public void delete(UserInfoModel userInfo) 
	{
		userInfoMapper.delete(userInfo);
	}

	@Override
	public void update(UserInfoModel userInfo) 
	{
		userInfoMapper.update(userInfo);
	}

	@Override
	public List<UserInfoModel> selectAll() 
	{
		List<UserInfoModel> list = userInfoMapper.selectAll();
		return list;
	}

	@Override
	public UserInfoModel selectByUserId(String uuserid) 
	{
		UserInfoModel res = userInfoMapper.selectByUserId(uuserid);
		return res;
	}
	
}
