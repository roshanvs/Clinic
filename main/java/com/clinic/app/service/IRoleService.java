package com.clinic.app.service;

import java.util.List;
import java.util.Optional;

import com.clinic.app.entity.Role;



public interface IRoleService {


	public List<Role> getAllRoles();

	public Optional<Role> selectRoleById(Integer id);

	public void updateRole(Role role);

	public void insertRole(Role role);

	public void deleteRole(Integer id);

}
