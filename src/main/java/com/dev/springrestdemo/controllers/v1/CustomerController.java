package com.dev.springrestdemo.controllers.v1;

import com.dev.springrestdemo.api.v1.model.CustomerDTO;
import com.dev.springrestdemo.api.v1.model.CustomerListDTO;
import com.dev.springrestdemo.service.CustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Kevin Neag
 */
@Api(description = "This is the Customer Controller")
@Controller
@RequestMapping("/api/v1/customers")
public class CustomerController {

    CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping
    @ApiOperation(value = "This will get a list of Customers", notes = "Notes about API")
    public ResponseEntity<CustomerListDTO> getallCustomers(){

        return new ResponseEntity<CustomerListDTO>(
                new CustomerListDTO(customerService.getAllCustomers()), HttpStatus.OK);
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<CustomerDTO> getCustomerById(@PathVariable Long id){
        return new ResponseEntity<CustomerDTO>(customerService.getCustomerById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CustomerDTO> createNewCustomer(@RequestBody CustomerDTO customerDTO){
        return new ResponseEntity<CustomerDTO>(customerService.createNewCustomer(customerDTO),
                HttpStatus.CREATED);
    }

    @PutMapping({"/{id}"})
    public ResponseEntity<CustomerDTO> updateCustomer(@PathVariable Long id, @RequestBody CustomerDTO customerDTO){
        return new ResponseEntity<CustomerDTO>(customerService.saveCustomerByDTO(id, customerDTO),
                HttpStatus.OK);
    }

    @PatchMapping({"/{id}"})
    public ResponseEntity<CustomerDTO> patchCustomer(@PathVariable Long id, @RequestBody CustomerDTO customerDTO){
        return new ResponseEntity<CustomerDTO>(customerService.patchCustomer(id, customerDTO),
                HttpStatus.OK);
    }


    @DeleteMapping({"/{id}"})
    public ResponseEntity<Void> deleteCustomer(@PathVariable Long id){

        customerService.deleteCustomerByID(id);

        return new ResponseEntity<Void>(HttpStatus.OK);
    }



}
