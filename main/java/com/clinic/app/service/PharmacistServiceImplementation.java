package com.clinic.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.app.entity.Pharmacist;
import com.clinic.app.repository.IPharmacistRepository;

@Service
public class PharmacistServiceImplementation implements IPharmacistService {
	@Autowired
private IPharmacistRepository pharmacistRepository;

@Override
public List<Pharmacist> getAllPharmacists() {
	
	return (List<Pharmacist>)pharmacistRepository.findAll() ;
}

@Override
public Optional<Pharmacist> selectPharmacistById(Integer id) {
	
	return pharmacistRepository.findById(id);
}

@Override
public void updatePharmacist(Pharmacist pharmacist) {
	pharmacistRepository.save(pharmacist);
	
}

@Override
public void insertPharmacist(Pharmacist pharmacist) {
	 pharmacistRepository.save(pharmacist);
	
}

@Override
public void deletePharmacist(Integer id) {
	pharmacistRepository.deleteById(id);
	
}
	
}
