package com.clinic.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.app.entity.Receptionist;
import com.clinic.app.repository.IReceptionistRepository;
@Service
public class ReceptionistServiceImplementation implements IReceptionistService {
	@Autowired
	private IReceptionistRepository receptionistRepository;
	
	@Override
	public List<Receptionist> getAllReceptionists() {
		
		return (List<Receptionist> )receptionistRepository.findAll();
	}

	@Override
	public Optional<Receptionist> selectReceptionistById(Integer id) {
				
		return receptionistRepository.findById(id);
	}

	@Override
	public void updateReceptionist(Receptionist receptionist) {
		receptionistRepository.save(receptionist);
		
	}

	@Override
	public void insertReceptionist(Receptionist Receptionist) {
		receptionistRepository.save(Receptionist);
		
	}

	@Override
	public void deleteReceptionist(Integer id) {
		receptionistRepository.deleteById(id);
		
	}

}
