package com.clinic.app.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clinic.app.entity.Doctor;
@Repository
public interface IDoctorRepository extends CrudRepository<Doctor, Integer>{

	
	//Custom Query Method
	@Query("from Doctor where userId=?1")
	Doctor findByUserId(Integer user);
	
	
}
