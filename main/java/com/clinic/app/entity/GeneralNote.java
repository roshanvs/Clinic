package com.clinic.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "generalNotes")
public class GeneralNote {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer noteId;
	private Integer appointmentId;
	private String notes;
	@OneToOne
	@JoinColumn(name = "appointmentId", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private Appointment appointment;
	

	public Integer getNoteId() {
		return noteId;
	}

	public void setNoteId(Integer noteId) {
		this.noteId = noteId;
	}

	public Integer getAppointmentId() {
		
		return appointmentId;
	}

	public void setAppointmentId(Integer appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	@JsonBackReference
	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	@Override
	public String toString() {
		return "GeneralNote [noteId=" + noteId + ", appointmentId=" + appointmentId + ", notes=" + notes
				+ ", appointment=" + appointment + "]";
	}

	public GeneralNote(Integer noteId, Integer appointmentId, String notes, Appointment appointment) {
		super();
		this.noteId = noteId;
		this.appointmentId = appointmentId;
		this.notes = notes;
		this.appointment = appointment;
	}

	public GeneralNote() {

	}

	

	
}
