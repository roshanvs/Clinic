package com.clinic.app.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "doctors")
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer doctorId;
	private Integer specialisationId;
	@OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
	private List<Appointment> appointments;
	@ManyToOne
	@JoinColumn(name = "specialisationId", updatable = false, insertable = false)
	private Specialisation specialization;

	private int userId;
	@OneToOne
	@JoinColumn(name = "userId", insertable = false, updatable = false)
	private User user;

	public Doctor() {

	}

	public Doctor(Integer doctorId, Integer specialisationId, List<Appointment> appointments,
			Specialisation specialization, int userId, User user) {
		super();
		this.doctorId = doctorId;
		this.specialisationId = specialisationId;
		this.appointments = appointments;
		this.specialization = specialization;
		this.userId = userId;
		this.user = user;
	}

	public Integer getDoctorId() {
		return doctorId;
	}

	@JsonIgnore
	@JsonManagedReference
	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	public Integer getSpecialisationId() {
		return specialisationId;
	}

	public Specialisation getSpecialisation() {
		return specialization;
	}

	public void setSpecialisation(Specialisation specialisation) {
		this.specialization = specialisation;
	}

	@JsonBackReference
	public Specialisation getSpecialization() {
		return specialization;
	}

	public void setSpecialization(Specialisation specialization) {
		this.specialization = specialization;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@JsonBackReference(value="U")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setSpecialisationId(Integer specialisationId) {
		this.specialisationId = specialisationId;
	}

}
