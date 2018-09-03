package com.kodilla.good.patterns.challenges;

public class BuyRequest {
    private User user;
    private String productName;
    private double amountOfMoney;

    public BuyRequest(final User user, final String productName, final double amountOfMoney) {
        this.user = user;
        this.productName = productName;
        this.amountOfMoney = amountOfMoney;
    }

    public String getProductName() {
        return productName;
    }

    public User getUser() {
        return user;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }
}
