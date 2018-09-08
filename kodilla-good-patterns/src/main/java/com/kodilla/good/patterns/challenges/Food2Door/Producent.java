package com.kodilla.good.patterns.challenges.Food2Door;



public abstract class Producent {
    protected ProducentProducts newProducent;
    protected OrderValidation validation;

    public Producent(ProducentProducts newProducent, OrderValidation validation) {
        this.newProducent = newProducent;
        this.validation = validation;
    }

    abstract protected ShopOrderInfo process(Shop shop);

    public String infoAboutOrder(ShopOrderInfo shopInfo){
        if(shopInfo.isSuccess()){
            return "Zamowienie zostaje zrealizowane w sklepie: " + shopInfo.getShop().getShopName()
                    + " na produkt: " + shopInfo.getShop().getProductName() + " w ilosi: " + shopInfo.getShop().getAmountOfProduct();
        } else {
            return  "Nie da sie zrealizowac zamowienia";
        }
    }
}
