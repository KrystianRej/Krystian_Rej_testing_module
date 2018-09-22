package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task chooseTask(final String task) {
        switch(task) {
            case SHOPPINGTASK:
                return new ShoppingTask("Shopping", "Apple", 10);
            case PAINTINGTASK:
                return new PaintingTask("Painting", "white", "wall");
            case DRIVINGTASK:
                return new DrivingTask("Driving", "Krakow", "Car");
            default:
                return null;
        }
    }
}
