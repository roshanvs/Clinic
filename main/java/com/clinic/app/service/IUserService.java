package com.clinic.app.service;

import java.util.List;
import java.util.Optional;

import com.clinic.app.entity.User;

public interface IUserService {

	
	//Get All User
	public List<User>getAllUser();
	
	//Insert
	public void addUser(User user);
	
	//Update
	public void updateUser(User user);
	
	//Get User By UserName and Password
		public User findByEmailAndPassword(String email,String password);
		
	//Delete User
	public void deleteUser(Integer id);
	
	//Get  By ID
	public Optional <User> getUserById(Integer id);


}
