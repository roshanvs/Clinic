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

import com.clinic.app.entity.Appointment;
import com.clinic.app.entity.TestResult;
import com.clinic.app.service.IAppointmentService;
import com.clinic.app.service.ITestResultService;

@CrossOrigin //(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class TestResultController {

	@Autowired
	private ITestResultService testResultService;
	
	
	
	//Get All testresult
	@GetMapping("/testresults")
	public List<TestResult> getAllTestResult() {
		return testResultService.getAllTestResult();
	}
	
	
	//get testresult By Id
		@GetMapping("/testresults/{id}")
		public Optional<TestResult> getTestResultById(@PathVariable Integer id) {
			return testResultService.getTestResultById(id);
		}
	
	//Post 	--Insert testresult
	@PostMapping("/testresults")
	public void addTestResult(@RequestBody TestResult testResult) {
		testResultService.addTestResult(testResult);

	}
	
	//Put 		--Update testresult
	@PutMapping("/testresults")
	public void updateTestResult(@RequestBody TestResult testResult) {
		testResultService.updateTestResult(testResult);
	}
	
	//Delete 		--Delete Location
	@DeleteMapping("/testresults/{id}")
	public void deleteTestResult(@PathVariable Integer id) {
		testResultService.deleteTestResult(id);

	}
	
}
