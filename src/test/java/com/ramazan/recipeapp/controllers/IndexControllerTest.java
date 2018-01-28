package com.ramazan.recipeapp.controllers;

import com.ramazan.recipeapp.services.RecipeService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class IndexControllerTest
{

    @Mock
    @Autowired
    RecipeService recipeService;

    @Mock
    Model model;

    IndexController indexController;

    @Before
    public void setUp() throws Exception
    {
        MockitoAnnotations.initMocks(this);
        indexController = new IndexController(recipeService);
    }

    @Test
    public void getIndexPage()
    {
        String viewName = indexController.getIndexPage(model);
        assertEquals("index", viewName);

        // verify recipeService getRecipes 1 times call
        verify(recipeService, times(1)).getRecipes();

        //verify recipes set add once time model attribute
        verify(model, times(1)).addAttribute(eq("recipes"), anySet());

    }
}