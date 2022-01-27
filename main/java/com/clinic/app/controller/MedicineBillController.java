//package com.clinic.app.controller;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.clinic.app.entity.MedicineBill;
//import com.clinic.app.service.IMedicineBillService;
//@CrossOrigin
//@RestController
//@RequestMapping("/api")
//public class MedicineBillController {
//	@Autowired
//	private IMedicineBillService medicineBillService;
//
//	@GetMapping("/medicinebills")
//	public List<MedicineBill> getAllMedicineBills() {
//		
//		return (List<MedicineBill>) medicineBillService.getAllMedicineBills();
//	}
//
//	@GetMapping("/medicinebills/{id}")
//	public Optional<MedicineBill> selectMedicineBillById(@PathVariable Integer id) {
//		
//		return medicineBillService.selectMedicineBillById(id);
//	}
//
//	@PutMapping("/medicinebills")
//	public void updateMedicineBill(@RequestBody MedicineBill medicineBill) {
//		medicineBillService.updateMedicineBill(medicineBill);
//		
//	}
//
//	@PostMapping("/medicinebills")
//	public void insertMedicineBill (@RequestBody MedicineBill medicineBill) {
//		medicineBillService.insertMedicineBill(medicineBill);
//		
//	}
//
//	@DeleteMapping("/medicinebills/{id}")
//	public void deleteMedicineBill(@PathVariable Integer id) {
//		medicineBillService.deleteMedicineBill(id); 
//		
//	}
//
//
//
//}
