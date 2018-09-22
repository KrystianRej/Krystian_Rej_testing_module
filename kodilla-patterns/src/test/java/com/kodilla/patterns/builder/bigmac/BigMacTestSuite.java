package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testBigMacBuilder() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                            .bun("pszenna")
                            .burgers(10)
                            .sauce("1000 wysp")
                            .ingredients("bekon")
                            .ingredients("krewetki")
                            .build();
        System.out.println(bigMac);
        //When
        int howManyIngredients = bigMac.getIngredients().size();
        //Then
        Assert.assertEquals(2, howManyIngredients);
        Assert.assertEquals("1000 wysp", bigMac.getSauce());
        Assert.assertEquals("pszenna", bigMac.getBun());
        Assert.assertEquals(10, bigMac.getBurgers());
    }
}
