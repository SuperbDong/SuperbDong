package com.superbdong.jelly.model;

import java.io.Serializable;
import java.util.Set;

public class Role implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String role_name;
	private String role_descrip;
	private Set<Authority> auth_set;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public Set<Authority> getAuth_set() {
		return auth_set;
	}

	public void setAuth_set(Set<Authority> auth_set) {
		this.auth_set = auth_set;
	}

	public String getRole_descrip() {
		return role_descrip;
	}

	public void setRole_descrip(String role_descrip) {
		this.role_descrip = role_descrip;
	}
	
}
