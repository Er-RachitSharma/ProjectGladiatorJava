package com.lti.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.dto.IncomeDto;
import com.lti.dto.StatusDto;
import com.lti.entity.Customer;
import com.lti.entity.IncomeDetails;
import com.lti.exception.IncomeServiceException;
import com.lti.service.IncomeService;
@RestController
@CrossOrigin
public class IncomeController {

	@Autowired
	private IncomeService incomeServ;
	
	@PostMapping(path= "/addIncome" , consumes = "application/json", produces = "application/json")
	public StatusDto addIncome(@RequestBody IncomeDto incomeDto) {
		try {
		
			IncomeDetails incomeDetails = new IncomeDetails();
			//BeanUtils.copyProperties(incomeDto, incomeDetails);
			System.out.println(incomeDetails);
			incomeDetails.setIncome(incomeDto.getIncome());
			incomeDetails.setEmployerName(incomeDto.getEmployerName());
			incomeDetails.setOrganizationType(incomeDto.getOrganizationType());
			incomeDetails.setTypeOfEmployment(incomeDto.getTypeOfEmployment());
			incomeDetails.setAmountNeeded(incomeDto.getAmountNeeded());
			incomeDetails.setTenure(incomeDto.getTenure());
			incomeDetails.setWorkingYears(incomeDto.getWorkingYears());
			
			incomeDetails.setCustomer((Customer)incomeServ.getCustomerDetails(incomeDto.getCustomerId()));
			incomeServ.addIncomeDetails(incomeDetails);
			//System.out.println(incomeDto);
			//System.out.println(incomeDetails);
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

