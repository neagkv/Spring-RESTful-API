package com.dev.springrestdemo.api.v1.mapper;

import com.dev.springrestdemo.api.v1.modle.CategoryDTO;
import com.dev.springrestdemo.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Kevin Neag
 */
@Mapper
public interface CategoryMapper {


    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);


    CategoryDTO categoryToCategoryDTO(Category category);


}
