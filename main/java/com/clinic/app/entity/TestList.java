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
@Table(name = "testlists")
public class TestList {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer testListId;
	private Integer testPrescriptionId;
	private Integer testId;
	
	@ManyToOne
	@JoinColumn(name = "testPrescriptionId", insertable = false, updatable = false)
	private TestPrescription testPrescription;
	
	@OneToOne
	@JoinColumn(name = "testId",insertable = false,updatable=false)
	private Test test;


	public TestList(Integer testListId, Integer testPrescriptionId, Integer testId, TestPrescription testPrescription,
			Test test) {
		super();
		this.testListId = testListId;
		this.testPrescriptionId = testPrescriptionId;
		this.testId = testId;
		this.testPrescription = testPrescription;
		this.test = test;
	}

	public Integer getTestListId() {
		return testListId;
	}

	public void setTestListId(Integer testListId) {
		this.testListId = testListId;
	}

	public Integer getTestPrescriptionId() {
		return testPrescriptionId;
	}

	public void setTestPrescriptionId(Integer testPrescriptionId) {
		this.testPrescriptionId = testPrescriptionId;
	}

	public Integer getTestId() {
		return testId;
	}

	public void setTestId(Integer testId) {
		this.testId = testId;
	}

	@JsonBackReference
	public TestPrescription getTestPrescription() {
		return testPrescription;
	}

	public void setTestPrescription(TestPrescription testPrescription) {
		this.testPrescription = testPrescription;
	}
@JsonBackReference(value="T")
	public Test getTest() {
		return test;
	}

	public TestList() {
	super();
}

	public void setTest(Test test) {
		this.test = test;
	}
	
	
	
}
