package com.dev.springrestdemo.bootstrap;

import com.dev.springrestdemo.domain.Category;
import com.dev.springrestdemo.domain.Customer;
import com.dev.springrestdemo.reposiotry.CategoryRepository;
import com.dev.springrestdemo.reposiotry.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Kevin Neag
 */

@Component
public class Bootstrap implements CommandLineRunner {

    private CategoryRepository categoryRepository;
    private CustomerRepository customerRepository;

    public Bootstrap(CategoryRepository categoryRepository, CustomerRepository customerRepository) {
        this.categoryRepository = categoryRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Category fruits = new Category();
        fruits.setName("Fruits");

        Customer joe = new Customer();
        joe.setFirstname("Joe");
        joe.setLastname("Smith");

        Category dried = new Category();
        dried.setName("Dried");

        Customer dan = new Customer();
        dan.setFirstname("Dan");
        dan.setLastname("Brown");

        Category fresh = new Category();
        fresh.setName("Fresh");

        Customer sam = new Customer();
        sam.setFirstname("Sam");
        sam.setLastname("Smith");

        Category exotic = new Category();
        exotic.setName("Exotic");

        Customer peter = new Customer();
        peter.setFirstname("Peter");
        peter.setLastname("Brown");

        Category nuts = new Category();
        nuts.setName("Nuts");

        Customer steve = new Customer();
        steve.setFirstname("Steve");
        steve.setLastname("Brown");

        categoryRepository.save(fruits);
        customerRepository.save(joe);
        categoryRepository.save(dried);
        customerRepository.save(dan);
        categoryRepository.save(fresh);
        customerRepository.save(sam);
        categoryRepository.save(exotic);
        customerRepository.save(peter);
        categoryRepository.save(nuts);
        customerRepository.save(steve);


        System.out.println("Data Loaded = " + categoryRepository.count() );
        System.out.println("Data Loaded = " + customerRepository.count() );

    }
}
