package com.kodilla.exception.test;

import com.kodilla.exception.io.FileReader;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    public String findFlight(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> airportMap = new HashMap<>();
        airportMap.put("Krakow airport", true);
        airportMap.put("Warsaw airport", true);
        airportMap.put("Poznan airport", true);
        airportMap.put("Katowice airport", true);
        airportMap.put("Gdansk airport", true);
        airportMap.put("Sopot airport", false);

        if(airportMap.containsKey(flight.getArrivalAirport())
                && (airportMap.get(flight.getArrivalAirport()) == true)){
            return "There is a flight to:"
                    + flight.getArrivalAirport() + " and it is open";
        } else {
            throw new RouteNotFoundException("There is no such airport " +
                    "or the airport is closed");
        }

    }

    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearch();
        Flight newFlight = new Flight("Barcelona airport", "Wroclaw airport");
        try {
            System.out.println(flightSearch.findFlight(newFlight));
        } catch(RouteNotFoundException e) {

            System.out.println(e.getMessage());
        }
    }
}
