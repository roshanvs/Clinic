package com.clinic.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clinic.app.entity.TestPrescription;
@Repository
public interface ITestPrescriptionRepository extends CrudRepository<TestPrescription, Integer>{

}
