package com.kodilla.testingRozmowa;

import com.kodilla.testing.testingRozmowa.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SoultionTestSuite {
    @Test
    public void testSolution1() {
        Solution newSolution = new Solution();
        int[] lista = new int[]{1, 2, 4, 5};
        int result = newSolution.solution(lista);

        Assert.assertEquals(3, result);
    }
    @Test
    public void testSolution2() {
        Solution newSolution = new Solution();
        int[] lista2 = new int[] {1, 4, 8, 3, 2};
        int result = newSolution.solution(lista2);

        Assert.assertEquals(5, result);
    }
    @Test
    public void testSolution3() {
        Solution newSolution = new Solution();
        int[] lista3 = new int[] {-3, -1};
        int result = newSolution.solution(lista3);

        Assert.assertEquals(1, result);
    }
    @Test
    public void testSolution4() {
        Solution newSolution = new Solution();
        int[] lista4 = new int[] {1, 3, 6, 4, 1, 2};
        int result = newSolution.solution(lista4);

        Assert.assertEquals(5, result);
    }

}
