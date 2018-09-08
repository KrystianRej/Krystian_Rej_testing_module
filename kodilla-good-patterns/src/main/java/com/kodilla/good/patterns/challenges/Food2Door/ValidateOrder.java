package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Map;

public class ValidateOrder implements OrderValidation{
    @Override
    public boolean CanShopBuyIt(Map<String, Integer> products,
                                String nameOfTheProduct, int numberOfTheProductToOrder){
        if(products.containsKey(nameOfTheProduct))
        {
            return products.get(nameOfTheProduct) > numberOfTheProductToOrder;
        } else {
            return false;
        }
    }
}
