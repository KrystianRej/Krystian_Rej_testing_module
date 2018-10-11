package com.kodilla.good.patterns.challenges.loty;

import java.util.Set;

public interface FlightsTo {
    Set<String> flightsTo(Set<String> timetable, String city);
}
