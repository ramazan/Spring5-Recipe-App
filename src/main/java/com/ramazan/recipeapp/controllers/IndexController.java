package com.ramazan.recipeapp.controllers;

import com.ramazan.recipeapp.domain.Category;
import com.ramazan.recipeapp.domain.UnitOfMeasure;
import com.ramazan.recipeapp.repositories.CategoryRepository;
import com.ramazan.recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController
{
    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage()
    {
        Optional<Category> category = categoryRepository.findByDescription("Mexican");
        Optional<UnitOfMeasure> uom = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println(category.get().getDescription() + " category id is : " + category.get().getId());
        System.out.println(uom.get().getDescription() + " id is :" + uom.get().getId());

        return "index";

    }
}
