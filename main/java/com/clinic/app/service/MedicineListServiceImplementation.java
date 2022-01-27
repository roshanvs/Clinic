package com.clinic.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.app.entity.MedicineList;
import com.clinic.app.repository.IMedicineListRepository;

@Service
public class MedicineListServiceImplementation implements IMedicineListService{
	@Autowired
	private IMedicineListRepository medicineListRepository;
	
	 
	@Override
	public List<MedicineList> getAllMedicineLists() {
			
		return (List<MedicineList>) medicineListRepository.findAll();
	}

	@Override
	public Optional<MedicineList> selectMedicineListById(Integer id) {
		
		return medicineListRepository.findById(id);
	}

	@Override
	public void updateMedicineList(MedicineList medicineList) {
		medicineListRepository.save(medicineList);
		
	}

	@Override
	public void insertMedicineList(MedicineList medicineList) {
		medicineListRepository.save(medicineList);
		
	}

	@Override
	public void deleteMedicineList(Integer id) {
		medicineListRepository.deleteById(id);
		
	}
	
	 
	
	
}
