package com.lti.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.dto.CustomerDto;
import com.lti.dto.PersonalDetailsDto;
import com.lti.entity.Customer;
import com.lti.service.PersonalDetailsService;

@RestController
@CrossOrigin
public class PersonalDetailsController {
		
	@Autowired
	PersonalDetailsService customerService;
	
	@GetMapping("/profile")
	public Customer profile(@RequestParam("customerId") int id, HttpServletRequest request) {
		//fetching customer data from the database
		Customer customer = customerService.get(id);
		return customer;
		}
			
}
