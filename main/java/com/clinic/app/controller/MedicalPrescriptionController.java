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
import com.clinic.app.entity.MedicalPrescription;
import com.clinic.app.service.IMedicalPrescriptionService;

@CrossOrigin (origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")

public class MedicalPrescriptionController {

	@Autowired
	private IMedicalPrescriptionService medicalPrescriptionService;
	
	//Get All GeneralNote
		@GetMapping("/medicalprescriptions")
		public List<MedicalPrescription> getAllMedicalPrescription() {
			return medicalPrescriptionService.getAllMedicalPrescription();
		}
		
		
		//get GeneralNote By Id
			@GetMapping("/medicalprescriptions/{id}")
			public Optional<MedicalPrescription> getMedicalPrescriptionById(@PathVariable Integer id) {
				return medicalPrescriptionService.getMedicalPrescriptionById(id);
			}
		
		//Post 	--Insert GeneralNote
		@PostMapping("/medicalprescriptions")
		public void addMedicalPrescription(@RequestBody MedicalPrescription medicalPrescription) {
			medicalPrescriptionService.addMedicalPrescription(medicalPrescription);

		}
		
		//Put 		--Update GeneralNote
		@PutMapping("/medicalprescriptions")
		public void updateMedicalPrescription(@RequestBody MedicalPrescription medicalPrescription) {
			medicalPrescriptionService.updateMedicalPrescription(medicalPrescription);
		}
		
		//Delete 		--Delete Location
		@DeleteMapping("/medicalprescriptions/{id}")
		public void deleteMedicalPrescription(@PathVariable Integer id) {
			medicalPrescriptionService.deleteMedicalPrescription(id);

		}
	
	
}
