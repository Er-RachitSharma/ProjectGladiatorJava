package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lti.entity.Customer;
import com.lti.repository.PersonalDetailsRepo;

@Service
public class PersonalDetailsService {

	@Autowired
	private PersonalDetailsRepo customerRepo;
	
	public Customer get(int id) {
		return customerRepo.findById(id);
	}
}
