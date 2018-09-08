package com.kodilla.good.patterns.challenges.Food2Door;

import org.junit.Assert;
import org.junit.Test;

public class Food2DoorTestSuite {
    @Test
    public void testExtraFoodShop(){
        Shop shop = new Shop("Lewiatan", "Jajka", 500);
        Producent producent = new ExtraFoodShop(new ExtraFoodShopProducts(), new ValidateOrder());

        String orderInfo = producent.infoAboutOrder(producent.process(shop));

        Assert.assertEquals( "Zamowienie zostaje zrealizowane w sklepie: " + "Lewiatan"
                + " na produkt: " + "Jajka" + " w ilosi: " + 500, orderInfo);
    }
    @Test
    public void testHealthyShop(){
        Shop shop = new Shop("Lewiatan", "Jajka", 500);
        Producent producent = new ExtraFoodShop(new HealthyShopProducts(), new ValidateOrder());

        String orderInfo = producent.infoAboutOrder(producent.process(shop));

        Assert.assertEquals( "Zamowienie zostaje zrealizowane w sklepie: " + "Lewiatan"
                + " na produkt: " + "Jajka" + " w ilosi: " + 500, orderInfo);
    }
    @Test
    public void testGlutenFreeShop(){
        Shop shop = new Shop("HPGlutenFree", "Jajka Bez Glutenu", 500);
        Producent producent = new GlutenFreeShop(new GlutenFreeShopProducts(), new ValidateOrder());

        String orderInfo = producent.infoAboutOrder(producent.process(shop));

        Assert.assertEquals( "Zamowienie zostaje zrealizowane w sklepie: " + "HPGlutenFree"
                + " na produkt: " + "Jajka Bez Glutenu" + " w ilosi: " + 500, orderInfo);
    }
}
