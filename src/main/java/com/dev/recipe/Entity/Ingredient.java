package com.dev.recipe.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ing_id;
    private String ing_name;
    private int ing_type;

    public Ingredient(int ing_id, String ing_name, int ing_type) {
        this.ing_id = ing_id;
        this.ing_name = ing_name;
        this.ing_type = ing_type;
    }

    public Ingredient() {
    }

    public Ingredient(String name, int ing_type) {
        this.ing_name = name;
        this.ing_type= ing_type;
    }

    public String getIng_name() {
        return ing_name;
    }

    public void setIng_name(String ing_name) {
        this.ing_name = ing_name;
    }

    public int getIng_id() {
        return ing_id;
    }

    public void setIng_id(int ing_id) {
        this.ing_id = ing_id;
    }

    public int getIng_type() {
        return ing_type;
    }

    public void setIng_type(int ing_type) {
        this.ing_type = ing_type;
    }

}
