package com.clinic.app.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity

@Table(name = "appointments")
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer appointmentId;
	private Integer patientId;
	private Integer doctorId;
	@Column(nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate date;

	private String status;
	private Integer tokken;
	// private DateTimeFormat time;
	private Integer receptionistId;

	public Appointment(Integer appointmentId, Integer patientId, Integer doctorId, LocalDate date, String status,
			Integer tokken, Integer receptionistId, Doctor doctor, Receptionist receptionist, Patient patient) {
		super();
		this.appointmentId = appointmentId;
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.date = date;
		this.status = status;
		this.tokken = tokken;

		this.receptionistId = receptionistId;
		this.doctor = doctor;
		this.receptionist = receptionist;
		this.patient = patient;
	}

	//if there are multiple back references in each class, first one should be default and next ones should be given values
	// in case of multiple managed references, a list in the class is tracked and if the same list occurs again then jSon ignore should be given and tracked
	public Appointment() {

	}

	@ManyToOne
	@JoinColumn(name = "doctorId", insertable = false, updatable = false)
	private Doctor doctor;

	@ManyToOne
	@JoinColumn(name = "receptionistId", insertable = false, updatable = false)
	private Receptionist receptionist;

	@ManyToOne
	@JoinColumn(name = "patientId", insertable = false, updatable = false)
	private Patient patient;

	public Integer getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(Integer appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public Integer getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getTokken() {
		return tokken;
	}

	public void setTokken(Integer tokken) {
		this.tokken = tokken;
	}

	public Integer getReceptionistId() {
		return receptionistId;
	}

	public void setReceptionistId(Integer receptionistId) {
		this.receptionistId = receptionistId;
	}

	@JsonBackReference
	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	@JsonBackReference(value="R")
	public Receptionist getReceptionist() {
		return receptionist;
	}

	public void setReceptionist(Receptionist receptionist) {
		this.receptionist = receptionist;
	}

	@JsonBackReference(value="P")
	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

}
