package com.clinic.app.service;

import java.util.List;
import java.util.Optional;


import com.clinic.app.entity.Specialisation;

public interface ISpecialisationService {

	public List<Specialisation> getAllSpecialisations();

	public Optional<Specialisation> selectSpecialisationById(Integer id);

	public void updateSpecialisation(Specialisation specialisation);

	public void insertSpecialisation(Specialisation specialisation);

	public void deleteSpecialisation(Integer id);

}