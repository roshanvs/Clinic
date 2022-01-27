package com.clinic.app.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.app.dto.NoteDto;
import com.clinic.app.entity.Appointment;
import com.clinic.app.repository.IAppointmentRepository;


@Service
public class AppointmentServiceImplementation implements IAppointmentService {

	//IoC
	
	@Autowired
	private IAppointmentRepository appointmentRepository;
	
	
	@Override
	public List<Appointment> getAllAppointment() {
		return (List<Appointment>)appointmentRepository.findAll();
		}

	@Override
	public void addAppointment(Appointment appointment) {
		appointmentRepository.save(appointment);
		}


	@Override
	public void updateAppointment(Appointment appointment) {
		appointmentRepository.save(appointment);

		}

	@Override
	public void deleteAppointment(Integer id) {
		appointmentRepository.deleteById(id);

	}

	@Override
	public Optional<Appointment> getAppointmentById(Integer id) {
		return appointmentRepository.findById(id);
	}

	

	@Override
	public void findByDate(LocalDate date) {
	appointmentRepository.findByDate(date);
		
	}

	

//	@Override
//	public List <Appointment>findByStatus(String status) {
//		appointmentRepository.findByStatus(status);
//	}

	@Override
	public List<Appointment> findByDoctorId(Integer doctorId) {
		
		return appointmentRepository.findByDoctorId(doctorId) ;
	}

	@Override
	public List<Appointment> findByStatus(String status) {
		return appointmentRepository.findByStatus(status);
	}

	@Override
	public List<Integer> findByPatientIdandDoctorId(Integer patientId, Integer doctorId) {
	
		return appointmentRepository.findByPatientIdAndDoctorId(patientId, doctorId);
	}

//	@Override
//	public List<NoteDto> getNotesBypatient(Integer id) {
//		
//		return appointmentRepository.fetchNoteDataInnerJoin(id);
//	}

	
	
}
