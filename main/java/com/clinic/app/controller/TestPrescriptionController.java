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

import com.clinic.app.entity.TestPrescription;
import com.clinic.app.service.ITestPrescriptionService;

@CrossOrigin //(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class TestPrescriptionController {

	@Autowired
	private ITestPrescriptionService testPrescriptionService;
	
	//Get All TestPrescription
	@GetMapping("/testprescriptions")
	public List<TestPrescription> getAllTestPrescription() {
		return testPrescriptionService.getAllTestPrescription();
	}
	
	
	//get TestPrescription By Id
		@GetMapping("/testprescriptions/{id}")
		public Optional<TestPrescription> getTestPrescriptionById(@PathVariable Integer id) {
			return testPrescriptionService.getTestPrescriptionById(id);
		}
	
	//Post 	--Insert TestPrescription
	@PostMapping("/testprescriptions")
	public void addTestPrescription(@RequestBody TestPrescription testPrescription) {
		testPrescriptionService.addTestPrescription(testPrescription);

	}
	
	//Put 		--Update TestPrescription
	@PutMapping("/testprescriptions")
	public void updateTestPrescription(@RequestBody TestPrescription testPrescription) {
		testPrescriptionService.updateTestPrescription(testPrescription);
	}
	
	//Delete 		--Delete TestPrescription
	@DeleteMapping("/testprescriptions/{id}")
	public void deleteTestPrescription(@PathVariable Integer id) {
		testPrescriptionService.deleteTestPrescription(id);

	}
	
}
