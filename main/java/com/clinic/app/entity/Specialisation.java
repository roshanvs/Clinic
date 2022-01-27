package com.clinic.app.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "specialisations")
public class Specialisation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer specialisationId;
	private String specialization;
	private Integer consultancyFee;
	private String status;

	@OneToMany(mappedBy = "specialization", cascade = CascadeType.ALL)
	private List<Doctor> doctors;

	public Integer getSpecialisationId() {
		return specialisationId;
	}

	public void setSpecialisationId(Integer specialisationId) {
		this.specialisationId = specialisationId;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public Integer getConsultancyFee() {
		return consultancyFee;
	}

	public void setConsultancyFee(Integer consultancyFee) {
		this.consultancyFee = consultancyFee;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@JsonIgnore
	@JsonManagedReference
	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}

	public Specialisation() {

	}

	public Specialisation(Integer specialisationId, String specialization, Integer consultancyFee, String status,
			List<Doctor> doctors) {
		super();
		this.specialisationId = specialisationId;
		this.specialization = specialization;
		this.consultancyFee = consultancyFee;
		this.status = status;
		this.doctors = doctors;
	}

	@Override
	public String toString() {
		return "Specialisation [specialisationId=" + specialisationId + ", specialization=" + specialization
				+ ", consultancyFee=" + consultancyFee + ", status=" + status + "]";
	}

}
