package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        Country poland = new Country(new BigDecimal("36000000"));
        Country france = new Country(new BigDecimal("89600564"));
        Country germany = new Country(new BigDecimal("66550231"));
        Country zimbabwe = new Country(new BigDecimal("12635789"));
        Country nigeria = new Country(new BigDecimal("13454236"));
        Country egypt = new Country(new BigDecimal("45631785"));
        Country china = new Country(new BigDecimal("998456897"));
        Country japan = new Country(new BigDecimal("64523456"));
        Country nepal = new Country(new BigDecimal("4568457"));

        Continent europe = new Continent();
        europe.addCountryToContinent(poland);
        europe.addCountryToContinent(france);
        europe.addCountryToContinent(germany);

        Continent africa = new Continent();
        africa.addCountryToContinent(zimbabwe);
        africa.addCountryToContinent(nigeria);
        africa.addCountryToContinent(egypt);

        Continent asia = new Continent();
        asia.addCountryToContinent(china);
        asia.addCountryToContinent(japan);
        asia.addCountryToContinent(nepal);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(asia);

        BigDecimal totalNumberOfPeople = world.getPeopleQuantity();
        BigDecimal expectedNumberOfPeople = new BigDecimal("1331421415");

        //Then
        Assert.assertEquals(expectedNumberOfPeople, totalNumberOfPeople);

    }
}
