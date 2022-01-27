package com.clinic.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.app.entity.LabTechnician;
import com.clinic.app.entity.MedicalPrescription;
import com.clinic.app.repository.ILabTechnicianRepository;
import com.clinic.app.repository.IMedicalPrescriptionRepository;
@Service
public class LabTechnicianServiceImplementation implements ILabTechnicianService {


	@Autowired
	private ILabTechnicianRepository labTechnicianRepository;
	
	@Override
	public List<LabTechnician> getAllLabTechnician() {
		return (List<LabTechnician>)labTechnicianRepository.findAll();
		}

	@Override
	public void addLabTechnician(LabTechnician labTechnician) {
		labTechnicianRepository.save(labTechnician);
		}

	@Override
	public void updateLabTechnician(LabTechnician labTechnician) {
		labTechnicianRepository.save(labTechnician);

	}

	@Override
	public void deleteLabTechnician(Integer id) {
		labTechnicianRepository.deleteById(id);

	}

	@Override
	public Optional<LabTechnician> getLabTechnicianById(Integer id) {
		return labTechnicianRepository.findById(id);
	}

}
