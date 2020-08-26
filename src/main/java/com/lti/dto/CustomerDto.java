package com.lti.dto;

//package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Convert;

import com.lti.entity.Customer.GENDER;

public class CustomerDto {
	private String customerName;
	private LocalDate dateOfBirth;
	private String email;
	private String password;
	private String nationality;
	private String aadharNo;
	private String panNo;
	private String phone;
	private GENDER gender;
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "CustomerDto [customerName=" + customerName + ", dateOfBirth=" + dateOfBirth + ", email=" + email
				+ ", password=" + password + ", nationality=" + nationality + ", aadharNo=" + aadharNo + ", panNo="
				+ panNo + ", phone=" + phone + ", gender=" + gender + "]";
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public static enum GENDER{
		MALE,FEMALE;
	}

}