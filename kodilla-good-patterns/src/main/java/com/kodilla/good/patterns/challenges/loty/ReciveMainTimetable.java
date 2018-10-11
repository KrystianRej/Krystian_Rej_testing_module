package com.kodilla.good.patterns.challenges.loty;

import java.util.HashSet;
import java.util.Set;

public final class ReciveMainTimetable implements Timetable {
    @Override
    public final Set<String> reciveTimetable() {
        Set<String> timetable = new HashSet<>();
        timetable.add("KRAKOW->WROCLAW");
        timetable.add("KRAKOW->GDANSK");
        timetable.add("WROCLAW->KRAKOW");
        timetable.add("WROCLAW->GDANSK");
        timetable.add("GDANSK->KRAKOW");
        timetable.add("GDANSK->WROCLAW");
        return new HashSet<>(timetable);
    }
}
