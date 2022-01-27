package com.clinic.app.service;

import java.util.List;
import java.util.Optional;

import com.clinic.app.entity.Medicine;

public interface IMedicineService {
	public List<Medicine> getAllMedicines();

	public Optional<Medicine> selectMedicineById(Integer id);

	public void updateMedicine(Medicine medicine);

	public void insertMedicine(Medicine medicine);

	public void deleteMedicine(Integer id);
	
}
