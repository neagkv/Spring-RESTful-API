package com.dev.springrestdemo.reposiotry;

import com.dev.springrestdemo.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Kevin Neag
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByName(String firstname);
}
