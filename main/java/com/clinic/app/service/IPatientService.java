package com.clinic.app.service;

import java.util.List;
import java.util.Optional;

import com.clinic.app.entity.Patient;


public interface IPatientService {
	public List<Patient> getAllPatients();

	public Optional<Patient> selectPatientById(Integer id);

	public void updatePatient(Patient patient);

	public void insertPatient(Patient patient);

	public void deletePatient(Integer id);

}
