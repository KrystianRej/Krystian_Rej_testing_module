package com.kodilla.good.patterns.challenges.loty;

import java.util.Set;
import java.util.stream.Collectors;

public class ReciveFlightsTo implements FlightsTo {
    @Override
    public Set<String> flightsTo(Set<String> timetable, String city) {
        Set<String> resultSet = timetable.stream()
                .filter(n -> n.endsWith(city))
                .collect(Collectors.toSet());
        if(resultSet.isEmpty()) {
            resultSet.add("BRAK LOTOW");
        }
        return resultSet;
    }
}
