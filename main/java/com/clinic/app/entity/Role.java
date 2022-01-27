package com.clinic.app.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="roles")
public class Role {

	//define fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int roleId;
	@OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
	private List<User>users;
	
	private String roleName;
	
	
	// default constructor
	public Role() {
	
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	

	
	public Role(int roleId, List<User> users, String roleName) {
		super();
		this.roleId = roleId;
		this.users = users;
		this.roleName = roleName;
	}

	@JsonIgnore
	@JsonManagedReference
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	

	

	



	




}
