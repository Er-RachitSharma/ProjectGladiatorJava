package com.lti.service;

import org.springframework.stereotype.Service;

import com.lti.entity.Customer;
//import com.lti.controller.CustomerService;
@Service

public interface CustomerService {

	Customer register(Customer customer);

	Customer login(String email, String password);
	
}