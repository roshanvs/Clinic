package com.clinic.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.app.entity.Specialisation;
import com.clinic.app.repository.ISpecialisationRepository;
@Service
public class SpecialisationServiceImplementation implements ISpecialisationService {
	@Autowired
	private ISpecialisationRepository specialisationRepository;
	@Override
	public List<Specialisation> getAllSpecialisations() {
		
		return (List<Specialisation>) specialisationRepository.findAll();
	}

	@Override
	public Optional<Specialisation> selectSpecialisationById(Integer id) {
		
		return specialisationRepository.findById(id);
	}

	@Override
	public void updateSpecialisation(Specialisation specialisation) {
	    specialisationRepository.save(specialisation);
		
	}

	@Override
	public void insertSpecialisation(Specialisation specialisation) {
		specialisationRepository.save(specialisation);
		
	}

	@Override
	public void deleteSpecialisation(Integer id) {
		specialisationRepository.deleteById(id);
		
	}

}
