package com.clinic.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.app.entity.Role;
import com.clinic.app.repository.IRoleRepository;
@Service
public class RoleServiceImplementation implements IRoleService{
	@Autowired
	private IRoleRepository roleRepository;
	@Override
	public List<Role> getAllRoles() {
		
		return (List<Role>) roleRepository.findAll();
	}

	@Override
	public Optional<Role> selectRoleById(Integer id) {
		
		return roleRepository.findById(id);
	}

	@Override
	public void updateRole(Role role) {
		roleRepository.save(role);
		
	}

	@Override
	public void insertRole(Role role) {
		roleRepository.save(role);
		
	}

	@Override
	public void deleteRole(Integer id) {
		roleRepository.deleteById(id);
		
	}

}
