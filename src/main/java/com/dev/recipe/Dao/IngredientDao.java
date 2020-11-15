package com.dev.recipe.Dao;

import com.dev.recipe.Entity.Ingredient;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface IngredientDao {

    List<Ingredient> findAll();
    Optional<Ingredient> findById(int ingredientId);
    Ingredient save(Ingredient ingredient);
}
