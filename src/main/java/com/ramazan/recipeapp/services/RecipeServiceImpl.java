package com.ramazan.recipeapp.services;

import com.ramazan.recipeapp.domain.Recipe;
import com.ramazan.recipeapp.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService
{
    @Autowired
    RecipeRepository recipeRepository;

    @Override
    public Set<Recipe> getRecipes()
    {
        log.info("Hey I'm at Service Layer!");

        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add));
        return recipeSet;
    }
}
