package com.clinic.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinic.app.entity.MedicineList;
import com.clinic.app.service.IMedicineListService;

@CrossOrigin
@RequestMapping("/api")
@RestController
public class MedicineListController {
	@Autowired
	private IMedicineListService medicineListService;
	
	@GetMapping("/medicinelists")
	public List<MedicineList> getAllMedicineLists() {
			
		return (List<MedicineList>) medicineListService.getAllMedicineLists();
	}

	@GetMapping("/medicinelists/{id}")
	public Optional<MedicineList> selectMedicineListById(@PathVariable Integer id) {
		
		return medicineListService.selectMedicineListById(id);
	}

	@PutMapping("/medicinelists")
	public void updateMedicineList(@RequestBody MedicineList medicineList) {
		medicineListService.updateMedicineList(medicineList);
		
	}

	@PostMapping("/medicinelists")
	public void insertMedicineList(@RequestBody MedicineList medicineList) {
		medicineListService.insertMedicineList(medicineList);
		
	}

	@DeleteMapping("/medicinelists/{id}")
	public void deleteMedicineList(@PathVariable Integer id) {
		medicineListService.deleteMedicineList(id);
		
	}
	
	
}
