package com.allianz.erpsystem.controller;

import com.allianz.erpsystem.entity.CustomerEntity;
import com.allianz.erpsystem.dto.CustomerDTO;
import com.allianz.erpsystem.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping
    public ResponseEntity<List<CustomerEntity>> getAll() {
        return new ResponseEntity<>(customerService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/name-contains-{name}")
    public ResponseEntity<List<CustomerEntity>> getAllByName(@PathVariable String name) {
        return new ResponseEntity<>(customerService.getAllByNameIContains(name), HttpStatus.OK);
    }

    @PutMapping("update/{uuid}")
    public ResponseEntity<Boolean> updateCustomerByUuid(@PathVariable UUID uuid, @RequestBody CustomerDTO customerDTO) {
        CustomerEntity customer = new CustomerEntity();
        customer.setName(customerDTO.getName());
        customer.setEmail(customerDTO.getEmail());
        return new ResponseEntity<>(customerService.updateCustomer(uuid, customer), HttpStatus.OK);
    }

    @Modifying
    @Transactional
    @DeleteMapping("delete/{uuid}")
    public ResponseEntity<Boolean> deleteCustomerByUuid(@PathVariable UUID uuid) {
        return new ResponseEntity<>(customerService.deleteCustomer(uuid), HttpStatus.OK);
    }

    @PostMapping("create")
    public ResponseEntity<Boolean> createCustomer(@RequestBody CustomerDTO customerDTO) {
        return new ResponseEntity<>(customerService.createCustomer(customerDTO.getName(), customerDTO.getEmail()),
                HttpStatus.CREATED);
    }

}