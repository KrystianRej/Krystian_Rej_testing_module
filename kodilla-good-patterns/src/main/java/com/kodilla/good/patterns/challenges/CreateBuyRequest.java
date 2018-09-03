package com.kodilla.good.patterns.challenges;

public class CreateBuyRequest {

    public BuyRequest retrieve(){
        User user = new User("Marian", "Kowalski");

        String productToBuy = "Wielka kula";
        int amountOfMoney = 1000;

        return new BuyRequest(user, productToBuy, amountOfMoney);
    }
}
