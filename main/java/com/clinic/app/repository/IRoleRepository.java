package com.clinic.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clinic.app.entity.Role;



@Repository
public interface IRoleRepository extends CrudRepository<Role, Integer>{

}
