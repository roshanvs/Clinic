package com.clinic.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.app.entity.Medicine;


import com.clinic.app.repository.IMedicineRepository;

@Service
public class MedicineServiceImplementation implements IMedicineService{
	@Autowired
	private IMedicineRepository medicineRepository;

	@Override
	public List<Medicine> getAllMedicines() {
		
		return (List<Medicine>) medicineRepository.findAll();
	}

	@Override
	public Optional<Medicine> selectMedicineById(Integer id) {
		
		return medicineRepository.findById(id);
	}

	@Override
	public void updateMedicine(Medicine medicine) {
		medicineRepository.save(medicine);
		
	}

	@Override
	public void insertMedicine(Medicine medicine) {
		medicineRepository.save(medicine);
		
	}

	@Override
	public void deleteMedicine(Integer id) {
		medicineRepository.deleteById(id);
	}
	
	
	 

	 
	
	
}