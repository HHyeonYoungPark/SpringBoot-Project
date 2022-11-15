package com.example.demo.dto;

public class UserDto{
	private int idx;
	private String id;
	private String pw;
	private String username;
	private String phone;
	private String email;
	private String regdate;
	
	public UserDto() {}

	public UserDto(int idx, String id, String pw, String username, String phone, String email, String regdate) {
		super();
		this.idx = idx;
		this.id = id;
		this.pw = pw;
		this.username = username;
		this.phone = phone;
		this.email = email;
		this.regdate = regdate;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	
}