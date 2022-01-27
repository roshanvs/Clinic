package com.clinic.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clinic.app.entity.TestList;

@Repository
public interface ITestListRepository extends CrudRepository<TestList,Integer > {
	

}
