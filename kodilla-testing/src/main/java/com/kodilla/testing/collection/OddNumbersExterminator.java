package com.kodilla.testing.collection;

import java.util.*;
public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers)
    {
        ArrayList<Integer>  temporaryList = new ArrayList<Integer>();

            for (Integer temporary : numbers)
            {
                if (temporary % 2 == 0)
                {
                    temporaryList.add(temporary);
                }
            }
        return temporaryList;
    }
}
