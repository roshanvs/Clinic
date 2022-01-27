package com.clinic.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinic.app.entity.Pharmacist;

import com.clinic.app.service.IPharmacistService;

@CrossOrigin
@RequestMapping("/api")
@RestController
public class PharmacistController {
	
	@Autowired
	private IPharmacistService pharmacistService;

	@GetMapping("/pharmacists")
	public List<Pharmacist> getAllPharmacists() {
		
		return (List<Pharmacist>)pharmacistService.getAllPharmacists() ;
	}
	
	@GetMapping("/pharmacists/{id}")
	public Optional<Pharmacist> selectPharmacistById(@PathVariable Integer id) {
		
		return pharmacistService.selectPharmacistById(id);
	}

	@PutMapping("/pharmacists")
	public void updatePharmacist(@RequestBody Pharmacist pharmacist) {
		pharmacistService.updatePharmacist(pharmacist);
		
	}

	@PostMapping("/pharmacists")
	public void insertPharmacist(@RequestBody Pharmacist pharmacist) {
		pharmacistService.insertPharmacist(pharmacist);
		
	}

	@DeleteMapping("/pharmacists/{id}")
	public void deletePharmacist(Integer id) {
		pharmacistService.deletePharmacist(id);
		
	}
	
}
