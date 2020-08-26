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
		/*
			select * from tbl_customer c
			inner join documentdetails d on d.customerid = c.customerid
			inner join incomedetails i on i.customerid = c.customerid
			inner join loan l on l.customerid = c.customerid 
			inner join loandetails ld on ld.loanid = l.loanid 
			inner join propertydetails p on p.loanid = l.loanid 
			where l.loanStatus="eligible";
		*/
		String query = "";
		return entityManager
				.createQuery(query)
				.getResultList();
	}
	
	@Override
	public Customer findCustomerByCustomerId(int id) {
		return entityManager.find(Customer.class, id);
	}

	@Override
	public Loan findLoanByCustomerId(int id) {
		//select * from loan l inner join tbl_customer c on c.customerid=l.customerid where customerid = id;
		String query = "";
		return (Loan) entityManager
				.createQuery(query)
				.getSingleResult();
	}

	@Override
	@Transactional
	public void save(Loan loan) {
		entityManager.merge(loan);
	}
	
}
