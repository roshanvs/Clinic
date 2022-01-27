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
import com.clinic.app.entity.Receptionist;
import com.clinic.app.service.IReceptionistService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ReceptionistController {
	@Autowired
	private IReceptionistService receptionistService;

	@GetMapping("/receptionists")
	public List<Receptionist> getAllReceptionists() {

		return (List<Receptionist>) receptionistService.getAllReceptionists();
	}

	@GetMapping("/receptionists/{id}")
	public Optional<Receptionist> selectReceptionistById(@PathVariable Integer id) {

		return receptionistService.selectReceptionistById(id);
	}

	@PutMapping("/receptionists")
	public void updateReceptionist(@RequestBody Receptionist receptionist) {
		receptionistService.updateReceptionist(receptionist);

	}

	@PostMapping("/receptionists")
	public void insertReceptionist(@RequestBody Receptionist receptionist) {
		receptionistService.insertReceptionist(receptionist);

	}

	@DeleteMapping("/receptionists/{id}")
	public void deleteReceptionist(@PathVariable Integer id) {
		receptionistService.deleteReceptionist(id);

	}

}
