package com.clinic.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.app.entity.Test;
import com.clinic.app.repository.ITestRepository;
@Service
public class TestServiceImplementation implements ITestService{
	@Autowired
	private ITestRepository testRepository;
		
	@Override
	public List<Test> getAllTests() {
		
		return (List<Test>) testRepository.findAll();
	}

	@Override
	public Optional<Test> selectTestById(Integer id) {
		
		return testRepository.findById(id);
	}

	@Override
	public void updateTest(Test test) {
		testRepository.save(test);
		
	}

	@Override
	public void insertTest(Test test) {
		testRepository.save(test);
		
	}

	@Override
	public void deleteTest(Integer id) {
		testRepository.deleteById(id);	
	}
	
}
