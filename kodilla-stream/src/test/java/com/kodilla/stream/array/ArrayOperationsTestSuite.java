package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] table = {1,15,42,35,11};

        //When
        double expectedResult =  20.8;
        double result = ArrayOperations.getAverage(table);

        //Then
        Assert.assertEquals(expectedResult, result,0);
    }
}
