package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "Shopping Task";
    public static final String PAINTING = "Painting Task";
    public static final String DRIVING = "Driving Task";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Buying", "Bananas", 2);
            case PAINTING:
                return new PaintingTask("Painting", "Wall", "Blue");
            case DRIVING:
                return new DrivingTask("Driving", "To Work", "Car");
            default:
                return null;
        }
    }
}
