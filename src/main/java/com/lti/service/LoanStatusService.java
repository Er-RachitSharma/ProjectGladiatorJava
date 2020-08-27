package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Customer;
import com.lti.entity.Loan;
import com.lti.repository.LoanStatusRepo;

@Service
public class LoanStatusService {

	@Autowired
	private LoanStatusRepo loanStatusRepo;
	public Loan get(int id) {
		return loanStatusRepo.findById(id);
	}
	
	
}
