package com.kodilla.testing.testingRozmowa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(int[] A){
        Arrays.sort(A);
        int result = 1 ;
        Set<Integer> newSet = new HashSet<>();
        for(int i: A){
            newSet.add(i);
        }
        while(newSet.contains(result)){
            result++;
        }
        /*for(int i: A){
            if(i == result){
                result++;
            }
        }*/
        return result;
    }
}
