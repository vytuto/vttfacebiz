package com.vtt.training.vttface.biz.model;

public class VttUser {
	
	private String name;
	
	private String email;
	
	private String birthday;

	public VttUser(String name, String email, String birthday) {
		this.name = name;
		this.email = email;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

}
