package com.clinic.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.app.entity.GeneralNote;
import com.clinic.app.repository.IGeneralNoteRepository;

@Service
public class GeneralNoteServiceImplementation implements IGeneralNoteService {

	// IoC

	@Autowired
	private IGeneralNoteRepository generalNoteRepository;

	@Override
	public List<GeneralNote> getAllGeneralNote() {
		return (List<GeneralNote>) generalNoteRepository.findAll();
	}

	@Override
	public void addGeneralNote(GeneralNote generalNote) {
		generalNoteRepository.save(generalNote);
	}

	@Override
	public void updateGeneralNote(GeneralNote generalNote) {
		generalNoteRepository.save(generalNote);

	}

	@Override
	public void deleteGeneralNote(Integer id) {
		generalNoteRepository.deleteById(id);

	}

	@Override
	public Optional<GeneralNote> getGeneralNoteById(Integer id) {
		return generalNoteRepository.findById(id);
	}

	@Override
	public GeneralNote findNoteByAppointment(Integer id) {
	
		return generalNoteRepository.findByAppointmentId(id);
	}

}
