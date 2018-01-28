package com.ramazan.recipeapp.services;

import com.ramazan.recipeapp.domain.Recipe;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

import static org.junit.Assert.assertEquals;

public class RecipeServiceImplTest
{
    @Mock
    @Autowired
    RecipeServiceImpl recipeService;

    @Before
    public void setUp() throws Exception
    {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getRecipes()
    {
        Set<Recipe> recipes = recipeService.getRecipes();
        System.out.println(recipes.size());
        assertEquals(recipes.size(), 0);
    }
}