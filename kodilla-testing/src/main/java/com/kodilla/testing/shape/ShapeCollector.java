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
        Shape temporary = null;
        if((n >= 0) && (n < shapesCollection.size()))
        {
            temporary = shapesCollection.get(n);
        }
        else
        {
            System.out.println("Zla wartosc argumentu");
        }
        return temporary;
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
