package br.com.zaul.jquery.test.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.zaul.jquery.test.domain.Customer;

public class CustomerDAO {
	
	private List<Customer> customers;
	
	public CustomerDAO() {
		customers = new ArrayList<>();
		
		customers.add(new Customer(1, "Thiago", "Fonseca", 29));
		customers.add(new Customer(2, "Ricardo", "Goulart", 22));
		customers.add(new Customer(3, "Everton", "Ribeiro", 25));
		customers.add(new Customer(4, "Bruno", "Rodrigo", 28));
		customers.add(new Customer(5, "Julio", "Batista", 33));
	}

	public List<Customer> findAll() {
		return customers;
	}
	
	public Customer findById(Integer customerId) {
		for (Customer customer : customers) {
			if (customer.getId().equals(customerId)) {
				return customer;
			}
		}
		
		throw new IllegalArgumentException("Customer not founded by name");
	}
}
