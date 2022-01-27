package com.clinic.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clinic.app.entity.LabTechnician;
@Repository
public interface ILabTechnicianRepository extends CrudRepository<LabTechnician, Integer>{

}
