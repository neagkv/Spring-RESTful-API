package com.dev.springrestdemo.reposiotry;

import com.dev.springrestdemo.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Kevin Neag
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
