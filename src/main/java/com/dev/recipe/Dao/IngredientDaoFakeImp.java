package com.dev.recipe.Dao;

import com.dev.recipe.Entity.Ingredient;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("fake_impl")
public class IngredientDaoFakeImp implements IngredientDao {

    private static Map<Integer, Ingredient> map = new HashMap<>();
    static {
        map.put(1,new Ingredient(1,"ingredient 1",1));
        map.put(2,new Ingredient(2,"ingredient 2",1));
        map.put(3,new Ingredient(3,"ingredient 3",2));
    }

    @Override
    public List<Ingredient> findAll() {
        List<Ingredient> ingredientList = new ArrayList<>();
        for (int key :
                map.keySet()) {
            ingredientList.add(map.get(key));
        }
        return ingredientList;
    }

    @Override
    public Optional<Ingredient> findById(int ingredientId) {
        if(map.containsKey(ingredientId)){
            return Optional.ofNullable(map.get(ingredientId));
        }else{
            return null;
        }
    }

    @Override
    public Ingredient save(Ingredient ingredient) {

        return null;
    }
}
