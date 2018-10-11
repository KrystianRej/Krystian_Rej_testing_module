package com.kodilla.good.patterns.challenges.loty;

import java.util.HashSet;
import java.util.Set;

public class Airport {
    private Timetable timetable;
    private FlightsFrom flightsFrom;
    private FlightsTo flightsTo;
    private ConnectingFlights connectingFlights;
    private final Set<String> schedule;

    public Airport(Timetable timetable, FlightsFrom flightsFrom, FlightsTo flightsTo, ConnectingFlights connectingFlights) {
        this.timetable = timetable;
        this.flightsFrom = flightsFrom;
        this.flightsTo = flightsTo;
        this.connectingFlights = connectingFlights;
        this.schedule = timetable.reciveTimetable();
    }

    public ConnectingFlights getConnectingFlights() {
        return connectingFlights;
    }

    public FlightsTo getFlightsTo() {
        return flightsTo;
    }

    public FlightsFrom getFlightsFrom() {
        return flightsFrom;
    }

    public Set<String> getSchedule() {
        return new HashSet<>(schedule);
    }
}
