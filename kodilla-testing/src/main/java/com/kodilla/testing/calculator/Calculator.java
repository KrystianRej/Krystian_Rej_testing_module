package com.kodilla.testing.calculator;

public class Calculator {
    private double x;
    private double y;
    public Calculator(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public double add()
    {
        double v = this.x + this.y;
        return v;
    }
    public double substract()
    {
        double z = this.x - this.y;
        return z;
    }

}

