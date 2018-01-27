package com.ramazan.recipeapp.repositories;


import com.ramazan.recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long>
{
}
