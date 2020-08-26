package com.lti.repository;

import java.util.List;
import javax.transaction.Transactional;
import com.lti.entity.Customer;

public interface CustomerRepository {

	void save(Customer customer);
    List<Customer> findAll();
    Long findByUsernamePassword(String email, String password);
    boolean isCustomerPresent(String email);
    Customer findById(Long id);
    //Long findByUsernamePassword(String email, String password);

}