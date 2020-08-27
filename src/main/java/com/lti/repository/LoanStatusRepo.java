package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Customer;
import com.lti.entity.Loan;
import com.lti.entity.LoanDetails;


@Repository
public class LoanStatusRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public Loan findById(int id) {
		return entityManager.find(Loan.class, id);
	}
}
