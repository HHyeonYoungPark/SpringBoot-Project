package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dao.BootDao;
import com.example.demo.dao.UserDao;
import com.example.demo.dto.BootDto;
import com.example.demo.dto.UserDto;

@Controller
public class HomeController {
	
	@Autowired
	BootDao dao;
	@Autowired
	UserDao udao;
	
	
	
	// board	
	
	@GetMapping({"/","/list"})
	public String main(Model model){
		//model.addAttribute("data",dao.selectDataAll());
		
		List<BootDto> list = dao.selectDataAll();
		model.addAttribute("data",list);		
		model.addAttribute("cnt", dao.selectDataCount());
				
		return "list";// list.html 파일임
	}
	
	@GetMapping("/writePage")
	public String write() {
		return "write";// write.html 파일
	}
	
	@PostMapping("/writeProc")
	public String writeProc(BootDto dto) {
		dao.insertData(dto);
		return "redirect:/list";
	}
	
	@PostMapping("/updateProc")
	public String updateProc(BootDto dto) {
		dao.updateData(dto);
		return "redirect:/list";
	}
	
	@GetMapping("/delete")
	public String delete(int idx) {
		dao.deleteData(idx);		
		return "redirect:/list";
	}
	
	@GetMapping("/selectOne")
	public String selectOne(int idx, Model model) {
		model.addAttribute("dto",dao.selectDataOne(idx));		
		return "update";
	}
	
	@GetMapping("/viewData")
	public String viewData(int idx, Model model) {
		model.addAttribute("dto",dao.viewData(idx));	
		return "view";
	}
	
	@GetMapping("/inputPw")
	public String inputPw(int idx, Model model) {		
		return "inputpw";
	}
	
	@PostMapping("/checkPw")
	public String checkPw(int idx, String pw, Model model) {		
		if(dao.selectPwMatch(idx, pw)>0) {
			delete(idx);
			return "redirect:/list";
		}else {
			model.addAttribute("result","비밀번호가 맞지 않습니다.");			
			return "inputpw";	
		}
	}
	
	
	
	// user
	
	@GetMapping("/regist")
	public String regist() {
		return "regist";
	}
	
	@PostMapping("/registProc")
	public String registProc(UserDto dto) {
		udao.registData(dto);
		return "redirect:/list";
	}
	
	
	
	// login & logout
	
	@PostMapping("/login")
	public String login(UserDto dto, HttpServletRequest request, Model model){		
		HttpSession session = (HttpSession)request.getSession();
		
		int result = udao.loginMember(dto);
		if(result>0) {
			session.setAttribute("logined", dto);
			
		}else {
			model.addAttribute("message","아이디 또는 비밀번호를 다시 입력해주세요.");
		}		
	    return "redirect:/";
				
	}	
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest request) {
	    HttpSession session = request.getSession();
	    session.invalidate();
	    return "redirect:/";
	}
	
}








