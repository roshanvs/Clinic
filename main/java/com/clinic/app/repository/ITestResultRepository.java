package com.clinic.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clinic.app.entity.TestResult;
@Repository
public interface ITestResultRepository extends CrudRepository<TestResult, Integer> {

}
