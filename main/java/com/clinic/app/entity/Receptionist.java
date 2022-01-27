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
@Table(name = "receptionists")
public class Receptionist {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer receptionistId;

	@OneToMany(mappedBy = "receptionist", cascade = CascadeType.ALL)
	private List<Appointment> appointments;

	private int userId;
	@OneToOne
	@JoinColumn(name = "userId", insertable = false, updatable = false)
	private User user;

	public Integer getReceptionistId() {
		return receptionistId;
	}

	public void setReceptionistId(Integer receptionistId) {
		this.receptionistId = receptionistId;
	}

	@JsonIgnore
	@JsonManagedReference
	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	@JsonBackReference
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Receptionist(Integer receptionistId, List<Appointment> appointments, int userId, User user) {
		super();
		this.receptionistId = receptionistId;
		this.appointments = appointments;
		this.userId = userId;
		this.user = user;
	}

	public Receptionist() {

	}

}
