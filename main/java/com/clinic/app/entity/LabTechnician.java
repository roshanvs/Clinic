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
@Table(name = "labTechnicians")
public class LabTechnician {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer labTechnicianId;

	@OneToMany(mappedBy = "labTechnician", cascade = CascadeType.ALL)
	private List<TestResult> testResults;

	private int userId;
	@OneToOne
	@JoinColumn(name = "userId", insertable = false, updatable = false)
	private User user;

	public Integer getLabTechnicianId() {
		return labTechnicianId;
	}

	public void setLabTechnicianId(Integer labTechnicianId) {
		this.labTechnicianId = labTechnicianId;
	}
	@JsonIgnore
	@JsonManagedReference
	public List<TestResult> getTestResults() {
		return testResults;
	}

	public void setTestResults(List<TestResult> testResults) {
		this.testResults = testResults;
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

	public LabTechnician(Integer labTechnicianId, List<TestResult> testResults, int userId, User user) {
		super();
		this.labTechnicianId = labTechnicianId;
		this.testResults = testResults;
		this.userId = userId;
		this.user = user;
	}

	public LabTechnician() {
		super();
	}

}
