package com.kodilla.good.patterns.challenges.loty;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ReciveConnectingFlights implements ConnectingFlights {
    @Override
    public Set<String> connetingFlights(Set<String> timetable, String startingCity, String endingCity) {
        final Set<String>  startingIndexSet;
        final Set<String> endingIndexSet;
        final Set<String> finishedSet = new HashSet<>();
        Set<String> endingSet = new HashSet<>();
        if(timetable.toString().contains(startingCity) && timetable.toString().contains(endingCity)) {

            startingIndexSet = timetable.stream()
                    .filter(n -> n.startsWith(startingCity))
                    .map(n -> n.substring(startingCity.length() + 2))
                    .collect(Collectors.toSet());
            endingIndexSet = timetable.stream()
                    .filter(n -> (n.endsWith(endingCity)))
                    .map(n -> n.substring(0, n.length() - (endingCity.length() + 2)))
                    .collect(Collectors.toSet());
            for(String start: startingIndexSet){
                if(endingIndexSet.contains(start)){
                    finishedSet.add(start);
                }
            }
            if(!finishedSet.isEmpty()) {
                endingSet = finishedSet.stream()
                        .map(n -> "Istnieje taki lot:" + startingCity + "->" + n + "->" + endingCity)
                        .collect(Collectors.toSet());
            } else {
                endingSet.add("BRAK POLACZENIA");
            }



        } else {
            endingSet.add("BRAK TAKIEGO POLACZENIA");
        }
        return endingSet;
    }
}
