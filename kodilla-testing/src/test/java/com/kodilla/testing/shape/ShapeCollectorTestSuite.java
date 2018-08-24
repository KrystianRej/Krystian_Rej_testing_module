package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTestts(){
        System.out.println("This is the beginning of tests)");
    }
    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished");
    }
    @Before
    public void beforeEveryTest()
    {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure()
    {
        //Given
        ShapeCollector newCollector = new ShapeCollector();
        Square square = new Square(5);
        //When
        newCollector.addFigure(square);
        //Then
        Assert.assertEquals(1,newCollector.getShapesCollection().size());
    }
    @Test
    public void testRemoveFigure()
    {
        //Given
        ShapeCollector newCollector = new ShapeCollector();
        Square square = new Square(5);
        //When
        newCollector.addFigure(square);
        newCollector.removeFigure(square);
        //Then
        Assert.assertEquals(0,newCollector.getShapesCollection().size());

    }
    @Test
    public void testShowFigures()
    {
        //Given
        ShapeCollector newCollector = new ShapeCollector();
        Square square = new Square(5);
        Circle circle = new Circle(6);
        Triangle triangle = new Triangle(3,8);
        //When
        newCollector.addFigure(square);
        newCollector.addFigure(circle);
        newCollector.addFigure(triangle);
        String namesFromCollection = newCollector.showFigures();
        String shapesNames = "";
        for(Shape temporary: newCollector.getShapesCollection())
        {
            shapesNames =shapesNames + temporary.getShapeName();
        }
        //Then
        Assert.assertEquals("squarecircletriangle", namesFromCollection);

    }
    @Test
    public void testGetFigure()
    {
        //Given
        ShapeCollector newCollector = new ShapeCollector();
        Square square = new Square(5);
        Circle circle = new Circle(6);
        Triangle triangle = new Triangle(3,8);
        //When
        newCollector.addFigure(square);
        newCollector.addFigure(circle);
        newCollector.addFigure(triangle);
        Shape shape = newCollector.getFigure(1);
        //Then
        Assert.assertEquals(circle,shape);

    }


}
