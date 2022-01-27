package com.clinic.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.app.entity.MedicalPrescription;
import com.clinic.app.entity.TestResult;
import com.clinic.app.repository.IMedicalPrescriptionRepository;
import com.clinic.app.repository.ITestResultRepository;
@Service
public class TestResultServiceImplementation implements ITestResultService {


	@Autowired
	private ITestResultRepository testResultRepository;
	
	
	@Override
	public List<TestResult> getAllTestResult() {
		return (List<TestResult>)testResultRepository.findAll();
		}

	@Override
	public void addTestResult(TestResult testResult) {
		testResultRepository.save(testResult);
		}

	@Override
	public void updateTestResult(TestResult testResult) {
		testResultRepository.save(testResult);

	}

	@Override
	public void deleteTestResult(Integer id) {
		testResultRepository.deleteById(id);

	}

	@Override
	public Optional<TestResult> getTestResultById(Integer id) {
		return testResultRepository.findById(id);
	}

}
