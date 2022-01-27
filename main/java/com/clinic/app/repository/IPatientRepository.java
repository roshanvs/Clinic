package com.clinic.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clinic.app.entity.Patient;
@Repository
public interface IPatientRepository extends CrudRepository<Patient, Integer>{

}
