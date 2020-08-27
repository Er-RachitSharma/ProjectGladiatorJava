package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//import com.lti.dto.CustomerDto.GENDER;

@Entity
@Table(name= "customer")
@NamedQuery(name = "fetch-all", query = "select c from Customer c")
//@NamedQuery(name = "fetch-login", query = ("select c.customerId from Customer c where c.email = :email and c.password = :password"))
public class Customer {

	@Id
	@GeneratedValue
	@Column(name="customerid")
	private long customerId;
	
	@Column(name="customername")
	private String customerName;
	
	@Column(name="dateofbirth")
	private LocalDate dateOfBirth;
	
	@Column(name="password")
	private String password;
	
	@Column(name ="email")
	private String email;
	
	@Column(name="phoneno")
	private String phone;
	
	@Column(name="gender")
	@Enumerated(EnumType.STRING)
	private GENDER gender;
	
	@Column(name="nationality")
	private String nationality;
	
	@Column(name="aadharno")
	private String aadharNo;
	
	@Column(name="panno")
	private String panNo;
	
	@OneToOne(mappedBy = "customer")
	private DocumentDetails documentDetails;
	
	@OneToOne(mappedBy = "customer")
	private IncomeDetails incomeDetails;
	
	@OneToOne(mappedBy = "customer")
	private Loan loan;
	
	public DocumentDetails getDocumentDetails() {
		return documentDetails;
	}

	public void setDocumentDetails(DocumentDetails documentDetails) {
		this.documentDetails = documentDetails;
	}

	public IncomeDetails getIncomeDetails() {
		return incomeDetails;
	}

	public void setIncomeDetails(IncomeDetails incomeDetails) {
		this.incomeDetails = incomeDetails;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public static enum GENDER{
		MALE,FEMALE;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public GENDER getGender() {
		return gender;
	}

	public void setGender(GENDER gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	
	
}