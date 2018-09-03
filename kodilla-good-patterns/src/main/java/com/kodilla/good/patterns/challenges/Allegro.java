package com.kodilla.good.patterns.challenges;

import java.io.IOException;

public class Allegro {
    public static void main(String[] args) {

        CreateBuyRequest createBuyRequest = new CreateBuyRequest();
        BuyRequest buyRequest = createBuyRequest.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new InformationService(), new CheckTheRequest(), new ProductsInShop());
        SellingDto doneTransaction = productOrderService.process(buyRequest);
        try {
            doneTransaction.writeFile("infoAboutTransaction.txt");
        } catch(IOException e) {
            System.out.println("Problem with overwriting file");
        }
    }
}
