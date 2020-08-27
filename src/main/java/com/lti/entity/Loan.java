package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name ="loan")
public class Loan {

	@Id
	@GeneratedValue
	@Column(name="loanid")
	private int loanId;
	
	@Column(name="amountpassed")
	private double amountPassed;
	
	@Column(name="loanstatus")
	private String loanStatus;
	
	@OneToOne(mappedBy = "loan")
	private PropertyDetails propertyDetails;
	
	@OneToOne
	@JoinColumn(name ="customerid")
	@JsonIgnore
	private Customer customer;
	
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	public double getAmountPassed() {
		return amountPassed;
	}
	public void setAmountPassed(double amountPassed) {
		this.amountPassed = amountPassed;
	}
	public PropertyDetails getPropertyDetails() {
		return propertyDetails;
	}
	public void setPropertyDetails(PropertyDetails propertyDetails) {
		this.propertyDetails = propertyDetails;
	}
	
}
