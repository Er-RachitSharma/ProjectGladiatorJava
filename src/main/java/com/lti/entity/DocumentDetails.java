package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "DocumentDetails")
public class DocumentDetails {
	
	@Id
	@GeneratedValue
	private int documentsId;
	@OneToOne
	@JoinColumn(name = "customerId")
	private Customer customer;
	private String panCard;
	private String voterId;
	private String salarySlip;
	private String loa;
	private String nocFormBuilder;
	private String agreementToSale;
	public int getDocumentsId() {
		return documentsId;
	}
	public void setDocumentsId(int documentsId) {
		this.documentsId = documentsId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public String getVoterId() {
		return voterId;
	}
	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}
	public String getSalarySlip() {
		return salarySlip;
	}
	public void setSalarySlip(String salarySlip) {
		this.salarySlip = salarySlip;
	}
	public String getLoa() {
		return loa;
	}
	public void setLoa(String loa) {
		this.loa = loa;
	}
	public String getNocFormBuilder() {
		return nocFormBuilder;
	}
	public void setNocFormBuilder(String nocFormBuilder) {
		this.nocFormBuilder = nocFormBuilder;
	}
	public String getAgreementToSale() {
		return agreementToSale;
	}
	public void setAgreementToSale(String agreementToSale) {
		this.agreementToSale = agreementToSale;
	}


}
