package com.allianz.erpsystem.service;

import com.allianz.erpsystem.entity.CustomerEntity;
import com.allianz.erpsystem.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    // Method to create a new customer with the given name and email
    public boolean createCustomer(String name, String email) {
        if (name == null || email == null) return false;
        CustomerEntity customer = new CustomerEntity();
        customer.setName(name);
        customer.setEmail(email);
        customerRepository.save(customer);
        return true;
    }

    // Method to get all customers from the database
    public List<CustomerEntity> getAll() {
        return customerRepository.findAll();
    }

    // Method to get customers whose name contains the specified search string (case-insensitive)
    public List<CustomerEntity> getAllByNameIContains(String name) {
        return customerRepository.findAllByNameContainsIgnoreCase(name);
    }

    // Method to update an existing customer's name and email using the provided UUID
    public boolean updateCustomer(UUID uuid, CustomerEntity customerEntity) {
        if (uuid == null || customerEntity == null) return false;
        CustomerEntity existingCustomer = customerRepository.findByUuid(uuid);
        if (existingCustomer == null) return false;
        existingCustomer.setName(customerEntity.getName());
        existingCustomer.setEmail(customerEntity.getEmail());
        customerRepository.save(existingCustomer);
        return true;
    }

    // Method to delete a customer with the specified UUID
    public boolean deleteCustomer(UUID uuid) {
        if (uuid == null) return false;
        customerRepository.deleteByUuid(uuid);
        return true;
    }
}
