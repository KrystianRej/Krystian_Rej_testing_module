package com.kodilla.good.patterns.challenges;

public class InformationService implements Information {
    @Override
    public String inform(User user, String product, boolean isValid){
        if(isValid){
            return product + " for: " + user + " will be send soon";
        } else {
            return product + " for: " + user + " can not be bought";
        }
    }
}
