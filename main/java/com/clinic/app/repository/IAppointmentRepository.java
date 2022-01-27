package com.clinic.app.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clinic.app.dto.NoteDto;
import com.clinic.app.entity.Appointment;

@Repository
public interface IAppointmentRepository extends CrudRepository<Appointment, Integer>{
	
	
	//custom method for Search by Date
	//@Query("FROM Appointment WHERE date=?1")
	List<Appointment> findByDate(LocalDate date);
	
	
	//custom method to search by patientId and DoctorId
	@Query("select appointmentId FROM Appointment WHERE patientId=?1 AND doctorId=?2")
	List<Integer> findByPatientIdAndDoctorId(Integer patientId, Integer doctorId);

	//custom method to search by doctorId
	@Query("FROM Appointment WHERE doctorId=?1")
	List<Appointment> findByDoctorId(Integer doctorId);
	
	////custom method to search by status
	//@Query("FROM Appointment WHERE status=?1")
	List<Appointment> findByStatus(String status);
	
	

//	@Query("SELECT new com.clinic.app.dto.NoteDto(a.appointmentId, n.notes) "
//			+ "FROM Appointment a  INNER JOIN a.notes n where a.patientId=?1")
//	List<NoteDto> fetchNoteDataInnerJoin(Integer id);
}
