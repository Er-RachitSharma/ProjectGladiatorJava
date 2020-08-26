package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="loan")
public class Loan {

	@Id
	@Column(name="loanid")
	private int loanId;
	
	@OneToOne
	@JoinColumn(name ="customerid")
	private Customer customer;
	@Column(name="amounteligible")
	private double amountEligible;
	@Column(name="loanstatus")
	private String loanStatus;
	public int getloanId() {
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
	public double getAmountEligible() {
		return amountEligible;
	}
	public void setAmountEligible(double amountEligible) {
		this.amountEligible = amountEligible;
	}
	public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	
}
