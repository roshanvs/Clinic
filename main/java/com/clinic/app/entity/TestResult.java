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
@Table(name = "testresults")
public class TestResult {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer resultId;
	private Integer labTechnicianId;
	private Integer testListId;
	private Integer testId;
	private String testValues;
	
	@ManyToOne
	@JoinColumn(name="labTechnicianId" ,insertable = false,updatable = false)
	private LabTechnician labTechnician;

	@OneToOne
	@JoinColumn(name="testListId",insertable =false,updatable = false)
	private TestList testList;
	
	@ManyToOne
	@JoinColumn(name="testId" ,insertable = false,updatable = false)
	private Test test;
	
	

	public TestResult() {
		
	}

	public TestResult(Integer resultId, Integer labTechnicianId, Integer testListId, Integer testId, String testValues,
			LabTechnician labtechnician, TestList testList, Test tests) {
		super();
		this.resultId = resultId;
		this.labTechnicianId = labTechnicianId;
		this.testListId = testListId;
		this.testId = testId;
		this.testValues = testValues;
		this.labTechnician = labtechnician;
		this.testList = testList;
		this.test = tests;
	}

	public Integer getResultId() {
		return resultId;
	}

	public void setResultId(Integer resultId) {
		this.resultId = resultId;
	}


	public Integer getLabTechnicianId() {
		return labTechnicianId;
	}

	public void setLabTechnicianId(Integer technicianId) {
		this.labTechnicianId = technicianId;
	}

	public Integer getTestListId() {
		return testListId;
	}

	public void setTestListId(Integer testListId) {
		this.testListId = testListId;
	}

	public Integer getTestId() {
		return testId;
	}

	public void setTestId(Integer testId) {
		this.testId = testId;
	}

	public String getTestValues() {
		return testValues;
	}

	public void setTestValues(String testValues) {
		this.testValues = testValues;
	}

	public TestList getTestList() {
		return testList;
	}

	public void setTestList(TestList testList) {
		this.testList = testList;
	}

	@JsonBackReference
	public Test getTests() {
		return test;
	}

	public void setTests(Test tests) {
		this.test = tests;
	}

	@JsonBackReference(value="L")
	public LabTechnician getLabTechnician() {
		return labTechnician;
	}

	public void setLabTechnician(LabTechnician labtechnician) {
		this.labTechnician = labtechnician;
	}
	
	
	
}
