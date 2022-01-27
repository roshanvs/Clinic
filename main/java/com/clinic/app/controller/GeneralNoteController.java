package com.clinic.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.clinic.app.entity.GeneralNote;

import com.clinic.app.service.IGeneralNoteService;

@CrossOrigin //(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class GeneralNoteController {

	@Autowired
	private IGeneralNoteService generalNoteService;
	
	
	//Get All GeneralNote
		@GetMapping("/generalnotes")
		public List<GeneralNote> getAllGeneralNote() {
			return generalNoteService.getAllGeneralNote();
		}
		@GetMapping("/generalnotes/notes/{id}")
		public GeneralNote getNoteByAppointment(@PathVariable Integer id) {
			return generalNoteService.findNoteByAppointment(id);
		}
		
		
		//get GeneralNote By Id
			@GetMapping("/generalnotes/{id}")
			public Optional<GeneralNote> getGeneralNoteById(@PathVariable Integer id) {
				return generalNoteService.getGeneralNoteById(id);
			}
		
		//Post 	--Insert GeneralNote
		@PostMapping("/generalnotes")
		public void addGeneralNote(@RequestBody GeneralNote generalNote) {
			generalNoteService.addGeneralNote(generalNote);

		}
		
		//Put 		--Update GeneralNote
		@PutMapping("/generalnotes")
		public void updateGeneralNote(@RequestBody GeneralNote generalNote) {
			generalNoteService.updateGeneralNote(generalNote);
		}
		
		//Delete 		--Delete Location
		@DeleteMapping("/generalnotes/{id}")
		public void deleteGeneralNote(@PathVariable Integer id) {
			generalNoteService.deleteGeneralNote(id);

		}
	
}
