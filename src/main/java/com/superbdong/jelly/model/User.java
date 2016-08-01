package com.superbdong.jelly.model;

import java.io.Serializable;
import java.util.Set;

/**
 * @author dell
 *
 */
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -306053837690873559L;
	
	private Integer id;
	private String user_name;
	private String user_pwd;
	private String user_sex;
	private String phone_num;
	private String qq_num;
	private String user_email;
	private String user_descrip;
	private Set<Role> role_set;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public String getUser_sex() {
		return user_sex;
	}
	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}
	public String getPhone_num() {
		return phone_num;
	}
	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}
	public String getQq_num() {
		return qq_num;
	}
	public void setQq_num(String qq_num) {
		this.qq_num = qq_num;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_descrip() {
		return user_descrip;
	}
	public void setUser_descrip(String user_descrip) {
		this.user_descrip = user_descrip;
	}
	public Set<Role> getRole_set() {
		return role_set;
	}
	public void setRole_set(Set<Role> role_set) {
		this.role_set = role_set;
	}

}
