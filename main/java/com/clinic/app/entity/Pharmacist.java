package com.clinic.app.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "pharmacists")
public class Pharmacist {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pharmacistId;

	private int userId;
	@OneToOne
	@JoinColumn(name = "userId", insertable = false, updatable = false)
	private User user;

	public int getPharmacistId() {
		return pharmacistId;
	}

	public void setPharmacistId(int pharmacistId) {
		this.pharmacistId = pharmacistId;
	}

	public Pharmacist(int pharmacistId) {
		super();
		this.pharmacistId = pharmacistId;
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

	public Pharmacist() {

	}

	public Pharmacist(int pharmacistId, int userId, User user) {
		super();
		this.pharmacistId = pharmacistId;
		this.userId = userId;
		this.user = user;
	}

}
