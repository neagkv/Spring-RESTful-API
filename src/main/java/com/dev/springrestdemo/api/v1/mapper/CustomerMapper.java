package com.dev.springrestdemo.api.v1.mapper;

import com.dev.springrestdemo.api.v1.model.CustomerDTO;
import com.dev.springrestdemo.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Kevin Neag
 */
@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO customerToCustomerDTO(Customer customer);




}
