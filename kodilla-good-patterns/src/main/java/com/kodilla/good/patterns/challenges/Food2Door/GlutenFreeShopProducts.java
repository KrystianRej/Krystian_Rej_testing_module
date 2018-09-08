package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShopProducts implements ProducentProducts{
    @Override
    public Map<String, Integer> productsList(){
        Map<String, Integer> products = new HashMap<>();
        products.put("Jajka Bez Glutenu", 5000);
        products.put("Kokosy Bez Glutenu", 9000);
        products.put("Banany Bez Glutenu", 1500);
        return products;
    }

}
