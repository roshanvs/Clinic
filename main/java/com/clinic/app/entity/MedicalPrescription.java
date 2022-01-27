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
@Table(name="medicalPrescriptions")
public class MedicalPrescription {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer medPrescriptionId;
	private Integer appointmentId;
	private String status;
	@OneToOne
	@JoinColumn(name="appointmentId",insertable = false,updatable=false)
	private Appointment appointment;
	
	@OneToMany(mappedBy = "medicalPrescription",cascade = CascadeType.ALL)	
	private List<MedicineList> medicineLists;
	
	public Integer getMedPrescriptionId() {
		return medPrescriptionId;
	}
	public void setMedPrescriptionId(Integer medPrescriptionId) {
		this.medPrescriptionId = medPrescriptionId;
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
	@JsonIgnore
	@JsonManagedReference
	public List<MedicineList> getMedicineLists() {
		return medicineLists;
	}
	public void setMedicineLists(List<MedicineList> medicineLists) {
		this.medicineLists = medicineLists;
	}
	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
	@Override
	public String toString() {
		return "MedicalPrescription [medPrescriptionId=" + medPrescriptionId + ", appointmentId=" + appointmentId
				+ ", status=" + status + ", appointment=" + appointment + "]";
	}

	public MedicalPrescription(Integer medPrescriptionId, Integer appointmentId, String status, Appointment appointment,
			List<MedicineList> medicineLists) {
		super();
		this.medPrescriptionId = medPrescriptionId;
		this.appointmentId = appointmentId;
		this.status = status;
		this.appointment = appointment;
		this.medicineLists = medicineLists;
	}
	public MedicalPrescription() {
		
	}

	
	
}
