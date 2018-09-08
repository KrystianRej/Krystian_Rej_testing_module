package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop extends Producent {

    public ExtraFoodShop(ProducentProducts newProducent, OrderValidation validation) {
        super(newProducent, validation);
    }

    @Override
    public ShopOrderInfo process(Shop shop){
        boolean isValid = validation.canShopBuyIt(newProducent.productsList(),
                shop.getProductName(), shop.getAmountOfProduct());
        if(isValid){
            return new ShopOrderInfo(shop, true);
        } else {
            return new ShopOrderInfo(shop, false);
        }
    }
}
