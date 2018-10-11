package com.kodilla.good.patterns.challenges.loty;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class AirPortTestSuite {
    @Test
    public void testFlightsFrom(){
        Airport airport = new Airport(new ReciveMainTimetable(), new ReciveFlightsFrom(), new ReciveFlightsTo(), new ReciveConnectingFlights());
        Set<String> result = airport.getFlightsFrom().flightsFrom(airport.getSchedule(), "KRAKOW");

        Set<String> timetable = new HashSet<>();
        timetable.add("KRAKOW->WROCLAW");
        timetable.add("KRAKOW->GDANSK");

        Assert.assertEquals(timetable, result);
    }
    @Test
    public void testFlightsTo(){
        Airport airport = new Airport(new ReciveMainTimetable(), new ReciveFlightsFrom(), new ReciveFlightsTo(), new ReciveConnectingFlights());
        Set<String> result = airport.getFlightsTo().flightsTo(airport.getSchedule(), "KRAKOW");

        Set<String> timetable = new HashSet<>();
        timetable.add("WROCLAW->KRAKOW");
        timetable.add("GDANSK->KRAKOW");

        Assert.assertEquals(timetable, result);
    }
    @Test
    public void testConnectingFlights(){
        Airport airport = new Airport(new ReciveMainTimetable(), new ReciveFlightsFrom(), new ReciveFlightsTo(), new ReciveConnectingFlights());
        String result = airport.getConnectingFlights().connetingFlights(airport.getSchedule(), "KRAKOW", "WROCLAW", "GDANSK");

        String expected = "Istnieje taki lot:KRAKOW->WROCLAW->GDANSK.";

        Assert.assertEquals(expected, result);
    }
}
