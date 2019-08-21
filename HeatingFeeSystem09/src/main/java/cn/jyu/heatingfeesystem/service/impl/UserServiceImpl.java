package cn.jyu.heatingfeesystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.jyu.heatingfeesystem.mapper.UserMapper;
import cn.jyu.heatingfeesystem.model.UserModel;
import cn.jyu.heatingfeesystem.service.UserService;
import lombok.Data;
@Service("userService")
@Data
public class UserServiceImpl implements UserService {

	//@Autowired
	private UserMapper userMapper;
	@Override
	public void insert(UserModel user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(UserModel user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(UserModel user) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<UserModel> selectAll() {
		
		return userMapper.selectAll();
	}

	@Override
	public UserModel selectById(String uuserid) {
		// TODO Auto-generated method stub
		return null;
	}

}
