package com.clinic.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clinic.app.entity.Receptionist;
@Repository
public interface IReceptionistRepository extends CrudRepository<Receptionist, Integer>{

}
