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

import com.clinic.app.entity.GeneralNote;
import com.clinic.app.entity.TestList;
import com.clinic.app.service.IGeneralNoteService;
import com.clinic.app.service.ITestListService;

@CrossOrigin //(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")

public class TestListController {
	
	@Autowired
	private ITestListService testListService;
	
	//Get All GeneralNote
			@GetMapping("/testlists")
			public List<TestList> getAllTestList() {
				return testListService.getAllTestList();
			}
			
			
			//get GeneralNote By Id
				@GetMapping("/testlists/{id}")
				public Optional<TestList> getTestListById(@PathVariable Integer id) {
					return testListService.getTestListById(id);
				}
			
			//Post 	--Insert GeneralNote
			@PostMapping("/testlists")
			public void addTestList(@RequestBody TestList testList) {
				testListService.addTestList(testList);

			}
			
			//Put 		--Update GeneralNote
			@PutMapping("/testlists")
			public void updateTestList(@RequestBody TestList testList) {
				testListService.updateTestList(testList);
			}
			
			//Delete 		--Delete Location
			@DeleteMapping("/testlists/{id}")
			public void deleteTestList(@PathVariable Integer id) {
				testListService.deleteTestList(id);

			}

}
