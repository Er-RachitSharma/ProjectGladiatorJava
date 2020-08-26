package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name ="loandetails")
//@NamedQuery(name ="is-loan-present", query =("select count(l.loan) from LoanDetails l where l.loan= :loanId"))
public class LoanDetails {
	
	@Id
	@GeneratedValue
	@Column(name="loandetailsid")
	private int loanDetailsId;
	@ManyToOne
	@JoinColumn (name ="loanid")
	private Loan loan;
	@Column(name="amountpassed")
	private double amountPassed;
	@Column(name="loaninterest")
	private float loanInterest;
	@Column(name="issuedate")
	private LocalDate issueDate;
	@Column(name="duration")
	private int duration;
	@Column(name="penalty")
	private double penalty;
	public int getLoanDetailsId() {
		return loanDetailsId;
	}
	public void setLoanDetailsId(int loanDetailsId) {
		this.loanDetailsId = loanDetailsId;
	}
	public Loan getLoan() {
		return loan;
	}
	public void setLoan(Loan loan) {
		this.loan = loan;
	}
	public double getAmountPassed() {
		return amountPassed;
	}
	public void setAmountPassed(double amountPassed) {
		this.amountPassed = amountPassed;
	}
	public float getLoanInterest() {
		return loanInterest;
	}
	public void setLoanInterest(float loanInterest) {
		this.loanInterest = loanInterest;
	}
	public LocalDate getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getPenalty() {
		return penalty;
	}
	public void setPenalty(double penalty) {
		this.penalty = penalty;
	}
	

}
