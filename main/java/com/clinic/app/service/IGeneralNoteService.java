package com.clinic.app.service;

import java.util.List;
import java.util.Optional;

import com.clinic.app.entity.GeneralNote;

public interface IGeneralNoteService {
	
	//Get All General Note
			public List<GeneralNote>getAllGeneralNote();
			
			//Insert
			public void addGeneralNote(GeneralNote generalNote);
			
			//Update
			public void updateGeneralNote(GeneralNote generalNote);
			
			//Delete GeneralNotes
			public void deleteGeneralNote(Integer id);
			
			//Get  By ID
			public Optional <GeneralNote> getGeneralNoteById(Integer id);
			
			public GeneralNote findNoteByAppointment(Integer id);

			
}
