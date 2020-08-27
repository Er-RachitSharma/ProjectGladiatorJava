package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Customer;

@Repository
public class PersonalDetailsRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public Customer findById(int id) {
		return entityManager.find(Customer.class, id);
	}
	}
	
