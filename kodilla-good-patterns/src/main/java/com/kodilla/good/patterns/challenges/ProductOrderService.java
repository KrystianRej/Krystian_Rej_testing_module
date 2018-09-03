package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private Information information;
    private ProductValidation canCustomerBuyIt;
    private AvaliableProductsInShop avaliableProducts;

    public ProductOrderService(Information information, ProductValidation canCustomerBuyIt,
                               AvaliableProductsInShop avaliableProducts) {
        this.information = information;
        this.canCustomerBuyIt = canCustomerBuyIt;
        this.avaliableProducts = avaliableProducts;
    }

    public SellingDto process(final BuyRequest buyRequest) {
        boolean isValid = canCustomerBuyIt.isProductValiable(avaliableProducts.getAvaliableProducts(),
                buyRequest.getProductName(), buyRequest.getAmountOfMoney());
        if(isValid){
            String info = information.inform(buyRequest.getUser(), buyRequest.getProductName(), true);
            return new SellingDto(buyRequest.getUser(), true, info);
        } else {
            String info = information.inform(buyRequest.getUser(), buyRequest.getProductName(), false);
            return new SellingDto(buyRequest.getUser(), false, info);
        }
    }
}
