package com.kodilla.game;

import com.kodilla.testing.game.DataBase;
import com.kodilla.testing.game.MaszynaLosujaca;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DataBaseTestSuite {
    @Test
    public void testDataBase(){
        DataBase database = mock(DataBase.class);
        Set<Integer> randomNumbers = new HashSet<>();
        randomNumbers.add(5);
        randomNumbers.add(4);
        randomNumbers.add(12);
        randomNumbers.add(9);
        randomNumbers.add(7);

        when(database.wylosuj(5)).thenReturn(randomNumbers);

        MaszynaLosujaca maszynaLosujaca = new MaszynaLosujaca(database);

        Set<Integer> userNumbers = new HashSet<>();
        userNumbers.add(5);
        userNumbers.add(4);
        userNumbers.add(13);
        userNumbers.add(10);
        userNumbers.add(7);

        int result = maszynaLosujaca.miniLotto(userNumbers);

        Assert.assertEquals(3, result);
    }
}
