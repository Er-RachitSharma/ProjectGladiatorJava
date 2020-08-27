package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.entity.Customer;
import com.lti.entity.Loan;

@Repository
public class AdminCustomerRepoImpl implements AdminCustomerRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Customer> findByLoanStatus() { 
//		String query = "select c from Customer c inner join c.documentDetails d inner join c.incomeDetails i "
//				+ "inner join c.loan l inner join l.propertyDetails where l.loanStatus='eligible'";
		String query = "select c from Customer c inner join c.loan l where l.loanStatus='eligible'";
		return entityManager
				.createQuery(query)
				.getResultList();
	}
	
	@Override
	public Customer findCustomerByCustomerId(long id) {
		return entityManager.find(Customer.class, id);
	}

	@Override
	public Loan findLoanByCustomerId(long id) {
		String query = "select l from Loan l inner join l.customer c where c.customerId = :cid";
		return (Loan) entityManager
				.createQuery(query)
				.setParameter("cid", id)
				.getSingleResult();
	}

	@Override
	@Transactional
	public void save(Loan loan) {
		entityManager.merge(loan);
	}
	
}
