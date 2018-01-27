package com.ramazan.recipeapp.repositories;

import com.ramazan.recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long>
{
}
