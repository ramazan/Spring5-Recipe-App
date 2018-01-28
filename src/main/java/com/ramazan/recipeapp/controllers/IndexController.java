package com.ramazan.recipeapp.controllers;

import com.ramazan.recipeapp.repositories.CategoryRepository;
import com.ramazan.recipeapp.repositories.UnitOfMeasureRepository;
import com.ramazan.recipeapp.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController
{
    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @Autowired
    RecipeService recipeService;

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model)
    {
//        Optional<Category> category = categoryRepository.findByDescription("Mexican");
//        Optional<UnitOfMeasure> uom = unitOfMeasureRepository.findByDescription("Teaspoon");
//
//        System.out.println(category.get().getDescription() + " category id is : " + category.get().getId());
//        System.out.println(uom.get().getDescription() + " id is :" + uom.get().getId());

        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";

    }
}
