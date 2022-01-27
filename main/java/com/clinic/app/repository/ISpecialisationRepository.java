package com.clinic.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clinic.app.entity.Specialisation;



@Repository
public interface ISpecialisationRepository extends CrudRepository<Specialisation, Integer>{

}
