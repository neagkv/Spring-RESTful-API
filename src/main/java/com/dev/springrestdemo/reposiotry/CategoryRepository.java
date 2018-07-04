package com.dev.springrestdemo.reposiotry;

import com.dev.springrestdemo.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Kevin Neag
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(String name);
}
