package com.clinic.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clinic.app.entity.Test;
@Repository
public interface ITestRepository extends CrudRepository<Test, Integer> {

}
