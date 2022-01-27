package com.clinic.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinic.app.entity.User;
import com.clinic.app.service.IUserService;

@CrossOrigin //(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")

public class UserController {

	@Autowired
	private IUserService userService;
	
	//Get All user
		@GetMapping("/users")
		public List<User> getAllUser() {
			return userService.getAllUser();
		}
		
		
		//get user By Id
			@GetMapping("/users/{id}")
			public Optional<User> getUserById(@PathVariable Integer id) {
				return userService.getUserById(id);
			}
		
		//Post 	--Insert user
		@PostMapping("/users")
		public void addUser(@RequestBody User user) {
			userService.addUser(user);

		}
		@GetMapping("/users/emailpassword/{email}&{password}")
		public ResponseEntity<User>getUserByEmailAndPassword(
			@PathVariable ("email") String email,
			@PathVariable ("password") String password) {
				
			System.out.println("User name Password ...."+ email + password);
			
			//Declare Responsibility
			ResponseEntity<User> response = null;
			User user =userService.findByEmailAndPassword(email, password);
			
			if(user==null) {
				response = new ResponseEntity<>(user,HttpStatus.NOT_FOUND);
			}else {
				response= new ResponseEntity<User>(user,HttpStatus.OK);
			}
			return response;
		}
		
		
		//Put 		--Update user
		@PutMapping("/users")
		public void updateUser(@RequestBody User user) {
			userService.updateUser(user);
		}
		
		//Delete 		--Delete user
		@DeleteMapping("/users/{id}")
		public void deleteUser(@PathVariable Integer id) {
			userService.deleteUser(id);

		}
	
}
