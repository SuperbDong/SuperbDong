package com.superbdong.jelly.model;

import java.io.Serializable;

public class Authority implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5424278736034089029L;
	
	private Integer id;
	private String auth_name;
	private String auth_content;
	private String auth_descrip;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAuth_name() {
		return auth_name;
	}

	public void setAuth_name(String auth_name) {
		this.auth_name = auth_name;
	}

	public String getAuth_content() {
		return auth_content;
	}

	public void setAuth_content(String auth_content) {
		this.auth_content = auth_content;
	}

	public String getAuth_descrip() {
		return auth_descrip;
	}

	public void setAuth_descrip(String auth_descrip) {
		this.auth_descrip = auth_descrip;
	}
}
