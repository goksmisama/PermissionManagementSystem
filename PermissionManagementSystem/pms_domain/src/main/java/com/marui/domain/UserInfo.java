package com.marui.domain;

import java.io.Serializable;
import java.util.List;
/**
 * 用户实体类
 * @author MaRui
 *
 */
public class UserInfo implements Serializable {
	private String id; 
	private String username; 
	private String email; 
	private String password; 
	private String phoneNum; 
	private int status; 
	private String statusStr; 
	private List<Role> roles;
	public UserInfo() {
		super();
	}
	public UserInfo(String id, String username, String email, String password, String phoneNum, int status,
			String statusStr, List<Role> roles) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.phoneNum = phoneNum;
		this.status = status;
		this.statusStr = statusStr;
		this.roles = roles;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getStatusStr() {
		if(status==0) {
			statusStr="未开启";
		}else if (status==1) {
			statusStr="开启";
		}
		return statusStr;
	}
	public void setStatusStr(String statusStr) {
		this.statusStr = statusStr;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", phoneNum=" + phoneNum + ", status=" + status + ", statusStr=" + statusStr + ", roles=" + roles
				+ "]";
	}
	
	
}
