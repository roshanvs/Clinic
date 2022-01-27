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


import com.clinic.app.entity.LabTechnician;

import com.clinic.app.service.ILabTechnicianService;

@CrossOrigin //(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class LabTechnicianController {

	
	@Autowired
	private ILabTechnicianService labTechnicianService;
	
	//Get All Labtechnicians
	@GetMapping("/labtechnicians")
	public List<LabTechnician> getAllLabTechnician() {
		return labTechnicianService.getAllLabTechnician();
	}
	
	
	//get Labtechnician By Id
		@GetMapping("/labtechnicians/{id}")
		public Optional<LabTechnician> getLabTechnicianById(@PathVariable Integer id) {
			return labTechnicianService.getLabTechnicianById(id);
		}
	
	//Post 	--Insert Labtechnicians
	@PostMapping("/labtechnicians")
	public void addLabTechnician(@RequestBody LabTechnician labTechnician) {
		labTechnicianService.addLabTechnician(labTechnician);

	}
	
	//Put 		--Update Labtechnicians
	@PutMapping("/labtechnicians")
	public void updateLabTechnician(@RequestBody LabTechnician labTechnician) {
		labTechnicianService.updateLabTechnician(labTechnician);
	}
	
	//Delete 		--Delete Labtechnicians
	@DeleteMapping("/labtechnicians/{id}")
	public void deleteLabTechnician(@PathVariable Integer id) {
		labTechnicianService.deleteLabTechnician(id);

	}
	
	
}
