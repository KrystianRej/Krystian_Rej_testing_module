package com.kodilla.good.patterns.challenges.Food2Door;

public class ShopOrderInfo {
    private Shop shop;
    private boolean isSuccess;

    public ShopOrderInfo(Shop shop, boolean isSuccess) {
        this.shop = shop;
        this.isSuccess = isSuccess;
    }

    public Shop getShop() {
        return shop;
    }

    public boolean isSuccess() {
        return isSuccess;
    }
}
