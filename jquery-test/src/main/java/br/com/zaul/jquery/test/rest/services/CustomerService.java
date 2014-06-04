package br.com.zaul.jquery.test.rest.services;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.zaul.jquery.test.dao.CustomerDAO;
import br.com.zaul.jquery.test.domain.Customer;

@Path("/customer")
public class CustomerService {
	
	@Inject
	private CustomerDAO customerDAO;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Customer> getAllCustomers() {
		return customerDAO.findAll();
	}
	
	@GET
	@Path("/{customerId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer findById(@PathParam("customerId") Integer customerId) {
		return customerDAO.findById(customerId);
	}
	
}
