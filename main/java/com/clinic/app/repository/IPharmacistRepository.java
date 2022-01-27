package com.clinic.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clinic.app.entity.Pharmacist;
@Repository
public interface IPharmacistRepository extends CrudRepository<Pharmacist, Integer>{

}
