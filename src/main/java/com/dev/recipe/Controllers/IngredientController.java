package com.dev.recipe.Controllers;

import com.dev.recipe.Entity.Ingredient;
import com.dev.recipe.Services.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class IngredientController {

    @Autowired
    private IngredientService ingredientService;

    @GetMapping("/ingredient")
    List<Ingredient> getAllIngredients(){
        return ingredientService.getAllIngredients();
    }

    @GetMapping("/ingredient/{id}")
    Optional<Ingredient> getIngredientById(@PathVariable(name = "id") int ingredientId){
        return ingredientService.getIngredientById(ingredientId);
    }

    @PostMapping("/ingredient")
    Ingredient saveIngredient(Ingredient ingredient ){
        //TODO: check for the existing one
        return ingredientService.saveIngredient(ingredient);
    }

    @GetMapping("/*")
    ResponseEntity<String> getNotFound(){
        HttpHeaders responseHeader = new HttpHeaders();
        responseHeader.add("cookie","Cookie_value");
        return new ResponseEntity<String>("Page Not Found", responseHeader, HttpStatus.NOT_FOUND);

    }

}
