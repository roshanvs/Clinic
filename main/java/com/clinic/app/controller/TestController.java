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


import com.clinic.app.entity.Test;
import com.clinic.app.service.ITestService;

@CrossOrigin
@RequestMapping("/api")
@RestController
public class TestController {
	@Autowired
	private ITestService testService;
	
	@GetMapping("/tests")
	public List<Test> getAllTests() {
			
		return (List<Test>) testService.getAllTests();
	}

	@GetMapping("/tests/{id}")
	public Optional<Test> selectTestById(@PathVariable Integer id) {
		
		return testService.selectTestById(id);}

	@PutMapping("/tests")
	public void updateTest(@RequestBody Test test) {
		testService.updateTest(test);
		
	}

	@PostMapping("/tests")
	public void insertTest(@RequestBody Test Test) {
		testService.insertTest(Test);
		
	}

	@DeleteMapping("/tests/{id}")
	public void deleteTest(@PathVariable Integer id) {
		testService.deleteTest(id);
		
	}
	
	
}
