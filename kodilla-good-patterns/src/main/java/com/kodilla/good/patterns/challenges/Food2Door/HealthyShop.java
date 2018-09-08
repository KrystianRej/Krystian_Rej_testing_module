package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop extends Producent {

    public HealthyShop(ProducentProducts newProducent, OrderValidation validation) {
        super(newProducent, validation);
    }

    @Override
    public ShopOrderInfo process(Shop shop){
        boolean isValid = validation.canShopBuyIt(newProducent.productsList(),
                shop.getProductName(), shop.getAmountOfProduct());
        //Second condition checks if product is properly certificated with the required code, which is Alabama4561 now
        if(isValid && (newProducent.certification(newProducent.productsList()).get(shop.getProductName()).equals("Alabama4561"))){
            return new ShopOrderInfo(shop, true);
        } else {
            return new ShopOrderInfo(shop, false);
        }
    }
}