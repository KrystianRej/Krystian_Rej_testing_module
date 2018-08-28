package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        int[] table = {1,15,42,35,11};

        double expectedResult =  104;

        double result = ArrayOperations.getAverage(table);



        Assert.assertEquals(expectedResult, result,0);
    }
}
