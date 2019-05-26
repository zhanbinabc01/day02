package com.cn.domain;

import java.io.Serializable;

public class User implements Serializable{
	
	private static final long serialVersionUID = 8173080919950449727L;
	private String username;
	private String password;
	private String usex;
	private String hobby;

	public String getUsex() {
		return usex;
	}
	public void setUsex(String usex) {
		this.usex = usex;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", usex=" + usex + ", hobby=" + hobby + "]";
	}
	
}
