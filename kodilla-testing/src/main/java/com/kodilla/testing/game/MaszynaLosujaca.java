package com.kodilla.testing.game;

import java.util.Set;

public class MaszynaLosujaca {

    private DataBase database;

    public MaszynaLosujaca(DataBase database) {
        this.database = database;
    }

    public int miniLotto(Set<Integer> numbers) {
        Set<Integer> randomNumbers = database.wylosuj(5);
        int count = 0;
        for(Integer number: randomNumbers) {
            if(numbers.contains(number)) {
                count++;
            }
        }
        return count;
    }
}
