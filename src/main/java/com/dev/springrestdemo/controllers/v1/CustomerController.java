package com.dev.springrestdemo.controllers.v1;

import com.dev.springrestdemo.api.v1.model.CustomerDTO;
import com.dev.springrestdemo.api.v1.model.CustomerListDTO;
import com.dev.springrestdemo.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Kevin Neag
 */
@Controller
@RequestMapping("/api/v1/customers/")
public class CustomerController {

    CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping
    public ResponseEntity<CustomerListDTO> getallCustomers(){

        return new ResponseEntity<CustomerListDTO>(
                new CustomerListDTO(customerService.getAllCustomers()), HttpStatus.OK);
    }

    @GetMapping("{firstname}")
    public ResponseEntity<CustomerDTO> getCategoryByName(@PathVariable String firstname){
        return new ResponseEntity<CustomerDTO>(
                customerService.getCustomerByName(firstname), HttpStatus.OK
        );
    }
}