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

import com.clinic.app.entity.Patient;
import com.clinic.app.service.IPatientService;

@CrossOrigin
@RequestMapping("/api")
@RestController
public class PatientController {

	@Autowired
	private IPatientService patientService;

	@GetMapping("/patients")
	public List<Patient> getAllPatients() {

		return (List<Patient>) patientService.getAllPatients();
	}

	@GetMapping("/patients/{id}")
	public Optional<Patient> selectPatientById(@PathVariable Integer id) {

		return patientService.selectPatientById(id);
	}

	@PutMapping("/patients")
	public void updatePatient(@RequestBody Patient patient) {
		patientService.updatePatient(patient);

	}

	@PostMapping("/patients")
	public void insertPatient(@RequestBody Patient patient) {
		patientService.insertPatient(patient);

	}

	@DeleteMapping("/patients{id}")
	public void deletePatient(@PathVariable Integer id) {
		patientService.deletePatient(id);

	}

}
