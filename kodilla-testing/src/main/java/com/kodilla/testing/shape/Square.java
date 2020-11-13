package com.kodilla.testing.shape;

public class Square implements Shape {

    private final String shapeName;
    private final double field;

    public Square(double sideLength) {
        this.shapeName = "square";
        this.field = sideLength * sideLength;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return field;
    }


    @Override
    public String toString() {
        return "Square{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }
}
