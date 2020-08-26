package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Loan;
import com.lti.entity.PropertyDetails;
import com.lti.exception.IncomeServiceException;
import com.lti.repository.PropertyDetailsImpl;

@Service
public class PropertyService {

	@Autowired
	private PropertyDetailsImpl propertyDetailsImpl;

	public void addPropertyDetails(PropertyDetails propertyDetails) {
		// if(!propertyDetailsImpl.isLoanPresent(propertyDetails.getLoan().getloanId()))
		// {
		propertyDetailsImpl.save(propertyDetails);
		// }
		// else {
		// throw new IncomeServiceException("Loan id does not exist");
		// }
	}

	public Loan getLoanDetails(int id) {
		return propertyDetailsImpl.findById(id);
	}

}