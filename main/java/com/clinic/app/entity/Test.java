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
@Table(name = "tests")

public class Test {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer testId;

	private String testName;
	private String testItem;
	private Integer price;

	@OneToMany(mappedBy = "test", cascade = CascadeType.ALL)
	private List<TestResult> testResults;

	public Test() {

	}

	public Test(Integer testId, String testName, String testItem, Integer price, List<TestResult> testResults) {
		super();
		this.testId = testId;
		this.testName = testName;
		this.testItem = testItem;
		this.price = price;
		this.testResults = testResults;
	}

	public Integer getTestId() {
		return testId;
	}

	public void setTestId(Integer testId) {
		this.testId = testId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getTestItem() {
		return testItem;
	}

	public void setTestItem(String testItem) {
		this.testItem = testItem;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@JsonIgnore
	@JsonManagedReference
	public List<TestResult> getTestResults() {
		return testResults;
	}

	public void setTestResults(List<TestResult> testResults) {
		this.testResults = testResults;
	}

}
