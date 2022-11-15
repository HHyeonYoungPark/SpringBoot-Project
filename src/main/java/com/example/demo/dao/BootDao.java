package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.BootDto;
import com.example.demo.mapper.BootMapper;

@Repository
public class BootDao implements BootMapper{

	@Autowired
	private BootMapper bootMapper;
	
	@Override
	public int insertData(BootDto dto) {
		// TODO Auto-generated method stub
		return bootMapper.insertData(dto);
	}

	@Override
	public BootDto selectDataOne(int idx) {
		// TODO Auto-generated method stub
		return bootMapper.selectDataOne(idx);
	}

	@Override
	public int updateData(BootDto dto) {
		// TODO Auto-generated method stub
		return bootMapper.updateData(dto);
	}

	@Override
	public int deleteData(int idx) {
		// TODO Auto-generated method stub
		return bootMapper.deleteData(idx);
	}

	@Override
	public List<BootDto> selectDataAll() {
		// TODO Auto-generated method stub
		return bootMapper.selectDataAll();
	}

	@Override
	public int selectDataCount() {
		// TODO Auto-generated method stub
		return bootMapper.selectDataCount();
	}

	@Override
	public int selectPwMatch(int idx, String pw) {
		return bootMapper.selectPwMatch(idx, pw);
	}

	@Override
	public BootDto viewData(int idx) {
		// TODO Auto-generated method stub
		return bootMapper.viewData(idx);
	}


}
