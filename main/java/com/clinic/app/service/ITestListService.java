package com.clinic.app.service;

import java.util.List;
import java.util.Optional;

import com.clinic.app.entity.TestList;

public interface ITestListService {
	//Get All Appointments
			public List<TestList>getAllTestList();
			
			//Insert
			public void addTestList(TestList testList);
			
			//Update
			public void updateTestList(TestList testList);
			
			//Delete Appointments
			public void deleteTestList(Integer id);
			
			//Get  By ID
			public Optional <TestList> getTestListById(Integer id);


}
