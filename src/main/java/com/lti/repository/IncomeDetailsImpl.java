package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Customer;
import com.lti.entity.IncomeDetails;

@Repository
public class IncomeDetailsImpl {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void save(IncomeDetails incomeDetails) {
		entityManager.merge(incomeDetails);
	}
	public boolean isCustomerPresent(long customerId) {
		return ((Number)entityManager.createNamedQuery("is-present")
				.setParameter("customerid", customerId)
				.getSingleResult()).intValue()== 1? true:false;
	}
	public Customer findById(int id) {
		return entityManager.find(Customer.class, Long.valueOf(id));
	}
}
