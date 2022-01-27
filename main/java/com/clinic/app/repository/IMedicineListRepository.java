package com.clinic.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clinic.app.entity.MedicineList;
@Repository
public interface IMedicineListRepository extends CrudRepository<MedicineList, Integer>{

}
