package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private final String shapeName;
    private final double field;

    public Triangle(double sideLength, double height) {
        this.shapeName = "triangle";
        this.field = sideLength * height * 0.5;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return field;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }
}
