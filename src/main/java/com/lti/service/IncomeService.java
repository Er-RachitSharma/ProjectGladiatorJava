package com.lti.service;


import com.lti.entity.Customer;
import com.lti.entity.IncomeDetails;

public interface IncomeService {
	
	void addIncomeDetails(IncomeDetails incomeDetails);
	Customer getCustomerDetails(int id);

}
