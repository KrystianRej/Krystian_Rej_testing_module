package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final List<Country> countries = new ArrayList<>();

    public void addCountryToContinent(Country country){
        countries.add(country);
    }

    public List<Country> getCountries() {
        return countries;
    }
}
