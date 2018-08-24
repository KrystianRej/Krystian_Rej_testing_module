package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private double x;

    public Square(int x) {
        this.x = x;
    }

    @Override
    public String getShapeName() {
        return "square";
    }

    @Override
    public double getField() {
        return x*x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.x, x) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x);
    }
}
