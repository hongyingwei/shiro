package com.woniu.entity;

/**
 * Users表实体映射
 * <p>Description:</p>
 * <p>@author 陈良</p>
 * <p>@date  2019年3月9日</p>
 * <p>@version 1.0</p>
 */
public class Users {
	private Integer id;
	private String username;
	private String password;
	private Integer roleId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
}
