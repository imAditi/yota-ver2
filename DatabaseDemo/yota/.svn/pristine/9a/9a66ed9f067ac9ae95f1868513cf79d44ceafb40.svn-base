package com.yash.yota.command;

import javax.validation.constraints.NotBlank;

public class LoginCommand {
	@NotBlank(message="Login Name is required")
	private String loginName;
	@NotBlank(message="password is required")
	private String password;
	
	public LoginCommand() {
		super();
	}
	public LoginCommand(String loginName, String password) {
		this.loginName = loginName;
		this.password = password;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginCommand [loginName=" + loginName + ", password=" + password + "]";
	}
	
}
