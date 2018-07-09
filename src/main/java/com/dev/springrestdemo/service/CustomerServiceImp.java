package com.dev.springrestdemo.service;

import com.dev.springrestdemo.api.v1.mapper.CustomerMapper;
import com.dev.springrestdemo.api.v1.model.CustomerDTO;
import com.dev.springrestdemo.domain.Customer;
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
    public CustomerDTO getCustomerById(Long id) {

        return customerRepository.findById(id)
                .map(customerMapper::customerToCustomerDTO)
                .orElseThrow(RuntimeException::new); //todo implement better exception handling
    }

    @Override
    public CustomerDTO createNewCustomer(CustomerDTO customerDTO) {

        Customer customer = customerMapper.customerDTOTOCustomer(customerDTO);

        Customer savedCustomer = customerRepository.save(customer);

        CustomerDTO returnDTO = customerMapper.customerToCustomerDTO(savedCustomer);

        returnDTO.setCustomerURL("/api/vi/customer/" + savedCustomer.getId());

        return returnDTO;
    }


}


