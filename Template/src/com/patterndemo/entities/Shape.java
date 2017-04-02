package com.patterndemo.entities;

public abstract class Shape {

    public void displayShapeInfo(Shape shape){
        System.out.println("El perimetro del " + shape.getClass().getSimpleName() + " es de: " + Double.toString(getShapePerimeter()));
        System.out.println("El area del " + shape.getClass().getSimpleName() + " es de: " + Double.toString(getShapeArea()));
    }

    public abstract double getShapeArea();
    public  abstract double getShapePerimeter();
}
