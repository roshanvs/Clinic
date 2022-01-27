package com.clinic.app.dto;

public class NoteDto {
	private Integer appointmentId;
	private String notes;
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
	public NoteDto(Integer appointmentId, String notes) {
		super();
		this.appointmentId = appointmentId;
		this.notes = notes;
	}
	public NoteDto() {
		super();
	}
	@Override
	public String toString() {
		return "NoteDto [appointmentId=" + appointmentId + ", notes=" + notes + "]";
	}
	
	
	
	
}
