package com.clinic.app.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "testPrescriptions")
public class TestPrescription {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer testPrescriptionId;
	private Integer appointmentId;
	private String status;
	@OneToOne
	@JoinColumn(name = "appointmentId", insertable = false, updatable = false)
	private Appointment appointment;

	@OneToMany(mappedBy = "testPrescription", cascade = CascadeType.ALL)
	private List<TestList> testlists;

	public Integer getTestPrescriptionId() {
		return testPrescriptionId;
	}

	public TestPrescription(Integer testPrescriptionId, Integer appointmentId, String status, Appointment appointment,
			List<TestList> testlists) {
		super();
		this.testPrescriptionId = testPrescriptionId;
		this.appointmentId = appointmentId;
		this.status = status;
		this.appointment = appointment;
		this.testlists = testlists;
	}

	public void setTestPrescriptionId(Integer testPrescriptionId) {
		this.testPrescriptionId = testPrescriptionId;
	}

	public Integer getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(Integer appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	@JsonIgnore
	@JsonManagedReference
	public List<TestList> getTestlists() {
		return testlists;
	}

	public void setTestlists(List<TestList> testlists) {
		this.testlists = testlists;
	}

	@Override
	public String toString() {
		return "TestPrescription [testPrescriptionId=" + testPrescriptionId + ", appointmentId=" + appointmentId
				+ ", status=" + status + ", appointment=" + appointment + "]";
	}

	public TestPrescription() {
		super();
	}

}
