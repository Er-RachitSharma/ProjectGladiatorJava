package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.dto.PropertyDto;
import com.lti.dto.StatusDto;
import com.lti.entity.Loan;
import com.lti.entity.LoanDetails;
import com.lti.entity.PropertyDetails;
import com.lti.exception.IncomeServiceException;
import com.lti.service.PropertyService;

@RestController
@CrossOrigin
public class PropertyController {
	
	@Autowired
	private PropertyService propertyServ;
	
	@PostMapping(path= "/addProperty",consumes = "application/json", produces = "application/json")
	public StatusDto addPropertyDetails(@RequestBody PropertyDto propertyDto) {
		try {
			System.out.println(propertyDto);
			PropertyDetails propertyDetails = new PropertyDetails();
			propertyDetails.setEstimatedAmount(propertyDto.getEstimatedAmount());
			propertyDetails.setPropertyLocation(propertyDto.getPropertyLocation());
			propertyDetails.setPropertyName(propertyDto.getPropertyName());
			propertyDetails.setLoan((Loan)propertyServ.getLoanDetails(propertyDto.getLoanId()));
			//propertyDetails.setLoan(Loan)propertyServ.get;
			propertyServ.addPropertyDetails(propertyDetails);
			StatusDto status = new StatusDto();
			
			status.setMessage("Registered successfully!");
			status.setStatus(StatusDto.StatusType.SUCCESS);
			return status;
		}
		catch(Exception e) {
			e.printStackTrace();
			StatusDto status = new StatusDto();

			if (e instanceof IncomeServiceException) {
				status.setMessage(e.getMessage());
			} else {
				status.setMessage(e.getMessage());
			}

			status.setStatus(StatusDto.StatusType.FAILURE);
			return status;
		}
		}
	}