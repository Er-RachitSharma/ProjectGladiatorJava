package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Loan;
import com.lti.entity.PropertyDetails;

@Repository
public class PropertyDetailsImpl {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void save(PropertyDetails propertyDetails) {
		entityManager.merge(propertyDetails);
	}
	public boolean isLoanPresent(int loanId) {
		return ((Number)entityManager.createNamedQuery("is-loan-present") //query likhna hai
				.setParameter("loanId", loanId)
				.getSingleResult()).intValue()== 1? true:false;
	}
	public Loan findById(int id) {
		return entityManager.find(Loan.class, id);
	}

}