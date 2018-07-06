package com.dev.springrestdemo.service;

import com.dev.springrestdemo.api.v1.mapper.CustomerMapper;
import com.dev.springrestdemo.api.v1.model.CustomerDTO;
import com.dev.springrestdemo.reposiotry.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Kevin Neag
 */
@Service
public class CustomerServiceImp implements CustomerService {


    private final CustomerMapper customerMapper;
    private final CustomerRepository customerRepository;

    public CustomerServiceImp(CustomerMapper customerMapper, CustomerRepository customerRepository) {
        this.customerMapper = customerMapper;
        this.customerRepository = customerRepository;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {

        return customerRepository.findAll()
                .stream()
                .map(customerMapper::customerToCustomerDTO)
                .collect(Collectors.toList());

    }

    @Override
    public CustomerDTO getCustomerByName(String firstname) {
        return customerMapper.customerToCustomerDTO(customerRepository.findByName(firstname));
    }
}

