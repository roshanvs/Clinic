package com.clinic.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.app.entity.MedicalPrescription;
import com.clinic.app.entity.User;
import com.clinic.app.repository.IUserRespository;


@Service
public class UserServiceImplementation implements IUserService {

	@Autowired
	private IUserRespository userRepository;
	
	
	@Override
	public List<User> getAllUser() {
		return (List<User>)userRepository.findAll();
	}

	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}

	@Override
	public User findByEmailAndPassword(String email, String password) {
		return userRepository.findByEmailAndPassword(email, password);
	}
	
	@Override
	public void updateUser(User user) {
		userRepository.save(user);

	}

	//no id is inserted
	@Override
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);

	}


	@Override
		public Optional<User> getUserById(Integer id) {
			return userRepository.findById(id);
			}



}
