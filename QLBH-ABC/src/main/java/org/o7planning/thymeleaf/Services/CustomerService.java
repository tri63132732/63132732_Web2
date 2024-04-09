package org.o7planning.thymeleaf.Services;

import java.util.List;

import org.o7planning.thymeleaf.Models.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
	List<Customer> findAllCustomer();
	Customer findCustomerByID(int id);
    void addCustomer(Customer customer);
    void deleteCustomer(int id);
}
