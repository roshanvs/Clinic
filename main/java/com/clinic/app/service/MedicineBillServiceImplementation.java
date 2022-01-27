//package com.clinic.app.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//
//import com.clinic.app.entity.MedicineBill;
//import com.clinic.app.repository.IMedicineBillRepository;
//
//
//@Service
//public class MedicineBillServiceImplementation implements IMedicineBillService{
//
//	@Autowired
//	private IMedicineBillRepository medicineBillRepository;
//	
//	@Override
//	public List<MedicineBill> getAllMedicineBills() {
//		
//		return (List<MedicineBill>) medicineBillRepository.findAll();
//	}
//
//	@Override
//	public Optional<MedicineBill> selectMedicineBillById(Integer id) {
//		
//		return medicineBillRepository.findById(id);
//	}
//
//	@Override
//	public void updateMedicineBill(MedicineBill medicineBill) {
//		medicineBillRepository.save(medicineBill);
//		
//	}
//
//	@Override
//	public void insertMedicineBill(MedicineBill medicineBill) {
//		medicineBillRepository.save(medicineBill);
//		
//	}
//
//	@Override
//	public void deleteMedicineBill(Integer id) {
//		medicineBillRepository.deleteById(id);
//		
//	}
//	
//	
//	
//	
//}
