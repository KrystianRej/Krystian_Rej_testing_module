package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class ProductsInShop implements AvaliableProductsInShop{

    @Override
    public Map<String, Integer> getAvaliableProducts() {
        Map<String, Integer> avaliableProducts = new HashMap<>();
        avaliableProducts.put("Pilka", 50);
        avaliableProducts.put("Zabawka", 60);
        avaliableProducts.put("Smok", 150);
        avaliableProducts.put("Wielka kula", 750);
        avaliableProducts.put("Gwiazda", 350);
        return new HashMap<>(avaliableProducts);
    }
}
