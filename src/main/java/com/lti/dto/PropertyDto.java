package com.lti.dto;

public class PropertyDto {
	@Override
	public String toString() {
		return "PropertyDto [loanId=" + loanId + ", propertyId=" + propertyId + ", propertyName=" + propertyName
				+ ", estimatedAmount=" + estimatedAmount + ", propertyLocation=" + propertyLocation + "]";
	}
	private int loanId;
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	private int propertyId;
	private String propertyName;
	private double estimatedAmount;
	private String propertyLocation;
	public int getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	public String getPropertyName() {
		return propertyName;
	}
	public void setPropertName(String properytName) {
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