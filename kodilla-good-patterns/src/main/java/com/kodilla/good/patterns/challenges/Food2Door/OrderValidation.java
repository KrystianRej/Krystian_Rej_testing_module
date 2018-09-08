package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Map;

public interface OrderValidation {
    public boolean canShopBuyIt(Map<String, Integer> products, String nameOfTheProduct, int numberOfTheProductToOrder);
}
