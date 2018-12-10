package com.qa.cv_manager.userapi.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "${database.userRoles}")
public class UserRole {

	@Id
	@Column(name = "${database.usernameFieldName}")
	private String username;
	
	private String role;

	public UserRole() {}
	
	public UserRole(String username, String role) {
		this.username = username;
		this.role = role;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public String toString() {
		return username + role;
	}
}
