package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class PossibleIngredients {
    private List<String> ingredients = new ArrayList<>();

    public PossibleIngredients() {
        ingredients.add("salata");
        ingredients.add("cebula");
        ingredients.add("bekon");
        ingredients.add("ogorek");
        ingredients.add("papryczki");
        ingredients.add("chilli");
        ingredients.add("pieczarki");
        ingredients.add("krewetki");
        ingredients.add("ser");
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
