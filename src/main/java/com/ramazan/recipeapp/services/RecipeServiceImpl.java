wpackage com.ramazan.recipeapp.services;

import com.ramazan.recipeapp.domain.Recipe;
import com.ramazan.recipeapp.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RecipeServiceImpl implements RecipeService
{
    @Autowired
    RecipeRepository recipeRepository;

    @Override
    public Set<Recipe> getRecipes()
    {
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipe -> recipeSet.add(recipe));
        return recipeSet;
    }
}
