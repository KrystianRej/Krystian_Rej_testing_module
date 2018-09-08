package com.kodilla.good.patterns.challenges.Food2Door;

public class Shop {
    private String shopName;
    private String productName;
    private int amountOfProduct;

    public Shop(String shopName, String productName, int amountOfProduct) {
        this.shopName = shopName;
        this.productName = productName;
        this.amountOfProduct = amountOfProduct;
    }

    public String getShopName() {
        return shopName;
    }

    public String getProductName() {
        return productName;
    }

    public int getAmountOfProduct() {
        return amountOfProduct;
    }
}
