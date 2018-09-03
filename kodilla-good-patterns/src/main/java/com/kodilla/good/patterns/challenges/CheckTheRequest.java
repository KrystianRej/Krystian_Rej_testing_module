package com.kodilla.good.patterns.challenges;

import java.util.Map;

public class CheckTheRequest implements ProductValidation {
    @Override
    public boolean isProductValiable(Map<String, Integer> productsMap, String name, double money) {
        if(productsMap.containsKey(name))
        {
            if(productsMap.get(name) < money){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
