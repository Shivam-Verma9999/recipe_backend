package com.dev.recipe.Services;

import com.dev.recipe.Dao.IngredientDao;
import com.dev.recipe.Entity.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IngredientService {

    @Autowired
    @Qualifier("mysql_impl")
    private IngredientDao ingredientDao;

    public Optional<Ingredient> getIngredientById(int ingredientId){
        return ingredientDao.findById(ingredientId);
    }
    public List<Ingredient> getAllIngredients(){
        return ingredientDao.findAll();
    }

    public Ingredient saveIngredient(Ingredient ingredient) {
        ingredientDao.save(ingredient);
        return ingredient;
    }
}
