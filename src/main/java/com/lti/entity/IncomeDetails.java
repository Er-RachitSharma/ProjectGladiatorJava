package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "incomedetails")
@NamedQuery(name = "is-present", query = ("select count(c.customer) from IncomeDetails c where c.customer= :customerId"))
public class IncomeDetails {

	@Id
	@GeneratedValue
	@Column(name="detailsid")
	private int detailsId;
	@OneToOne
	@JoinColumn(name = "customerid")
	private Customer customer;
	@Override
	public String toString() {
		return "IncomeDetails [detailsId=" + detailsId + ", customer=" + customer + ", income=" + income
				+ ", typeOfEmployment=" + typeOfEmployment + ", organizationType=" + organizationType
				+ ", organizationName=" + organizationName + ", employerName=" + employerName + "]";
	}

	@Column(name="income")
	private double income;
	@Column(name="typeofemployment")
	private String typeOfEmployment;
	@Column(name="organizationtype")
	private String organizationType;
	@Column(name="organizationname")
	private String organizationName;
	@Column(name="employername")
	private String employerName;
	
	@Column(name = "amountneeded")
	private double amountNeeded;
	
	@Column(name ="tenure")
	private int tenure;
	@Column(name ="workingyears")
	private int workingYears;
	
	

	public double getAmountNeeded() {
		return amountNeeded;
	}

	public void setAmountNeeded(double amountNeeded) {
		this.amountNeeded = amountNeeded;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public int getWorkingYears() {
		return workingYears;
	}

	public void setWorkingYears(int workingYears) {
		this.workingYears = workingYears;
	}

	public int getDetailsId() {
		return detailsId;
	}

	public void setDetailsId(int detailsId) {
		this.detailsId = detailsId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public String getTypeOfEmployment() {
		return typeOfEmployment;
	}

	public void setTypeOfEmployment(String typeOfEmployment) {
		this.typeOfEmployment = typeOfEmployment;
	}

	public String getOrganizationType() {
		return organizationType;
	}

	public void setOrganizationType(String organizationType) {
		this.organizationType = organizationType;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

}