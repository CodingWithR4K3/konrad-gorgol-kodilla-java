package com.kodilla.testing.shape;

 class Circle implements Shape {

     private final String shapeName;
     private final double field;


     public Circle(double radius) {
         this.shapeName = "circle";
         this.field = Math.PI * radius * radius;

     }

     public String getShapeName() {
         return shapeName;
     }

    public double getField(){
        return this.field;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }
}