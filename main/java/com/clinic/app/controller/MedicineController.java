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

import com.clinic.app.entity.Medicine;
import com.clinic.app.service.IMedicineService;

@CrossOrigin
@RequestMapping("/api")
@RestController
public class MedicineController {
	
	@Autowired
	private IMedicineService medicineService;
		
@GetMapping("/medicines")	
public List<Medicine> getAllMedicines() {
		
		return (List<Medicine>) medicineService.getAllMedicines();
	}

	@GetMapping("/medicines/{id}")
	public Optional<Medicine> selectMedicineById(@PathVariable Integer id) {
		
		return medicineService.selectMedicineById(id);
	}

	@PutMapping("/medicines")
	public void updateMedicine(@RequestBody Medicine medicine) {
		medicineService.updateMedicine(medicine);		
	}

	@PostMapping("/medicines")
	public void insertMedicine(@RequestBody Medicine medicine) {
		
		medicineService.insertMedicine(medicine);
	}

	@DeleteMapping("/medicines/{id}")
	public void deleteMedicine(@PathVariable Integer id) {
		medicineService.deleteMedicine(id);
	}
	
	

}
