package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapesCollection = new ArrayList<Shape>();

    public void addFigure(Shape shape)
    {
        shapesCollection.add(shape);
    }
    public void removeFigure(Shape shape)
    {
        shapesCollection.remove(shape);
    }
    public Shape getFigure(int n)
    {
        return shapesCollection.get(n);
    }
    public String showFigures()
    {
        String temporaryNames = "";
        for(Shape temporaryShape: shapesCollection)
        {
            temporaryNames = temporaryNames + temporaryShape.getShapeName();
        }
        return temporaryNames;
    }

    public List<Shape> getShapesCollection() {
        return shapesCollection;
    }
}
