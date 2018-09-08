package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class HealthyShopProducts implements ProducentProducts{
    @Override
    public Map<String, Integer> productsList(){
        Map<String, Integer> products = new HashMap<>();
        products.put("Jajka", 5000);
        products.put("Kokosy", 9000);
        products.put("Banany", 1500);
        return products;
    }

}
