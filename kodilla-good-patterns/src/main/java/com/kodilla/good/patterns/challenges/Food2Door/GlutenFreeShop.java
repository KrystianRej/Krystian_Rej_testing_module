
package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop extends Producent {

    public GlutenFreeShop(ProducentProducts newProducent, OrderValidation validation) {
        super(newProducent, validation);
    }

    @Override
    public ShopOrderInfo process(Shop shop){
        boolean isValid = validation.CanShopBuyIt(newProducent.productsList(),
                shop.getProductName(), shop.getAmountOfProduct());
        if(isValid && shop.getShopName().endsWith("GlutenFree")){
            return new ShopOrderInfo(shop, true);
        } else {
            return new ShopOrderInfo(shop, false);
        }
    }
}
