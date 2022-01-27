package com.clinic.app.service;

import java.util.List;
import java.util.Optional;

import com.clinic.app.entity.MedicalPrescription;

public interface IMedicalPrescriptionService {
	
	//Get All MedicalPrescriptions
	public List<MedicalPrescription> getAllMedicalPrescription();
	
	//Insert
	public void addMedicalPrescription(MedicalPrescription medicalPrescription);
	
	//Update
	public void updateMedicalPrescription(MedicalPrescription medicalPrescription);
	
	//Delete Appointments
	public void deleteMedicalPrescription(Integer id);
	
	//Get  By ID
	public Optional<MedicalPrescription> getMedicalPrescriptionById(Integer id);


}
