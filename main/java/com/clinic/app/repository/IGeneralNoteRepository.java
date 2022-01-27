package com.clinic.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clinic.app.entity.GeneralNote;

@Repository
public interface IGeneralNoteRepository extends CrudRepository<GeneralNote, Integer>{

	@Query("from GeneralNote where appointmentId=?1")
	public GeneralNote findByAppointmentId(Integer id);
}
