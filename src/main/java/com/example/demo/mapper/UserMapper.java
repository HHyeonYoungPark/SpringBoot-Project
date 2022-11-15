package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.UserDto;

@Mapper
public interface UserMapper {
	// 기본적으로 mybatis를 쓸때 객체의 이름의 통일성을 위해서
	// 또 메서드의 관리를 위해서
	// mapper 인터페이스를 만들어 주는게 좋다.
	
	public int registData(UserDto dto); //회원가입
	public int checkId(String id); // 아이디 중복체크
	public int loginMember(UserDto dto); // 로그인할때
}



