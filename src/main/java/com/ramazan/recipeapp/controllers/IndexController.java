package com.ramazan.recipeapp.controllers;

import com.ramazan.recipeapp.repositories.CategoryRepository;
import com.ramazan.recipeapp.repositories.UnitOfMeasureRepository;
import com.ramazan.recipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController
{
    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @Autowired
    RecipeService recipeService;

    public IndexController(RecipeService recipeService)
    {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model)
    {
        log.info("At controller Index");
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";

    }
}
