package com.lti;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.lti.entity.Customer;
import com.lti.entity.Customer.GENDER;
import com.lti.repository.CustomerRepository;

@SpringBootTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
class  LoanServerApplicationTests {

	@Autowired
	CustomerRepository customerRepo;

	@Test
	void add() {
		Customer c = new Customer();
		
		c.setCustomerName("Rachit");
		c.setEmail("Rachit@lti.com");
		c.setPassword("123456");
		c.setDateOfBirth(LocalDate.of(1998, 9, 15));
		c.setPhone("1122334455");
		c.setNationality("Indian");
		c.setAadharNo("1234567890");
		c.setPanNo("ABC14");
		c.setGender(GENDER.MALE);
		

		customerRepo.save(c);
		// assert missing
	}

	@Test
	void findAll() {
		List<Customer> listOfCustomers = customerRepo.findAll();

		for (Customer c : listOfCustomers) {
			System.out.println(c.getCustomerId() + " , " + c.getCustomerName() + " , " + c.getDateOfBirth() + " , " + c.getEmail());
			
		}
		// assert missing
	}

@Test
	void findByUsernamePassword() {

		long id = customerRepo.findByUsernamePassword("Rachit@lti.com", "123456");
		System.out.println("Customer id is "+id);
		// assert missing
	}
}