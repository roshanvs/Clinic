package com.clinic.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.app.entity.GeneralNote;
import com.clinic.app.entity.TestPrescription;
import com.clinic.app.repository.IGeneralNoteRepository;
import com.clinic.app.repository.ITestPrescriptionRepository;

@Service
public class TestPrescriptionServiceImplementation implements ITestPrescriptionService {

	@Autowired
	private ITestPrescriptionRepository testPrescriptionRepository;

	
	@Override
	public List<TestPrescription> getAllTestPrescription() {
		return (List<TestPrescription>) testPrescriptionRepository.findAll();
		}

	@Override
	public void addTestPrescription(TestPrescription testPrescription) {
		testPrescriptionRepository.save(testPrescription);
	}


	@Override
	public void updateTestPrescription(TestPrescription testPrescription) {
		testPrescriptionRepository.save(testPrescription);

	}

	@Override
	public void deleteTestPrescription(Integer id) {
		testPrescriptionRepository.deleteById(id);

	}

	@Override
	public Optional<TestPrescription> getTestPrescriptionById(Integer id) {
		return testPrescriptionRepository.findById(id);
		}

}
