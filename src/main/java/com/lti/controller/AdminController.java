package com.lti.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.dto.AdminDto;
import com.lti.entity.Customer;
import com.lti.entity.Loan;
import com.lti.repository.AdminCustomerRepo;

@RestController
@CrossOrigin
public class AdminController {
	
	@Autowired
	private AdminCustomerRepo adminCustomerRepo;
	
	//For fetching all the applicants who have loanStatus="eligible"
	
	@GetMapping(path = "/viewEligibleApplicants.api", produces = "application/json")
	public List<Customer> getEligibleApplicants() {
		List<Customer> list = adminCustomerRepo.findByLoanStatus();
		return list;
	}
	
	
	
	//For fetching the applicant by the customerId entered by the Admin
	
	@PostMapping(path = "/viewSelectedApplicant.api", produces = "application/json", consumes = "application/json")
	public Customer getSelectedApplicant(@RequestBody AdminDto adminDto) {
		Customer customer = adminCustomerRepo.findCustomerByCustomerId(adminDto.getId());
		return customer;
	}
	
	
	
	@GetMapping("/update.api")
	public void updateLoanStatus(@RequestParam("customerId") int id, @RequestParam("loanStatus") String loanStatus, HttpServletRequest request) {
		Loan loan = adminCustomerRepo.findLoanByCustomerId(id);
		loan.setLoanStatus(loanStatus);
		adminCustomerRepo.save(loan);
	}
	
}
