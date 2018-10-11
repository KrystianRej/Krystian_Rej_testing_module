package com.kodilla.good.patterns.challenges.loty;

import java.util.Set;
import java.util.stream.Collectors;

public class ReciveConnectingFlights implements ConnectingFlights {
    @Override
    public String connetingFlights(Set<String> timetable, String startingCity, String interchangeCity, String endingCity) {
        String result;
        if(timetable.toString().contains(startingCity) && timetable.toString().contains(interchangeCity) && timetable.toString().contains(endingCity)) {

            result = timetable.stream()
                    .filter(n -> (n.startsWith(startingCity) && n.endsWith(interchangeCity)))
                    .collect(Collectors.joining("", "Istnieje taki lot:", ""));
            result = result + timetable.stream()
                    .filter(n -> n.startsWith(interchangeCity) && n.endsWith(endingCity))
                    .map(n -> n.substring(interchangeCity.length(), n.length()))
                    .collect(Collectors.joining("", "", "."));
        } else {
            result = "BRAK POLACZENIA";
        }
        return result;
    }
}
