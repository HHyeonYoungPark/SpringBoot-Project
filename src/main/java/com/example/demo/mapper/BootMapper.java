package com.example.demo.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.dto.BootDto;

@Mapper
public interface BootMapper {
	// 기본적으로 mybatis를 쓸때 객체의 이름의 통일성을 위해서
	// 또 메서드의 관리를 위해서
	// mapper 인터페이스를 만들어 주는게 좋다.
	
	public int insertData(BootDto dto);//게시글 입력
	public BootDto selectDataOne(int idx);//하나 가져오기
	public BootDto viewData(int idx); // 상세보기
	public int updateData(BootDto dto);//수정
	public int deleteData(int idx);//삭제
	public List<BootDto> selectDataAll();//전부가져오기
	public int selectDataCount();//개수가져오기
	public int selectPwMatch(@Param("idx") int idx, @Param("pw") String pw);//비밀번호 확인
}



