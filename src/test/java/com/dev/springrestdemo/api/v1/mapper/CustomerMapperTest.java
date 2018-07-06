package com.dev.springrestdemo.api.v1.mapper;

import com.dev.springrestdemo.api.v1.model.CustomerDTO;
import com.dev.springrestdemo.domain.Customer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Kevin Neag
 */
public class CustomerMapperTest {

    public static final String FIRSTNAME = "Joe";
    public static final String LASTNAME = "Brown";
    public static final long ID = 1L;

    CustomerMapper customerMapper = CustomerMapper.INSTANCE;


    @Test
    public void customerToCustomerDTO() throws Exception {

        //given
        Customer customer = new Customer();
        customer.setFirstname(FIRSTNAME);
        customer.setLastname(LASTNAME);
        customer.setId(ID);

        //when
        CustomerDTO customerDTO = customerMapper.customerToCustomerDTO(customer);

        //then
        assertEquals(FIRSTNAME, customerDTO.getFirstname());
        assertEquals(LASTNAME, customerDTO.getLastname());

    }
}
