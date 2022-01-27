package com.clinic.app.entity;

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
@Table(name = "medicineLists")
public class MedicineList {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer medicineListId;
	private Integer medDoze;
	private Integer medPrescriptionId;
	private Integer medId;
	
	@ManyToOne
	@JoinColumn(name = "medPrescriptionId", insertable = false, updatable = false)
	private MedicalPrescription medicalPrescription;
	
	@OneToOne
	@JoinColumn(name = "medId",insertable = false,updatable=false)
	private Medicine medicine;

	
	public MedicineList(Integer medicineListId, Integer medDoze, Integer medPrescriptionId, Integer medId,
			MedicalPrescription medicalPrescription, Medicine medicine) {
		super();
		this.medicineListId = medicineListId;
		this.medDoze = medDoze;
		this.medPrescriptionId = medPrescriptionId;
		this.medId = medId;
		this.medicalPrescription = medicalPrescription;
		this.medicine = medicine;
	}

	
	
	public MedicineList() {
		
	}



	public Integer getMedicineListId() {
		return medicineListId;
	}

	public void setMedicineListId(Integer medicineListId) {
		this.medicineListId = medicineListId;
	}

	public Integer getMedDoze() {
		return medDoze;
	}

	public void setMedDoze(Integer medDoze) {
		this.medDoze = medDoze;
	}

	public Integer getMedPrescriptionId() {
		return medPrescriptionId;
	}

	public void setMedPrescriptionId(Integer medPrescriptionId) {
		this.medPrescriptionId = medPrescriptionId;
	}

	public Integer getMedId() {
		return medId;
	}

	public void setMedId(Integer medId) {
		this.medId = medId;
	}

	@JsonBackReference
	public MedicalPrescription getMedicalPrescription() {
		return medicalPrescription;
	}

	public void setMedicalPrescription(MedicalPrescription medicalPrescription) {
		this.medicalPrescription = medicalPrescription;
	}
}
