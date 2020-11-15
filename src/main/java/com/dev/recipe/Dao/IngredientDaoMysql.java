package com.dev.recipe.Dao;

import com.dev.recipe.Entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("mysql_impl")
public interface IngredientDaoMysql extends JpaRepository<Ingredient,Integer>, IngredientDao {
    Ingredient save(Ingredient ingredient);
}
