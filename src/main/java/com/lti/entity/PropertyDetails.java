package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name ="propertydetails")
public class PropertyDetails {

	@Id
	@GeneratedValue
	@Column(name="propertyid")
	private int propertyId;
	
	@Column(name="propertyname")
	private String propertyName;
	
	@Column(name="estimatedamount")
	private double estimatedAmount;
	
	@Column(name="propertlocation")
	private String propertyLocation;
	
	@ManyToOne
	@JoinColumn(name ="loanid")
	@JsonIgnore
	private Loan loan;
	
	public int getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	public Loan getLoan() {
		return loan;
	}
	public void setLoan(Loan loan) {
		this.loan = loan;
	}
	public String getPropertyName() {
		return propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public double getEstimatedAmount() {
		return estimatedAmount;
	}
	public void setEstimatedAmount(double estimatedAmount) {
		this.estimatedAmount = estimatedAmount;
	}
	public String getPropertyLocation() {
		return propertyLocation;
	}
	public void setPropertyLocation(String propertyLocation) {
		this.propertyLocation = propertyLocation;
	}
	
}