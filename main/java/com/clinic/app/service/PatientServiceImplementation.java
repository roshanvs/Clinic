package com.clinic.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.app.entity.Patient;
import com.clinic.app.repository.IPatientRepository;
@Service
public class PatientServiceImplementation implements IPatientService{
	@Autowired
	private IPatientRepository patientRepository;
	
	@Override
	public List<Patient> getAllPatients() {
		
		return (List<Patient>) patientRepository.findAll();
	}

	@Override
	public Optional<Patient> selectPatientById(Integer id) {
		
		return patientRepository.findById(id);
	}

	@Override
	public void updatePatient(Patient patient) {
		patientRepository.save(patient);
		
	}

	@Override
	public void insertPatient(Patient patient) {
		patientRepository.save(patient);
		
	}

	@Override
	public void deletePatient(Integer id) {
		patientRepository.deleteById(id);
		
	}

}
