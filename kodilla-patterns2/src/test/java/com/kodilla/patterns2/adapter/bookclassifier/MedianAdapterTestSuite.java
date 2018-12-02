package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("Jonas", "Twardy jak skala", 1996, "1A2C");
        Book book2 = new Book("Kowalski", "Mroz", 1992, "1A1C");
        Book book3 = new Book("Stanley", "Kroniki Wichrogrodu", 1989, "1A3C");
        Book book4 = new Book("Kubica", "Wszystko o F1", 2005, "1A4C");
        Book book5 = new Book("Kwiatkowska", "Kwiatki i slowa", 1993, "1A5C");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        MedianAdapter adapter = new MedianAdapter();
        //When
        int medianPublicationYear = adapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(1993, medianPublicationYear);
    }
}
