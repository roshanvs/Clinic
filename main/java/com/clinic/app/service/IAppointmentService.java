package com.clinic.app.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.clinic.app.dto.NoteDto;
import com.clinic.app.entity.Appointment;



public interface IAppointmentService {
	
	//Get All Appointments
		public List<Appointment>getAllAppointment();
//		
//		public List<NoteDto> getNotesBypatient(Integer id);
//		//Insert
		public void addAppointment(Appointment appointment);
		
		//Update
		public void updateAppointment(Appointment appointment);
		
		//Delete Appointments
		public void deleteAppointment(Integer id);
		
		//Get  By ID
		public Optional <Appointment> getAppointmentById(Integer id);

		//Get By Patient Id
		public List<Integer> findByPatientIdandDoctorId(Integer patientId, Integer doctorId);
		
		//Get by Appointment Date
		public void findByDate(LocalDate date);
		
		//Get By Doctor Id
		public List<Appointment>findByDoctorId(Integer doctorId);
		
		//Get By Appointment Status
		public List<Appointment> findByStatus(String status); 
}
