package com.lti.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Customer;
import com.lti.entity.Loan;
import com.lti.service.LoanStatusService;

@RestController
@CrossOrigin
public class LoanStatus {
	@Autowired
	private LoanStatusService loanServ;
	
	@GetMapping("/viewLoanStatus")
	public Loan profile(@RequestParam("loanId") int id, HttpServletRequest request) {
		//fetching customer data from the database
		Loan loan = loanServ.get(id);
		return loan;
		}
	
}
