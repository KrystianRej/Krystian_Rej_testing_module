package com.kodilla.good.patterns.challenges;

public final class User {
    private final String name;
    private final String surName;

    public User(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    @Override
    public String toString() {
        return  name + " " + surName;
    }
}
