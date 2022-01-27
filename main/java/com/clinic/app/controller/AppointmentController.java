package com.clinic.app.controller;

import java.time.LocalDate;
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

import com.clinic.app.dto.NoteDto;
import com.clinic.app.entity.Appointment;
import com.clinic.app.service.IAppointmentService;

@CrossOrigin //(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class AppointmentController {
	
	@Autowired
	private IAppointmentService appointmentService;
	
	//Get All Appointments
	@GetMapping("/appointments")
	public List<Appointment> getAllAppointment() {
		return appointmentService.getAllAppointment();
	}
	
	@GetMapping("/appointments/doctors/{id}")
	public List<Appointment> getAppointmentsByDoctor(@PathVariable Integer id){
		return appointmentService.findByDoctorId(id);
	}
	//get Appointment By Id
	@GetMapping("/appointments/{id}")
	public Optional<Appointment> getAppointmentById(@PathVariable Integer id) {
	return appointmentService.getAppointmentById(id);}
//		}
//	@GetMapping("/appointments/p/d/n/{id}")
//	public List<NoteDto> getNoteByPatient(@PathVariable Integer id){
//		return appointmentService.getNotesBypatient(id);
//	}
//	
	@GetMapping("/appointments/p/d/{patientid}&{doctorid}")
	public List<Integer> findByPatientIdAndDoctorId(@PathVariable ("patientid") Integer patientId, @PathVariable ("doctorid") Integer doctorId) {
		return appointmentService.findByPatientIdandDoctorId(patientId, doctorId);
		
	}

	@GetMapping("/appointments/date/{date}")
	public void findByDate(@PathVariable LocalDate date) {
	appointmentService.findByDate(date);
		
	}

	@GetMapping("/appointments/doctor/{doctorId}")
	public List<Appointment> findByDoctorId(@PathVariable Integer doctorId) {
		// TODO Auto-generated method stub
		return appointmentService.findByDoctorId(doctorId) ;
	}

	@GetMapping("/appointments/status/{status}")
	public List <Appointment>findByStatus(@PathVariable String status) {
		return appointmentService.findByStatus(status);
	}
	//Post 	--Insert Appointment
	@PostMapping("/appointments")
	public void addAppointment(@RequestBody Appointment appointment) {
		appointmentService.addAppointment(appointment);

	}
	
	//Put 		--Update Appointment
	@PutMapping("/appointments")
	public void updateAppointment(@RequestBody Appointment appointment) {
		appointmentService.updateAppointment(appointment);
	}
	
	//Delete 		--Delete Location
	@DeleteMapping("/appointments/{id}")
	public void deleteAppointment(@PathVariable Integer id) {
		appointmentService.deleteAppointment(id);

	}
}
