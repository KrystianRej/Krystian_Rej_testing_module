package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShopProducts implements ProducentProducts{
    @Override
    public Map<String, Integer> productsList(){
        Map<String, Integer> products = new HashMap<>();
        products.put("Jajka", 5000);
        products.put("Bulki", 4000);
        products.put("Serki", 1500);
        return products;
    }
}
