package com.lti.repository;

import java.util.List;

import com.lti.entity.Customer;
import com.lti.entity.Loan;

public interface AdminCustomerRepo {

	List<Customer> findByLoanStatus();

	Customer findCustomerByCustomerId(int id);
	
	Loan findLoanByCustomerId(int id);
	
	void save(Loan loan);

}