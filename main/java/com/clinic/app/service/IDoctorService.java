package com.clinic.app.service;

import java.util.List;
import java.util.Optional;

import com.clinic.app.entity.Doctor;


public interface IDoctorService {

	//Get All Doctors
	public List<Doctor>getAllDoctor();
	
	//Insert
	public void addDoctor(Doctor doctor);
	
	//Update
	public void updateDoctor(Doctor doctor);
	
	//Delete Doctors
	public void deleteDoctor(Integer id);
	
	//Get  By ID
	public Optional <Doctor> getDoctorById(Integer id);
	
	public Doctor findByUserId(Integer userId);



	
}
