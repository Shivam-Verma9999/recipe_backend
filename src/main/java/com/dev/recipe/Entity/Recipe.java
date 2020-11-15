package com.dev.recipe.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Recipe {
    @Id
    private Integer rec_id;
    private String rec_name;

    public Recipe() {
    }

    public String getRec_name() {
        return rec_name;
    }

    public void setRec_name(String rec_name) {
        this.rec_name = rec_name;
    }

    public Recipe(Integer rec_id, String rec_name) {
        this.rec_id = rec_id;
        this.rec_name = rec_name;
    }

    public void setRec_id(Integer rec_id) {
        this.rec_id = rec_id;
    }

    public Integer getRec_id() {
        return rec_id;
    }
}
