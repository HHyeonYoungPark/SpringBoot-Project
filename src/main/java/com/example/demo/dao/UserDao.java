package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.UserDto;
import com.example.demo.mapper.UserMapper;

@Repository
public class UserDao implements UserMapper{

	@Autowired
	private UserMapper userMapper;

	@Override
	public int registData(UserDto dto) {
		// TODO Auto-generated method stub
		return userMapper.registData(dto);
	}
	
	@Override
	public int checkId(String id) {
		// TODO Auto-generated method stub
		return userMapper.checkId(id);
	}

	@Override
	public int loginMember(UserDto dto) {		
		// TODO Auto-generated method stub
		return userMapper.loginMember(dto);
	}

}