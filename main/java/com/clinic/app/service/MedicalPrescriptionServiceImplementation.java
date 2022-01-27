package com.clinic.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.clinic.app.entity.MedicalPrescription;
import com.clinic.app.repository.IMedicalPrescriptionRepository;
@Service
public class MedicalPrescriptionServiceImplementation implements IMedicalPrescriptionService {

	@Autowired
	private IMedicalPrescriptionRepository medicalPrescriptionRepository;
	
	
	@Override
	public List<MedicalPrescription> getAllMedicalPrescription() {
		return (List<MedicalPrescription>)medicalPrescriptionRepository.findAll();
	}

	@Override
	public void addMedicalPrescription(MedicalPrescription medicalPrescription) {
		medicalPrescriptionRepository.save(medicalPrescription);
	}


	@Override
	public void updateMedicalPrescription(MedicalPrescription medicalPrescription) {
		medicalPrescriptionRepository.save(medicalPrescription);

	}

	@Override
	public void deleteMedicalPrescription(Integer id) {
		medicalPrescriptionRepository.deleteById(id);

	}

	@Override
	public Optional<MedicalPrescription> getMedicalPrescriptionById(Integer id) {
		return medicalPrescriptionRepository.findById(id);
		}

	

}
