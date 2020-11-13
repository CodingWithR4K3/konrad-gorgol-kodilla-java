package com.kodilla.testing.shape;

import java.util.ArrayList;

public final class ShapeCollector {


    private final ArrayList<Shape> shapeList;

    public ShapeCollector(ArrayList<Shape> shapeList) {
        this.shapeList = shapeList;
    }

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapeList.remove(shape);
    }

    public Shape getFigure(int index) {
        if (index < shapeList.size() && index >= 0) {
            return shapeList.get(index);
        } else {
            return null;
        }
    }


    public ArrayList<Shape> showFigures() {
        for (Shape figures : shapeList) {
            System.out.println(figures);
        }
        return shapeList;
    }

    @Override
    public String toString() {
        return "ShapeCollector{" +
                "shapeList=" + shapeList +
                '}';
    }

    public ArrayList<Shape> getShapeList() {
        return shapeList;
    }
}