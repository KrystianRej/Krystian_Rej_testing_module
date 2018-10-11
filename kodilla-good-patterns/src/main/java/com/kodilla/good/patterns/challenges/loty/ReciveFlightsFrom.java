package com.kodilla.good.patterns.challenges.loty;

import java.util.Set;
import java.util.stream.Collectors;

public class ReciveFlightsFrom implements FlightsFrom{
    @Override
    public Set<String> flightsFrom(Set<String> timetable, String city) {
        Set<String> resultSet = timetable.stream()
                .filter(n -> n.startsWith(city))
                .collect(Collectors.toSet());

        if(resultSet.isEmpty()) {
            resultSet.add("BRAK LOTOW");
        }
        return resultSet;
    }
}
