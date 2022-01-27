package com.clinic.app.service;

import java.util.List;
import java.util.Optional;

import com.clinic.app.entity.Appointment;
import com.clinic.app.entity.TestPrescription;

public interface ITestPrescriptionService {


	//Get All Test Prescription
		public List<TestPrescription>getAllTestPrescription();
		
		//Insert
		public void addTestPrescription(TestPrescription testPrescription);
		
		//Update
		public void updateTestPrescription(TestPrescription testPrescription);
		
		//Delete Appointments
		public void deleteTestPrescription(Integer id);
		
		//Get  By ID
		public Optional <TestPrescription> getTestPrescriptionById(Integer id);
}
