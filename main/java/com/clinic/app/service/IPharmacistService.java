package com.clinic.app.service;

import java.util.List;
import java.util.Optional;

import com.clinic.app.entity.Pharmacist;

public interface IPharmacistService {
	public List<Pharmacist> getAllPharmacists();

	public Optional<Pharmacist> selectPharmacistById(Integer id);

	public void updatePharmacist(Pharmacist pharmacist);

	public void insertPharmacist(Pharmacist pharmacist);

	public void deletePharmacist(Integer id);

}
