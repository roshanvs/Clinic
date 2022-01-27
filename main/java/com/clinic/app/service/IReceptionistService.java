package com.clinic.app.service;

import java.util.List;
import java.util.Optional;


import com.clinic.app.entity.Receptionist;

public interface IReceptionistService {

	public List<Receptionist> getAllReceptionists();

	public Optional<Receptionist> selectReceptionistById(Integer id);

	public void updateReceptionist(Receptionist receptionist);

	public void insertReceptionist(Receptionist Receptionist);

	public void deleteReceptionist(Integer id);

}
