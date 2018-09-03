package com.kodilla.good.patterns.challenges;

import java.util.Map;

public class CheckTheRequest implements ProductValidation {
    @Override
    public boolean isProductValiable(Map<String, Integer> productsMap, String name, double money) {
        if(productsMap.containsKey(name))
        {
            return productsMap.get(name) < money;
        } else {
            return false;
        }
    }
}
