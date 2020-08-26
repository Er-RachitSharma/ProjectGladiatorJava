package com.lti.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dto.IncomeDto;
import com.lti.entity.Customer;
import com.lti.entity.IncomeDetails;
import com.lti.exception.IncomeServiceException;
import com.lti.repository.IncomeDetailsImpl;

@Service
public class IncomeServiceImpl implements IncomeService {

	@Autowired
	private IncomeDetailsImpl incomeDet;

	@Override
	public void addIncomeDetails(IncomeDetails incomeDetails) {
		//System.out.println(incomeDetails.getCustomer().getCustomerId());
		//if(!incomeDet.isCustomerPresent(incomeDetails.getCustomer().getCustomerId())) {
			//System.out.println(incomeDetails.getCustomer().getCustomerId());
			incomeDet.save(incomeDetails);
		//}
		//else {
			//throw new IncomeServiceException("Customer not present");
		//}
		
	}
	@Override
	public Customer getCustomerDetails(int id) {
		return incomeDet.findById(id);
	}

}