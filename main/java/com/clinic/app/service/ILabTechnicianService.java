package com.clinic.app.service;

import java.util.List;
import java.util.Optional;

import com.clinic.app.entity.LabTechnician;


public interface ILabTechnicianService {

	
	//Get All LabTechnicians
	public List<LabTechnician>getAllLabTechnician();
	
	//Insert
	public void addLabTechnician(LabTechnician labTechnician);
	
	//Update
	public void updateLabTechnician(LabTechnician labTechnician);
	
	//Delete LabTechnicians
	public void deleteLabTechnician(Integer id);
	
	//Get  By ID
	public Optional <LabTechnician> getLabTechnicianById(Integer id);

}
