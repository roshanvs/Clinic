package com.clinic.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.app.entity.GeneralNote;
import com.clinic.app.entity.TestList;
import com.clinic.app.repository.IGeneralNoteRepository;
import com.clinic.app.repository.ITestListRepository;
@Service
public class TestListServiceImplementation implements ITestListService {

	@Autowired
	private ITestListRepository testListRepository;

	
	@Override
	public List<TestList> getAllTestList() {
		return (List<TestList>) testListRepository.findAll();
		}

	@Override
	public void addTestList(TestList testList) {
		testListRepository.save(testList);
		}


	@Override
	public void updateTestList(TestList testList) {
		testListRepository.save(testList);

	}

	@Override
	public void deleteTestList(Integer id) {
		testListRepository.deleteById(id);

		}

	@Override
	public Optional<TestList> getTestListById(Integer id) {
		return testListRepository.findById(id);
	}

}
