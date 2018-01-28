package com.ramazan.recipeapp.services;

import com.ramazan.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService
{
    Set<Recipe> getRecipes();
}
