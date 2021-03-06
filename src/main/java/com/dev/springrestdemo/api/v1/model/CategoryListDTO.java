package com.dev.springrestdemo.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @author Kevin Neag
 */
@Data
@AllArgsConstructor
public class CategoryListDTO {

    List<CategoryDTO> categories;
}
