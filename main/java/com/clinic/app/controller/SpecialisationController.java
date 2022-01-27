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


import com.clinic.app.entity.Specialisation;
import com.clinic.app.service.ISpecialisationService;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class SpecialisationController {
	@Autowired
	private ISpecialisationService specialisationService;
	@GetMapping("/specialisations")
	public List<Specialisation> getAllSpecialisation() {
			
		return (List<Specialisation>) specialisationService.getAllSpecialisations();
	}

	@GetMapping("/specialisations/{id}")
	public Optional<Specialisation> selectSpecialisationById(@PathVariable Integer id) {
		
		return specialisationService.selectSpecialisationById(id);
	}

	@PutMapping("/specialisations")
	public void updateSpecialisation(@RequestBody Specialisation specialisation) {
		specialisationService.updateSpecialisation(specialisation);
		
	}

	@PostMapping("/specialisations")
	public void insertSpecialisation(@RequestBody Specialisation specialisation) {
		specialisationService.insertSpecialisation(specialisation);
		
	}

	@DeleteMapping("/specialisations/{id}")
	public void deleteSpecialisation(@PathVariable Integer id) {
		specialisationService.deleteSpecialisation(id);
		
	}
}
