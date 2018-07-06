package com.dev.springrestdemo.service;

import com.dev.springrestdemo.api.v1.model.CustomerDTO;

import java.util.List;

/**
 * @author Kevin Neag
 */
public interface CustomerService {

    List<CustomerDTO> getAllCustomers();

    CustomerDTO getCustomerByName(String firstname);
}