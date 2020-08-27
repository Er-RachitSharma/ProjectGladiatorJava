package com.lti.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Customer;
import com.lti.entity.Loan;
import com.lti.repository.AdminCustomerRepo;

@RestController
@CrossOrigin
public class AdminController {
	
	@Autowired
	private AdminCustomerRepo adminCustomerRepo;
	
	//For fetching all the applicants who have loanStatus="eligible"
	
	@GetMapping(path = "/viewEligibleApplicants", produces = "application/json")
	public List<Customer> getEligibleApplicants() {
		List<Customer> list = adminCustomerRepo.findByLoanStatus();
		return list;
	}
	
	
	
	//For fetching the applicant by the customerId entered by the Admin
	
	@GetMapping(path = "/viewSelectedApplicant", produces = "application/json")
	public Customer getSelectedApplicant(@RequestParam("customerId") long id, HttpServletRequest request) {
		Customer customer = adminCustomerRepo.findCustomerByCustomerId(id);
		return customer;
	}
	
	
	
	@GetMapping("/update")
	public void updateLoanStatus(@RequestParam("customerId") long id, @RequestParam("loanStatus") String loanStatus, HttpServletRequest request) {
		Loan loan = adminCustomerRepo.findLoanByCustomerId(id);
		loan.setLoanStatus(loanStatus);
		adminCustomerRepo.save(loan);
	}
	
}
