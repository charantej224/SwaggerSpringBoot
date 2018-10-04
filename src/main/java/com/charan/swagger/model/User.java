package com.charan.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	
	public User() {
		super();
	}
	
	public User(Long id,String name,String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}

	@JsonProperty("ID")
	private Long id;
	
	@JsonProperty("NAME")
	private String name;
	
	@JsonProperty("Password")
	private String password;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
