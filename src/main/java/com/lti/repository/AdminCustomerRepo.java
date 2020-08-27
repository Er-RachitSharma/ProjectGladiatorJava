package com.lti.repository;

import java.util.List;

import com.lti.entity.Customer;
import com.lti.entity.Loan;

public interface AdminCustomerRepo {

	List<Customer> findByLoanStatus();

	Customer findCustomerByCustomerId(long id);
	
	Loan findLoanByCustomerId(long id);
	
	void save(Loan loan);

}