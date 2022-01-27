package com.clinic.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clinic.app.entity.MedicalPrescription;

@Repository
public interface IMedicalPrescriptionRepository extends CrudRepository<MedicalPrescription, Integer>{

}
