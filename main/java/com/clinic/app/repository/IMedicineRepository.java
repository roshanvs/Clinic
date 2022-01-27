package com.clinic.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clinic.app.entity.Medicine;
@Repository
public interface IMedicineRepository extends CrudRepository<Medicine, Integer>{

}
