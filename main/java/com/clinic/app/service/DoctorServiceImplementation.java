package com.clinic.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.app.entity.Doctor;
import com.clinic.app.entity.MedicalPrescription;
import com.clinic.app.repository.IDoctorRepository;
import com.clinic.app.repository.IMedicalPrescriptionRepository;
@Service
public class DoctorServiceImplementation implements IDoctorService {
	@Autowired
	private IDoctorRepository doctorRepository;
	
	
	@Override
	public List<Doctor> getAllDoctor() {
		return (List<Doctor>)doctorRepository.findAll();
	}

	@Override
	public void addDoctor(Doctor doctor) {
		doctorRepository.save(doctor);
		}

	@Override
	public void updateDoctor(Doctor doctor) {
		doctorRepository.save(doctor);

	}

	@Override
	public void deleteDoctor(Integer id) {
		doctorRepository.deleteById(id);

		}

	@Override
	public Optional<Doctor> getDoctorById(Integer id) {
		return doctorRepository.findById(id);
	}

	@Override
	public Doctor findByUserId(Integer userId) {
		
		return doctorRepository.findByUserId(userId);
	}

}
