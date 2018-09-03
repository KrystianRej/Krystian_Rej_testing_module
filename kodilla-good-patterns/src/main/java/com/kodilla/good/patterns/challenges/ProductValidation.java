package com.kodilla.good.patterns.challenges;

import java.util.Map;

public interface ProductValidation {
    public boolean isProductValiable(Map<String, Integer> productsMap, String name, double money);
}
