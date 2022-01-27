package com.clinic.app.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clinic.app.entity.User;
@Repository
public interface IUserRespository extends CrudRepository<User, Integer> {

	//Custom Query Method
	@Query("FROM User WHERE email=?1 AND password=?2")
	User findByEmailAndPassword(String email, String password);

}
