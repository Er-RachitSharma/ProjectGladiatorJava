package com.lti.dto;

public class IncomeDto {
	
	private int customerId;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	private double income;
	private String typeOfEmployment;
	private String organizationType;
	private String organizationName;
	private String employerName;
	private double amountNeeded;
	private int tenure;
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
	@Override
	public String toString() {
		return "IncomeDto [customerId=" + customerId + ", income=" + income + ", typeOfEmployment=" + typeOfEmployment
				+ ", organizationType=" + organizationType + ", organizationName=" + organizationName
				+ ", employerName=" + employerName + "]";
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
