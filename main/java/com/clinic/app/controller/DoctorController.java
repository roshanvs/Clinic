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

import com.clinic.app.entity.Appointment;
import com.clinic.app.entity.Doctor;
import com.clinic.app.service.IAppointmentService;
import com.clinic.app.service.IDoctorService;

@CrossOrigin //(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class DoctorController {
	
	@Autowired
	private IDoctorService doctorService;
	
	//Get All Doctors
	@GetMapping("/doctors")
	public List<Doctor> getAllDoctor() {
		return doctorService.getAllDoctor();
	}
	
	@GetMapping("/doctors/userid/{id}")
	public Doctor findByUserId(@PathVariable Integer id) {
		return doctorService.findByUserId(id);
	}
	
	
	//get Doctor By Id
		@GetMapping("/doctors/{id}")
		public Optional<Doctor> getDoctorById(@PathVariable Integer id) {
			return doctorService.getDoctorById(id);
		}
	
	//Post 	--Insert Doctor
	@PostMapping("/doctors")
	public void addDoctor(@RequestBody Doctor doctor) {
		doctorService.addDoctor(doctor);

	}
	
	//Put 		--Update Doctor
	@PutMapping("/doctors")
	public void updateDoctor(@RequestBody Doctor doctor) {
		doctorService.updateDoctor(doctor);
	}
	
	//Delete 		--Delete Location
	@DeleteMapping("/doctors/{id}")
	public void deleteDoctor(@PathVariable Integer id) {
		doctorService.deleteDoctor(id);

	}

}
