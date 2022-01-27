package com.clinic.app.service;

import java.util.List;
import java.util.Optional;


import com.clinic.app.entity.Test;

public interface ITestService {
	public List<Test> getAllTests();

	public Optional<Test> selectTestById(Integer id);

	public void updateTest(Test test);

	public void insertTest(Test test);

	public void deleteTest(Integer id);

}
	
	


