package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBook(){
        Library newLibrary = new Library("Biblioteka AGH");
        IntStream.iterate(1,  n -> n + 1)
                .limit(5)
                .forEach(n -> newLibrary.getBooks().add(new Book("Maszyny kontra czlowiek " + n,
                        "Artur Grottger", LocalDate.of(1996 + n,5,3))));

        Library shallowCopyLibrary = null;
        try {
            shallowCopyLibrary = newLibrary.shallowCopy();
            shallowCopyLibrary.setName("Bibliotega AGH po remoncie");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCopyLibrary = null;
        try{
            deepCopyLibrary = newLibrary.deepCopy();
            deepCopyLibrary.setName("Biblioteka AGH po dokładnym remoncie");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        Book newBook = new Book("Maszyny kontra czlowiek " + 1, "Artur Grottger", LocalDate.of(1996 + 1,5,3));
        newLibrary.getBooks().remove(newBook);

        Assert.assertEquals(4 ,newLibrary.getBooks().size());
        Assert.assertEquals(4 ,shallowCopyLibrary.getBooks().size());
        Assert.assertEquals(5 ,deepCopyLibrary.getBooks().size());
    }
}
