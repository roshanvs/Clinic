package com.clinic.app.service;

import java.util.List;
import java.util.Optional;

import com.clinic.app.entity.MedicineList;

public interface IMedicineListService {
	public List<MedicineList> getAllMedicineLists();

	public Optional<MedicineList> selectMedicineListById(Integer id);

	public void updateMedicineList(MedicineList medicineList);

	public void insertMedicineList(MedicineList medicineList);

	public void deleteMedicineList(Integer id);

}
