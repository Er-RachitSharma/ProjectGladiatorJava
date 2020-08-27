package com.lti.dto;

import org.springframework.web.multipart.MultipartFile;

public class DocumentUploadDto {
	//private int customerId;
	private MultipartFile panCard;
	private MultipartFile voterId;
	private MultipartFile salarySlip;
	private MultipartFile loa;
	private MultipartFile nocFormBuilder;
	private MultipartFile agreementToSale;
	private int customerId;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public MultipartFile getPanCard() {
		return panCard;
	}
	public void setPanCard(MultipartFile panCard) {
		this.panCard = panCard;
	}
	public MultipartFile getVoterId() {
		return voterId;
	}
	public void setVoterId(MultipartFile voterId) {
		this.voterId = voterId;
	}
	public MultipartFile getSalarySlip() {
		return salarySlip;
	}
	public void setSalarySlip(MultipartFile salarySlip) {
		this.salarySlip = salarySlip;
	}
	public MultipartFile getLoa() {
		return loa;
	}
	public void setLoa(MultipartFile loa) {
		this.loa = loa;
	}
	public MultipartFile getNocFormBuilder() {
		return nocFormBuilder;
	}
	public void setNocFormBuilder(MultipartFile nocFormBuilder) {
		this.nocFormBuilder = nocFormBuilder;
	}
	public MultipartFile getAgreementToSale() {
		return agreementToSale;
	}
	public void setAgreementToSale(MultipartFile agreementToSale) {
		this.agreementToSale = agreementToSale;
	}

}
