package com.clinic.app.service;

import java.util.List;
import java.util.Optional;


import com.clinic.app.entity.TestResult;

public interface ITestResultService {

	//Get All TestResult
	public List<TestResult>getAllTestResult();
	
	//Insert
	public void addTestResult(TestResult testResult);
	
	//Update
	public void updateTestResult(TestResult testResult);
	
	//Delete TestResult
	public void deleteTestResult(Integer id);
	
	//Get  By ID
	public Optional <TestResult> getTestResultById(Integer id);

	
}
