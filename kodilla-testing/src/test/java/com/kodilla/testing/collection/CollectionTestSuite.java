package com.kodilla.testing.collection;

import java.util.*;
//Dlaczego podkreśla mi linijkę poniżej i jest ona na szaro ?
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

public class CollectionTestSuite {
    @Before
    public void before()
    {
        System.out.println("Test Case: begin");
    }
    @After
    public void after()
    {
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList()
    {
        //Given
        OddNumbersExterminator newExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> newList= new ArrayList<Integer>();
        ArrayList<Integer> resultList = newExterminator.exterminate(newList);
        System.out.println("Testing how empty list works");
        //Then
        Assert.assertEquals(0, resultList.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList()
    {

        //Given
        OddNumbersExterminator newExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> newList= new ArrayList<Integer>();
        newList.add(2);
        newList.add(3);
        newList.add(5);
        newList.add(6);
        ArrayList<Integer> resultList = newExterminator.exterminate(newList);
        ArrayList<Integer> correctList = new ArrayList<Integer>();
        correctList.add(2);
        correctList.add(6);
        System.out.println("Testing how list with odd and even numbers works");
        //Then
        Assert.assertEquals(correctList, resultList);
    }


}
