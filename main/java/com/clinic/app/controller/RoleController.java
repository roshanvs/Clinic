package com.clinic.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinic.app.entity.MedicineList;
import com.clinic.app.entity.Role;
import com.clinic.app.service.IRoleService;

@CrossOrigin
@RequestMapping("/api")
@RestController
public class RoleController {
	@Autowired
	private IRoleService roleService;
	
	
	@GetMapping("/roles")
	public List<Role> getAllRoles() {
			
		return (List<Role>)roleService.getAllRoles();
	}

	@GetMapping("/roles/{id}")
	public Optional<Role> selectRoleById(@PathVariable Integer id) {
		
		return roleService.selectRoleById(id);
	}

	@PutMapping("/roles")
	public void updateRole(@RequestBody Role role) {
		roleService.updateRole(role);
		
	}

	@PostMapping("/roles")
	public void insertRole(@RequestBody Role role) {
		roleService.insertRole(role);
		
	}

	@DeleteMapping("/roles/{id}")
	public void deleteRole(@PathVariable Integer id) {
		roleService.deleteRole(id);
		
	}
}
