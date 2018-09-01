package com.kodilla.good.patterns.challenges;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.stream.Collectors;

public class MovieStoreTestSuite {
    @Test
    public void testMovieStoreTitlesPrintingWithExclamationMarks(){
        //Given
        MovieStore movieStore = new MovieStore();
        //When
        String allMovieTitlesWithExclamationMarks = movieStore.getMovies()
                .values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.joining("!","",""));
        System.out.println(allMovieTitlesWithExclamationMarks);
        //Then
        Assert.assertEquals("Żelazny Człowiek!Iron Man!Mściciele!Avengers!Błyskawica!Flash"
                , allMovieTitlesWithExclamationMarks);
    }
}
